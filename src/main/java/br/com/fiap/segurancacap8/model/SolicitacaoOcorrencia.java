package br.com.fiap.segurancacap8.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_SO")
public class SolicitacaoOcorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "so_seq")
    @SequenceGenerator(name = "so_seq", sequenceName = "seq_id_so", allocationSize = 1)
    @Column(name = "id_so")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "ds_tipo", nullable = false)
    private String tipo;

    @Column(name = "ds_descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_zone", nullable = false)
    private Zone zone;

    @Column(name = "dt_fato", nullable = false)
    private Date dataFato;

    @Column(name = "dt_hora")
    private Date horaFato;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Date getDataFato() {
        return dataFato;
    }

    public void setDataFato(Date dataFato) {
        this.dataFato = dataFato;
    }

    public Date getHoraFato() {
        return horaFato;
    }

    public void setHoraFato(Date horaFato) {
        this.horaFato = horaFato;
    }
}

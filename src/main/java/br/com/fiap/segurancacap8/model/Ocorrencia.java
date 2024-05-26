package br.com.fiap.segurancacap8.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "T_OCORRENCIA")
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ocorrencia_seq")
    @SequenceGenerator(name = "ocorrencia_seq", sequenceName = "seq_id_ocorrencia", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_so", nullable = false)
    private SolicitacaoOcorrencia solicitacaoOcorrencia;

    @Column(name = "ds_status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_zone", nullable = false)
    private Zone zone;

    @ManyToOne
    @JoinColumn(name = "id_team")
    private Team team;

    @Column(name = "dt_service", nullable = false)
    private Date dataServico;

    @Column(name = "dt_end")
    private Date dataFim;

    @Column(name = "ds_resolvido", nullable = false, columnDefinition = "NUMBER DEFAULT 0")
    private int resolvido;

    @Column(name = "ds_observacao")
    private String observacao;

    // Getters and Setters
}


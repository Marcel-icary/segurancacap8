package br.com.fiap.segurancacap8.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "seq_id_user", allocationSize = 1)
    @Column(name = "ID_USER")  // Mapeando o nome da coluna ID_USER
    private Long id;

    @Column(name = "NM_USER", nullable = false)  // Mapeando o nome da coluna NM_USER
    private String name;

    @Column(name = "DS_EMAIL", nullable = false)  // Mapeando o nome da coluna DS_EMAIL
    private String email;

    @Column(name = "DS_SENHA", nullable = false)  // Mapeando o nome da coluna DS_SENHA
    private String password;

    @Column(name = "DS_TELEFONE")  // Mapeando o nome da coluna DS_TELEFONE
    private String phone;

    @Column(name = "DT_CRIACAO", nullable = false)  // Mapeando o nome da coluna DT_CRIACAO
    private Date createdDate;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

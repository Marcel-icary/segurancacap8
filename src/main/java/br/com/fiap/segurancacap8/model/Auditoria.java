package br.com.fiap.segurancacap8.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "T_AUDITORIA")
public class Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "acao", length = 10)
    private String acao;

    @Column(name = "id_team")
    private Long teamId;

    @Column(name = "nm_team", length = 255)
    private String teamName;

    @Column(name = "nm_disponibilidade")
    private int disponibilidade;

    @Column(name = "id_zone")
    private Long zoneId;

    @Column(name = "timestamp_acao", nullable = false, columnDefinition = "TIMESTAMP DEFAULT SYSTIMESTAMP")
    private Timestamp timestampAcao;

    // Getters and Setters
}


package br.com.fiap.segurancacap8.model;

import jakarta.persistence.*;

@Entity
@Table(name = "T_TEAM")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_seq")
    @SequenceGenerator(name = "team_seq", sequenceName = "seq_id_team", allocationSize = 1)
    @Column(name = "id_team")
    private Long id;

    @Column(name = "nm_team", nullable = false)
    private String name;

    @Column(name = "nm_qtd", nullable = false)
    private int quantity;

    @Column(name = "ds_especialidade")
    private String specialty;

    @Column(name = "nm_disponibilidade", nullable = false)
    private int availability = 1;

    @Column(name = "id_zone", nullable = false)
    private int zone = 0;

    // Getters and Setters
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}

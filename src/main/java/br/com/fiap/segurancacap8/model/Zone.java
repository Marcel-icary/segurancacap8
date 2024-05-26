package br.com.fiap.segurancacap8.model;

import jakarta.persistence.*;

@Entity
@Table(name = "T_ZONE")
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zone_seq")
    @SequenceGenerator(name = "zone_seq", sequenceName = "seq_id_zone", allocationSize = 1)
    @Column(name = "id_zone")
    private Long id;

    @Column(name = "nm_zone", nullable = false)
    private String name;

    @Column(name = "ds_categoria", nullable = false)
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

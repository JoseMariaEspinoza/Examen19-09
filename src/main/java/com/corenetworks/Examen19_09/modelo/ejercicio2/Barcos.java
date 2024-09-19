package com.corenetworks.Examen19_09.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "barcos")
public class Barcos {
    @Id
    @Column(name = "matricula", length = 10,nullable = false)
    private String matricula;
    @Column(name = "nombre", length = 40,nullable = false)
    private String nombre;
    @Column(name = "cuota", nullable = false)
    private Double cuota;
    @Column(name = "amarre", nullable = false)
    private Integer amarre;

    @ManyToOne
    @JoinColumn(name = "id_socio", referencedColumnName = "dni", nullable = false,
            foreignKey = @ForeignKey(name = "FK_barcos_socios"))
    private Persona persona;

}

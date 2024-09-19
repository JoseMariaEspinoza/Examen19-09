package com.corenetworks.Examen19_09.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "viajar")
@IdClass(ViajarPk.class)
public class Viajar {

    @Id
    @ManyToOne
    @JoinColumn(name = "dni", nullable = false)
    private Patrones patrones;

    @Id
    @ManyToOne
    @JoinColumn(name = "matricula", nullable = false)
    private Barcos barcos;

    @Column(length = 20, nullable = false)
    private String destino;

    @Column(nullable = false)
    private LocalDate fSalida;

    @Column(nullable = false)
    private LocalTime hSalida;

}

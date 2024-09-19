package com.corenetworks.Examen19_09.modelo.ejercicio2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "patrones")
public class Patrones extends Persona{
    @Column(name = "carnet", length = 10,nullable = false)
    private String carnet;
    @Column(name = "titulo", length = 10,nullable = false)
    private String titulo;
    @Column(name = "hrs_navegadas", nullable = false)
    private Double hrsNavegadas;
}

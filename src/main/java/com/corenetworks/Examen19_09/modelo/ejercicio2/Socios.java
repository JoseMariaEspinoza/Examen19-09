package com.corenetworks.Examen19_09.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "socios")
public class Socios extends Persona{
    @Column(nullable = false)
    private Integer idSocio;
}

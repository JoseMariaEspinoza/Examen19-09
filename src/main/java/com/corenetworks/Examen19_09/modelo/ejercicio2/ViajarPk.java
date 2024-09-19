package com.corenetworks.Examen19_09.modelo.ejercicio2;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class ViajarPk implements Serializable {

    @ManyToOne
    @JoinColumn(name = "dni", nullable = false)
    private Patrones patrones;

    @ManyToOne
    @JoinColumn(name = "matricula", nullable = false)
    private Barcos barcos;

}
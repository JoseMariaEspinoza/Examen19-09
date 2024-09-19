package com.corenetworks.Examen19_09.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component("producto")
public class Producto {
    private String nombre;
    private double precio;
}

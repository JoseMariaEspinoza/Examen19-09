package com.corenetworks.Examen19_09.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "persona")
public class Persona {
    @Id
    @Column(name = "dni", length = 10, nullable = false)
    private String dni;
    @Column(name = "nombre", length = 40, nullable = false)
    private String nombre;
    @Column(name = "direccion", length = 60, nullable = false)
    private String direccion;
    @Column(name = "asociado", length = 40, nullable = false)
    private String asociado;
}

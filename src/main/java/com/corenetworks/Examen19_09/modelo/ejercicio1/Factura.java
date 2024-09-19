package com.corenetworks.Examen19_09.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Factura {
    @Autowired
    @Qualifier("general")
    private IImpuesto impuesto;
    private List<Producto> productos;

    public double calcularTotalFactura(){
        double total=0;
        for(Producto elemento:productos){
            total+= elemento.getPrecio()+impuesto.calcularImpuesto(elemento);
        }
        return total;
    }
}

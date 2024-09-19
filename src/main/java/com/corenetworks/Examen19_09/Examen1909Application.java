package com.corenetworks.Examen19_09;

import com.corenetworks.Examen19_09.modelo.ejercicio1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Examen1909Application implements CommandLineRunner {

	@Autowired
	private Factura f1;

	private IImpuesto reducido = new ivaSuperReducido();

	public static void main(String[] args) {
		SpringApplication.run(Examen1909Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--- Ejercico 1 ---");
		List<Producto> productos = List.of(
				new Producto("camiseta",10.99),
				new Producto("vaqueros",22.99),
				new Producto("sudadera", 25.99));
		f1.setProductos(productos);
		System.out.println("--- Iva General ---");
		System.out.println("Total factura --->" + f1.calcularTotalFactura());
		f1.setImpuesto(reducido);
		System.out.println("--- Iva Super Reducido ---");
		System.out.println("Total factura --->" + f1.calcularTotalFactura());

		System.out.println("--- Ejercico 2 ---");


	}
}

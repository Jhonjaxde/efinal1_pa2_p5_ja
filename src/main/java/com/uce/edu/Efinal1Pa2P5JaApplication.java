package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.SistemaBancario.Repository.Modelo.CuentaBancaria;
import com.uce.edu.SistemaBancario.Repository.Modelo.Propietario;
import com.uce.edu.SistemaBancario.Service.ICuentaBancariaService;
import com.uce.edu.SistemaBancario.Service.IPropiertarioService;
import com.uce.edu.SistemaBancario.Service.ITransferenciaService;

@SpringBootApplication
public class Efinal1Pa2P5JaApplication implements CommandLineRunner {
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IPropiertarioService propiertarioService;
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args)  {
		SpringApplication.run(Efinal1Pa2P5JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//cuentas 
		CuentaBancaria cuentaOrigen = new CuentaBancaria();
		cuentaOrigen.setNumero("12");
		cuentaOrigen.setSaldo(new BigDecimal(100));
		cuentaOrigen.setTipo("ahorros");
		
		CuentaBancaria cuentaDestino = new CuentaBancaria();
		cuentaDestino.setNumero("22");
		cuentaDestino.setSaldo(new BigDecimal(200));
		cuentaDestino.setTipo("Corriente");
		
		//propietarios
		
		Propietario pro1 = new Propietario();
		pro1.setApellido("herminio");
		pro1.setCedula("12312");
		pro1.setNombre("juan");
		
		Propietario pro2 = new Propietario();
		pro2.setApellido("Vermil");
		pro2.setCedula("92834");
		pro2.setNombre("jose");
		
		//relaciones 
		
		cuentaOrigen.setPropietario(pro1);
		pro1.setCuentaBancaria(cuentaOrigen);
		
		cuentaDestino.setPropietario(pro2);
		pro2.setCuentaBancaria(cuentaDestino);
		
		
	//	this.bancariaService.guardar(cuentaOrigen);
		//this.bancariaService.guardar(cuentaDestino);
		
		this.iTransferenciaService.realizar("12", "12312",new BigDecimal(50) );
	}

}

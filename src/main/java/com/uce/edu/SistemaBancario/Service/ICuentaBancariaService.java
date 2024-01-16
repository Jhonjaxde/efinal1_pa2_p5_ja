package com.uce.edu.SistemaBancario.Service;

import com.uce.edu.SistemaBancario.Repository.Modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	public CuentaBancaria buscar(Integer id);
	public void guardar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	
}

package com.uce.edu.SistemaBancario.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.SistemaBancario.Repository.ICuentaBancariaRepository;
import com.uce.edu.SistemaBancario.Repository.Modelo.CuentaBancaria;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;
	
	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepository.seleccionar(id);
	}

	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.eliminar(id);
	}
	
	

}

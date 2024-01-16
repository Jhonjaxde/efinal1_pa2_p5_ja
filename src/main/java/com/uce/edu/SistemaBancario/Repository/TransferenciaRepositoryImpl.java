package com.uce.edu.SistemaBancario.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.SistemaBancario.Repository.Modelo.CuentaBancaria;
import com.uce.edu.SistemaBancario.Repository.Modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;
	@Override
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto) {
		CuentaBancaria cuentaOrigen = this.cuentaBancariaRepository.seleccionarPorNumero(numeroCuentaOrigen);
		CuentaBancaria cuentaDestino = this.cuentaBancariaRepository.seleccionarPorNumero(numeroCuentaDestino);
		if(cuentaOrigen.getSaldo().compareTo(monto)<1) {
			cuentaOrigen.setSaldo(cuentaOrigen.getSaldo().subtract(monto));
			this.cuentaBancariaRepository.actualizar(cuentaOrigen);
			cuentaDestino.setSaldo(cuentaDestino.getSaldo().add(monto));
			this.cuentaBancariaRepository.actualizar(cuentaDestino);
		}	
	}
	
	

}

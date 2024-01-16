package com.uce.edu.SistemaBancario.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.SistemaBancario.Repository.ITransferenciaRepository;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Override
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.realizar(numeroCuentaOrigen, numeroCuentaDestino, monto);
	}

}

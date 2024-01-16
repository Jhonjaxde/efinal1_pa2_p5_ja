package com.uce.edu.SistemaBancario.Repository;

import java.math.BigDecimal;
import java.util.List;

import com.uce.edu.SistemaBancario.Repository.Modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto );
}

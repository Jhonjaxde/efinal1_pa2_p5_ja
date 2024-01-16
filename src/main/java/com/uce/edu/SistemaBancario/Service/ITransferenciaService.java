package com.uce.edu.SistemaBancario.Service;

import java.math.BigDecimal;

public interface ITransferenciaService {
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto );
}

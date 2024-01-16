package com.uce.edu.SistemaBancario.Repository.Modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name= "transferencia")
public class Transferencia {
	@Id
	@GeneratedValue(generator = "seq_transferencia", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_transferencia", sequenceName = "seq_transferencia", allocationSize = 1)
	@Column(name = "trans_id")
	private Integer id;
	@Column(name = "trans_fecha")
	private LocalDateTime fecha;
	@Column(name = "trans_monto")
	private BigDecimal monto;
	@Column(name = "trans_comision")
	private BigDecimal comision;
	@Column(name = "trans_cuentaBancaria")
	private CuentaBancaria cuentaBancaria;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	
	
}

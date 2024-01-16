package com.uce.edu.SistemaBancario.Repository;

import com.uce.edu.SistemaBancario.Repository.Modelo.Propietario;

public interface IPropiertarioRepository {
	public Propietario seleccionar(Integer id);
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void eliminar(Integer id);
}

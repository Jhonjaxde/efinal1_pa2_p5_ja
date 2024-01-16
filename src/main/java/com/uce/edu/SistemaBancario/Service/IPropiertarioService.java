package com.uce.edu.SistemaBancario.Service;

import com.uce.edu.SistemaBancario.Repository.Modelo.Propietario;

public interface IPropiertarioService {
	public Propietario buscar(Integer id);
	public void guardar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void borrar(Integer id);
}

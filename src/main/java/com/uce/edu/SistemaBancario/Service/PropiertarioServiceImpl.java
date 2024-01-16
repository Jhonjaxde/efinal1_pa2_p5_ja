package com.uce.edu.SistemaBancario.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.SistemaBancario.Repository.IPropiertarioRepository;
import com.uce.edu.SistemaBancario.Repository.Modelo.Propietario;
@Service
public class PropiertarioServiceImpl implements IPropiertarioService {
	@Autowired
	private IPropiertarioRepository propiertarioRepository;
	@Override
	public Propietario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.propiertarioRepository.seleccionar(id);
	}

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propiertarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propiertarioRepository.actualizar(propietario);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.propiertarioRepository.eliminar(id);
	}

}

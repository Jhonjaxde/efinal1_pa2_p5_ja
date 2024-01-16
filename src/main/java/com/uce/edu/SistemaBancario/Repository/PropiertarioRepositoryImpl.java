package com.uce.edu.SistemaBancario.Repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.SistemaBancario.Repository.Modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class PropiertarioRepositoryImpl implements IPropiertarioRepository {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Propietario seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, id);
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(propietario);
		}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

}

package com.uce.edu.SistemaBancario.Repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.SistemaBancario.Repository.Modelo.CuentaBancaria;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public CuentaBancaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
		}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

	@Override
	public CuentaBancaria seleccionarPorNumero(String numero) {
		//SELECT c FROM cuentaBancaria c WHERE c.numero =: numero
		TypedQuery<CuentaBancaria> myQuery = this.entityManager.createQuery("SELECT c FROM cuentaBancaria c WHERE c.numero =: numero",CuentaBancaria.class);
		myQuery.setParameter("numero", numero);
		return myQuery.getSingleResult();
	}

}

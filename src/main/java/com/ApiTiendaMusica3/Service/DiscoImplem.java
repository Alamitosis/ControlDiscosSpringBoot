package com.ApiTiendaMusica3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiTiendaMusica3.Service.DiscoService;
import com.ApiTiendaMusica3.Dao.Dao;
import com.ApiTiendaMusica3.Model.Discos;
import com.ApiTiendaMusica3.Model.Discos.discos;

import org.springframework.transaction.annotation.Transactional;

@Service
public class DiscoImplem implements DiscoService{
	@Autowired
	Dao discosDao;
	
	
	@Transactional(readOnly=true)
	@Override
	public List<discos> mostrar() {
		// TODO Auto-generated method stub
		return discosDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(discos disco) {
		// TODO Auto-generated method stub
		discosDao.save(disco);
	}

	@Transactional(readOnly=true)
	@Override
	public void buscar(Long id) {
		// TODO Auto-generated method stub
		discosDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void editar(discos disco) {
		// TODO Auto-generated method stub
		discosDao.save(disco);
	}

	@Transactional
	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		discosDao.deleteById(id);
	}

}

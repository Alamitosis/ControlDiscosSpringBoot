package com.ApiTiendaMusica3.Service;

import java.util.List;

import com.ApiTiendaMusica3.Model.discos;

public interface DiscoService {

	public List<discos> mostrar();
	
	public void guardar(discos disco);
	
	public void buscar(Long id);
	
	public void editar(discos disco);
	
	public void eliminar(Long id);
}

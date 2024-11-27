package com.ApiTiendaMusica3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiTiendaMusica3.Model.Discos;
import com.ApiTiendaMusica3.Model.Discos.discos;
import com.ApiTiendaMusica3.Service.DiscoImplem;

@RestController
@RequestMapping(path="DiscosWebService")
@CrossOrigin
public class DiscosWebService {
	@Autowired
	DiscoImplem imp;
	
	
	//http://localhost:9000/ComidasWebService/guardar
	@GetMapping(path="mostrar")
	public List<discos> mostrar() {
		return imp.mostrar();
	}
	
	@PostMapping(path="guardar")
	public void guardar(@RequestBody discos disco) {
		// TODO Auto-generated method stub
		imp.guardar(disco);
	}

	@PostMapping(path="buscar")
	public void buscar(@RequestBody Long id) {
		// TODO Auto-generated method stub
		imp.buscar(id);
	}

	@PostMapping(path="editar")
	public void editar(@RequestBody discos disco) {
		// TODO Auto-generated method stub
		imp.editar(disco);
	}

	@PostMapping(path="eliminar")
	public void eliminar(@RequestBody Long id) {
		// TODO Auto-generated method stub
		imp.eliminar(id);
	}
}

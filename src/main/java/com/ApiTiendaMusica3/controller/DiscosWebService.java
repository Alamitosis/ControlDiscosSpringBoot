package com.ApiTiendaMusica3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiTiendaMusica3.Model.discos;
import com.ApiTiendaMusica3.Service.DiscoImplem;

@RestController
@RequestMapping(path="DiscosWebService")
@CrossOrigin
public class DiscosWebService {
	@Autowired
	DiscoImplem imp;
	
	
	//http://localhost:9000/DiscosWebService/mostrar
	@GetMapping(path="mostrar")
	public List<discos> mostrar() {
		return imp.mostrar();
	}
	
	//http://localhost:9000/DiscosWebService/guardar
	@PostMapping(path="guardar")
	public void guardar(@RequestBody discos disco) {
		// TODO Auto-generated method stub
		imp.guardar(disco);
	}

	//http://localhost:9000/DiscosWebService/buscar
	@PostMapping(path="buscar")
	public void buscar(@RequestBody Long id) {
		// TODO Auto-generated method stub
		imp.buscar(id);
	}

	//http://localhost:9000/DiscosWebService/editar
	@PostMapping(path="editar")
	public void editar(@RequestBody discos disco) {
		// TODO Auto-generated method stub
		imp.editar(disco);
	}

	//http://localhost:9000/DiscosWebService/eliminar
	@PostMapping(path="eliminar")
	public void eliminar(@RequestBody Long id) {
		// TODO Auto-generated method stub
		imp.eliminar(id);
	}
}

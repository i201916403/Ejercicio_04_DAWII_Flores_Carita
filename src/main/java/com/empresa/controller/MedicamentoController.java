package com.empresa.controller;

import java.util.List;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/medicamento")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicamentoController {

	@Autowired
	private MedicamentoService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>> lista()
	{ 
		List<Medicamento> lista = service.listaMedicamento();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Medicamento> inserta(@RequestBody Medicamento obj)
	{
		Medicamento ObjSalida = service.insertaActualiza(obj);
		return ResponseEntity.ok(ObjSalida);
	}
}

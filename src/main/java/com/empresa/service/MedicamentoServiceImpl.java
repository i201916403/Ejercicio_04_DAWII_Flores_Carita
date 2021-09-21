package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{

	@Autowired
	private MedicamentoRepository repo;
	
	@Override
	public Medicamento insertaActualiza(Medicamento obj) {
		return repo.save(obj);
	}

	@Override
	public List<Medicamento> listaMedicamento() {
		return repo.findAll();
	}

}

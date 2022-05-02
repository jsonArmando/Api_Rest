package com.api.activos.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.activos.rest.model.ActivosModel;
import com.api.activos.rest.repository.ActivosRepository;

@Service
public class ActiveService {

	@Autowired
	ActivosRepository activosRepository;

	public List<ActivosModel> getAllActivos() {
		List<ActivosModel> activos = new ArrayList<ActivosModel>();
		activosRepository.findAll().forEach(activos1 -> activos.add(activos1));
		return activos;
	}

	public ActivosModel getActivosById(int id) {
		return activosRepository.findById(id).get();
	}

	public void saveOrUpdate(ActivosModel activos) {
		activosRepository.save(activos);
	}

	public void delete(int id) {
		activosRepository.deleteById(id);
	}

	public void update(ActivosModel activos, int activosId) {
		activosRepository.save(activos);
	}

}

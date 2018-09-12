package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
//service ???
@Service 
public class CategoriaService {
	
	@Autowired //a dependencia será instanciada autoamticamente pelo mecanismo de injeção de depencia / inversão de controle do Spring
	private  CategoriaRepository rep ;
	
	public Categoria buscar(Integer id)
	{
		Optional< Categoria> cat = rep.findById(id);
		return cat.orElse(null);
	}

}

package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exception.ObjectNotFoundException;

//service ???
@Service 
public class CategoriaService {
	
	@Autowired //a dependencia será instanciada autoamticamente pelo mecanismo de injeção de depencia / inversão de controle do Spring
	private  CategoriaRepository rep ;
	
	public Categoria find(Integer id)
	{
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElseThrow(()-> 
							new ObjectNotFoundException("Objeto não encontrdo Id:" + id +
														 "Tipo: " + Categoria.class.getName() ) );
	}

}

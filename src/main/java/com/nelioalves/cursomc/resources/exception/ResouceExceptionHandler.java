package com.nelioalves.cursomc.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException;
import com.nelioalves.cursomc.services.exception.ObjectNotFoundException;

public class ResouceExceptionHandler {
	
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServerErrorException request )
	{
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), "Não encontrado "+ e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}

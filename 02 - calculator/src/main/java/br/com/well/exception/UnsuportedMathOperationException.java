package br.com.well.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 1L;

	public UnsuportedMathOperationException(String exception) {
		super(exception);
	}
}

package br.com.well.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.well.exception.UnsuportedMathOperationException;
import br.com.well.services.MathService;
import br.com.well.util.Converter;

@RestController
public class MathController {

	private Converter converter  = new Converter();
	
	@Autowired
	private MathService mathService;
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Por favor, defina um valor numérico.");
		}
		return mathService.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Por favor, defina um valor numérico.");
		}
		return mathService.sub(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/divi/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double divi(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Por favor, defina um valor numérico.");
		}
		return mathService.divi(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Por favor, defina um valor numérico.");
		}
		return mathService.mult(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/ave/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double ave(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!converter.isNumeric(numberOne) || !converter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Por favor, defina um valor numérico.");
		}
		return mathService.ave(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/square/{numberOne}", method=RequestMethod.GET)
	public Double square(@PathVariable("numberOne") String numberOne) throws Exception {
		if(!converter.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Por favor, defina um valor numérico.");
		}
		return mathService.square(numberOne);
	}
	
}

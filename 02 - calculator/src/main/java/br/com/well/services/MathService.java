package br.com.well.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.well.util.Converter;

@Service
public class MathService {

	private Converter converter  = new Converter();
	
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		Double sum = converter.convertToDouble(numberOne) + converter.convertToDouble(numberTwo);
		return sum;
	}
	
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		Double sub = converter.convertToDouble(numberOne) - converter.convertToDouble(numberTwo);
		return sub;
	}
	
	public Double divi(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		Double divi = converter.convertToDouble(numberOne) / converter.convertToDouble(numberTwo);
		return divi;
	}
	
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		Double mult = converter.convertToDouble(numberOne) * converter.convertToDouble(numberTwo);
		return mult;
	}
	
	public Double ave(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		Double ave = (converter.convertToDouble(numberOne) + converter.convertToDouble(numberTwo)) / 2;
		return ave;
	}
	
	public Double square(@PathVariable("numberOne") String numberOne) throws Exception {
		Double square = (Double) Math.sqrt(converter.convertToDouble(numberOne));
		return square;
	}
	
}

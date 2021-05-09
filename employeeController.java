package net.codejava;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
public class employeeController {
	@Autowired 
	private employeeService service;
	@GetMapping("/employee")
	public List<employee> list()
	{
		return service.listAll();
	}
	@PostMapping("/products")
	public void add(@RequestBody employee product) {
	    service.save(product);
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<?> update(@RequestBody employee product, @PathVariable Integer id) {
	    try {
	        @SuppressWarnings("unused")
			employee existProduct = service.get(id);
	        service.save(product);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	    
	}
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
}
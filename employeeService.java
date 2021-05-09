package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeService {
	@Autowired
	private employeeRepository repo;

	public List<employee> listAll() {
		return repo.findAll();
		
	}
	
	public void save(employee employee) {
		
		repo.save(employee);
				
	}
	public employee get(Integer id){
		return repo.findById(id).get();
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	
}

package com.Student.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Student.Service.StudentService;
import com.Student.StudentFields.StudentFields;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/savestu")
	public StudentFields stuf(@RequestBody StudentFields sf)
	{
		return ss.save(sf);
	}
	
	
	
	@GetMapping("/get/{id}")
	public  Optional<StudentFields> get (@PathVariable int id)
	{
		return ss.get(id);
	}
	
	
	//this method is used for getting all data in that table
	@GetMapping("/getall")
	public List<StudentFields> getall()
	{
		return ss.getall();
	}
	
	
	//this method is used for name matching with given name
	@GetMapping("/getname/{name}")
	public List<StudentFields> getname(@PathVariable String name)
	{
		return ss.getname(name);
	}
	
	
	//to update data in table 
	@PutMapping("/update")
	public StudentFields update(@RequestBody StudentFields sf)
	{
		return ss.update(sf);
	}
	
	//to delete data in table in data table
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
			return ss.delete(id);

	}
}

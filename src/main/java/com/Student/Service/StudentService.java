package com.Student.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Student.Repo.StudentRepository;
import com.Student.StudentFields.StudentFields;



@Service
public class StudentService {
	
	@Autowired
	StudentRepository srepo;
	
	public StudentFields save(StudentFields sf)
	{
		return srepo.save(sf);
		
	}
	
	public Optional<StudentFields> get(int id)
	{
		return srepo.findById(id);
	}
	
	public List<StudentFields> getall()
	{
		return srepo.findAll();
	}
	
	
	public List<StudentFields> getname(String name)
	{
		return srepo.getByName(name);
	}
	
	
	public StudentFields update(StudentFields sf)
	{
		return srepo.save(sf);
	}
	
	
	public String  delete(int id)
	{
		srepo.deleteById(id);
		return "deleted student details of id " +id;
	}
}

package com.Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.Student.StudentFields.StudentFields;

@Repository
public interface StudentRepository extends JpaRepository<StudentFields, Integer> {
	@Query ("select sf from StudentFields sf where sf.name like %?1%")
	List<StudentFields> getByName(String name);
	
}

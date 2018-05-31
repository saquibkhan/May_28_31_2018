package com.intuit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
	//finder methods
	//findByField
	//findByField1AndField2
	
	@Query("select p from Person p where p.age > :min and p.age < :max")
	List<Person> findPersonsByAgeBetween(@Param("min") int minAge,
			@Param("max")int maxAge);
	
	Person findOneById(int id);
	List<Person> findByIdAndAge(int id, int age);
	List<Person> findByFirstNameAndLastName(String firstName,String lastName);
	List<Person> findById(int id);
	List<Person> findByFirstName(String firstName);
	
	
}

package com.intuit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonsDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Person> getAllPersons(){
		List<Person> persons = jdbcTemplate.query("Select * from persons", new RowMapper<Person>() {

			public Person mapRow(ResultSet rs, int rowNumber) throws SQLException {
				Person person = new Person();
				person.setId(rs.getInt("id"));
				person.setFirstName(rs.getString("first_name"));
				person.setLastName(rs.getString("last_name"));
				person.setAge(rs.getInt("age"));
				return person;
			}
			
		});
		return persons;
	}
	
	public void deletePerson(int id) {
		jdbcTemplate.update("delete from persons where id=?",id);
	}
	public void updateAge(int id, int newAge) {
		jdbcTemplate.update("updat persons set age=? where id=?",newAge,id);
	}
	
	public List<String> getNames(){
		return jdbcTemplate.queryForList("select first_name from persons",String.class);
	}
	public void insert(String firstName,String lastName,int age) {
		jdbcTemplate.update("insert into persons(first_name,last_name,age) values(?,?,?)",
				firstName,lastName,age);
	}
}

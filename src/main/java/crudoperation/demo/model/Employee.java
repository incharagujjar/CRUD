package crudoperation.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

	public Object getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public Object getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public void setFirstName(Object firstName2) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(Object lastName2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
}

	
	
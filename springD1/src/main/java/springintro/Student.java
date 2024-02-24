package springintro;

import org.springframework.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${Student.id}")
	private int id;
	@Value("${Student.Name}")
	private String name ;
	
	private String age;
	
	private Address address; 
	
	private List<String> hobbies;
	
	private Map<String,Integer> marksmap;
	
	private Map<String,Address> addressMap;

	
	

	public Map<String, Address> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, Address> addressMap) {
		this.addressMap = addressMap;
	}

	public int getId() {
		return id;
	}

	public Map<String, Integer> getMarksmap() {
		return marksmap;
	}

	public void setMarksmap(Map<String, Integer> marksmap) {
		this.marksmap = marksmap;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	

	

	public Address getAddress() {
		return address;
	}
	@Qualifier("adr2")
	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int id, String name, String age, Address address) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Student() {
		//default constructor for student
	}



}

package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Person> listOfPeople = new ArrayList<>();
		
		listOfPeople.add(new Person("Emre",30));
		listOfPeople.add(new Person("Yildirim",25));
		listOfPeople.add(new Person("Can",20));

	}
	
}
	
	class Person
	{
	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age=age;
	}
	
	public String toString() {
		
	return name + ":"+age;
	
	}

	
}


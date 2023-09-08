package com.kh.mvc.person.co;

import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonController {
	
	
	private PersonModel personmodel;
	private PersonView personview;
	
	
	
	
	
	public PersonController(PersonModel personmodel, PersonView personview) {
		this.personmodel = personmodel;
		this.personview = personview;
		
	
		
	}
	
	public void setPersonName(String name) {
		personmodel.setName(name);
	}
	

	public String getPersonName() {
		return personmodel.getName();
	}
	

	
	
	
	
	

}

package com.in28minutes.rest.webservices.restful_web_services.versioning;

public class PersonV2 {
	private Name name;

	public PersonV2(Name name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}

//	public PersonV2(String fname, String lname) {
//		this.name=new Name(fname, lname);
//	}
}

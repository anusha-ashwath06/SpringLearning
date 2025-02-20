package com.in28minutes.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.data.jpa.repository.query.EqlParser.New_valueContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Charlie David");
		
	}
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Ram", "sita"));
		//return new PersonV2("Mah", "dev");
	}
    @GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersionOfPersonRequestParameter() {
		return new PersonV1("Charlie David");
	}
    @GetMapping(path = "/person", params = "version=2")
   	public PersonV1 getSecondVersionOfPersonRequestParameter() {
   		return new PersonV1("Charlie David");
   	}
    @GetMapping(path = "/person", headers = "X-API-version=1")
   	public PersonV1 getFirstVersionOfPersonRequestHeader() {
   		return new PersonV1("Charlie David");
   			
   		}
    @GetMapping(path = "/person", headers = "X-API-version=2")
   	public PersonV1 getSecondVersionOfPersonRequestHeader() {
   		return new PersonV1("Charlie David");
   	}
    @GetMapping(path = "/person", produces = "application/vnd.company.app-v1+json")
   	public PersonV1 getFirstVersionOfPersonRequestAccept() {
   		return new PersonV1("Charlie David");
   			
   		}
    @GetMapping(path = "/person", produces = "application/vnd.company.app-v2+json")
   	public PersonV1 getSecondtVersionOfPersonRequestAccept() {
   		return new PersonV1("Charlie David");
   		}


}


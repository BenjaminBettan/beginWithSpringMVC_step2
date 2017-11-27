package com.bbettan.demospringmvc.controller;
 
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbettan.demospringmvc.model.Employee;
import com.bbettan.demospringmvc.model.EmployeeList;
 
@RestController
public class EmployeeRESTController 
{
	private static EmployeeList employeesList = new EmployeeList();
	private static List<Employee> el = employeesList.getEmployees();
	
	//init
	static{
		el.add(new Employee(0,"toto"));
		el.add(new Employee(1,"tata"));
		el.add(new Employee(2,"tutu"));
	}
	
	
    @RequestMapping(value = "/employees", method=RequestMethod.GET)
    public @ResponseBody EmployeeList getAllEmployees() 
    {
        return employeesList;
    }
     
    @RequestMapping(value = "/employees/{id}", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") int id) 
    {
    	
        if ( id <= el.size() - 1   &   id >= 0 ) {
        	
            return new ResponseEntity<Employee>(el.get(id), HttpStatus.OK);
            
        }
        
        return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        
    }
    
}
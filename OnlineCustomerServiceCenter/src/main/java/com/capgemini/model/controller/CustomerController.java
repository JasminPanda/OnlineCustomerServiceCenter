package com.capgemini.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;
=======
import com.capgemini.model.dao.CustomerDao;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.entity.Customer;
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
import com.capgemini.model.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
<<<<<<< HEAD
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/{issueId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<IssueDto> viewIssueById(@PathVariable("issueId") int issueId){
		return customerService.viewIssueById(issueId);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<IssueDto> reOpenIssue(@RequestBody int issue){
		return customerService.reopenIssue(issue);
	}
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<IssueDto>> viewAllIssues(@RequestBody IssueDto issue){
		return customerService.viewAllIssues();
	}
	@GetMapping(value="/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String changePassword(@PathVariable("password") LoginDto login){
		return customerService.changePassword(login);
	}
	@GetMapping(value="/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String forgetPassword(@PathVariable("password") int password){
		return customerService.forgetPassword(password);
	}
	@GetMapping(value="/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<CustomerDto> emailPassword(@PathVariable("email") int email){
		return customerService.emailPassword(email);
	}
}
=======

    @Autowired
    private CustomerService service;
    
    @GetMapping("")
    public List<Customer> selectAll(){
        List<Customer> customerList = dao.findAll();
        return customerList;
    }
    
    @GetMapping("/{id}")
    public List<Customer> getSpecificCustomer(@PathVariable String id){
        return repository.findById(id);
    }
    
    @GetMapping("/search/lastName/{lastName}")
    public List<Customer> searchByLastName(@PathVariable String lastName){
        return repository.findByLasttName(lastName);
    }

    @GetMapping("/search/firstname/{firstname}")
    public List<Customer> searchByFirstName(@PathVariable String firstName){
        return repository.findByFirstName(firstName);
    }
    
    @PostMapping("")
    public void insert(@RequestBody Customer customer) {
        repository.save(customer);
    }

    @PatchMapping("/{id}")
    public void update(@RequestParam IssueDto id, @RequestBody Customer customer) {
        IssueDto oldCustomer = service.viewIssueById(id);
        if(customer.getFirstName() != null) {
            oldCustomer.setFirstName(customer.getFirstName());
        }
        if(customer.getLastName() != null) {
            oldCustomer.setLastName(customer.getLastName());
        }
        repository.save(oldCustomer);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@RequestParam String id) {
        Customer deleteCustomer = repository.findById(id);
        repository.delete(deleteCustomer);
    }
}
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git

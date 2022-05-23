package com.capgemini.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.dao.CustomerDao;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.entity.Customer;
import com.capgemini.model.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

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
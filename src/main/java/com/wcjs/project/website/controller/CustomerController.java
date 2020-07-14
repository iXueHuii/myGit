package com.wcjs.project.website.controller;

import com.wcjs.project.website.model.Customer;
import com.wcjs.project.website.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ws/customer")
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @RequestMapping("/list")
    @ResponseBody
    public Object list(){
        List<Customer> list = service.list();
        return list;
    }
}

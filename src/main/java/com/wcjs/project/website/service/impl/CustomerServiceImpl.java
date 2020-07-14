package com.wcjs.project.website.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcjs.project.website.dao.CustomerMapper;
import com.wcjs.project.website.model.Customer;
import com.wcjs.project.website.service.ICustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper,Customer> implements ICustomerService {
}

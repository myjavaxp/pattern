package com.yibo.dao;

import com.yibo.lsp.Customer;

import java.sql.Connection;

public class VIPCustomerDao extends CustomerDao {
    @Override
    public void AddCustomer(Customer customer) {
        Connection connection = this.getDbUtil().getConnection();
    }
}
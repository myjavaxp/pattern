package com.yibo.dao;

import com.yibo.lsp.Customer;
import com.yibo.utils.DBUtil;

public abstract class CustomerDao {
    private DBUtil dbUtil;

    public void setDbUtil(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    public DBUtil getDbUtil() {
        return dbUtil;
    }

    public abstract void AddCustomer(Customer customer);
}
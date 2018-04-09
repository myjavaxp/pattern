package com.yibo.isp;

import com.yibo.lsp.Customer;

import java.io.InputStream;
import java.util.List;

/**
 * 从文件读取数据
 */
public interface DataHandler {
    List<Customer> dataRead(InputStream inputStream);
}
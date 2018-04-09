package com.yibo;

import com.yibo.lsp.CommonCustomer;
import com.yibo.lsp.Customer;
import com.yibo.lsp.EmailSender;
import com.yibo.lsp.VIPCustomer;
import org.junit.Test;

public class EmailSenderTest {
    @Test
    public void testSendEmail() {
        Customer commonCustomer = new CommonCustomer();
        Customer vipCustomer = new VIPCustomer();
        EmailSender.send(commonCustomer);
        EmailSender.send(vipCustomer);
    }
}
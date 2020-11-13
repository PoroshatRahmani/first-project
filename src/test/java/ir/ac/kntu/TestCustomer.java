package ir.ac.kntu;

import org.junit.Assert;
import org.junit.Test;

public class TestCustomer {
    @Test
    public void getName(){
        Customer customer = new Customer("Poroshat",001);
        Assert.assertEquals("Poroshat",customer.getName());
    }
    @Test
    public void getCode(){
        Customer customer = new Customer("Poroshat",001);
        Assert.assertEquals(001,customer.getCode());
    }
    @Test
    public void set(){
        Customer customer = new Customer();
        customer.setName("Poroshat");
        customer.setCode(111);
        Assert.assertEquals("Poroshat",customer.getName());
        Assert.assertEquals(111,customer.getCode());
    }
}

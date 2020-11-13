package ir.ac.kntu;

import org.junit.Assert;
import org.junit.Test;

public class TestBranch {
    @org.junit.Test
    public void cityName(){
        Branch branch = new Branch(new City(10,20,"tehran"),
                "10",110);
        Assert.assertEquals("tehran",branch.getCity().getName());
    }
    @Test
    public void setCityName(){
        Branch branch = new Branch(new City(10,20,"tehran"),
                "10",110);
        branch.setCity(new City(20,30,"shiraz"));
        Assert.assertEquals("shiraz",branch.getCity().getName());
    }

    @org.junit.Test
    public void numOfEmployee(){
        Branch branch = new Branch(new City(10,20,"tehran"),
                "10",110);
        Assert.assertEquals("10",branch.getNumEmployee());
    }
    @Test
    public void setNumOfEmployee(){
        Branch branch = new Branch(new City(10,20,"tehran"),
                "10",110);
        branch.setNumEmployee("15");
        Assert.assertEquals("15",branch.getNumEmployee());
    }

    @org.junit.Test
    public void branchCode(){
        Branch branch = new Branch(new City(10,20,"tehran"),
                "10",110);
        Assert.assertEquals(110,branch.getCodeBranch());
    }
    @org.junit.Test
    public void setBranchCode(){
        Branch branch = new Branch(new City(10,20,"tehran"),
                "10",110);
        branch.setCodeBranch(111);
        Assert.assertEquals(111,branch.getCodeBranch());
    }
}

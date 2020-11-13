package ir.ac.kntu;

import org.junit.Assert;
import org.junit.Test;

public class TestCity {
    @Test
    public void getCoordinateX(){
        City city = new City(20,15,"Mashhad");
        Assert.assertEquals(20 ,city.getCoordinateX());
    }
    @Test
    public void getCoordinateY(){
        City city = new City(20,15,"Mashhad");
        Assert.assertEquals(15 ,city.getCoordinateY());
    }
    @Test
    public void getName(){
        City city = new City(20,15,"Mashhad");
        Assert.assertEquals("Mashhad" ,city.getName());
    }
    @Test
    public void set(){
        City city = new City();
        city.setCoordinateX(36);
        city.setCoordinateY(56);
        city.setName("Yazd");

        Assert.assertEquals(36,city.getCoordinateX());
        Assert.assertEquals(56,city.getCoordinateY());
        Assert.assertEquals("Yazd",city.getName());
    }
}

package ir.ac.kntu;

import java.util.Scanner;

public class Main {
    public static void create(){
        City city = new City(25,25,"Tehran");
        Menu.addCity(city);
        City city1 = new City(15,35,"Shiraz");
        Menu.addCity(city1);
        City city2 = new City(36,50,"Isfehan");
        Menu.addCity(city2);

        Branch branch = new Branch(city,"10",001);
        Branch branch1 = new Branch(city1,"5",002);
        Branch branch2 = new Branch(city2,"30",003);
        Menu.addBranch(branch);
        Menu.addBranch(branch1);
        Menu.addBranch(branch2);

        Customer customer = new Customer("poroshat",11);
        Customer customer1 = new Customer("negin",22);
        Customer customer2 = new Customer("fateme",33);
        Menu.addCustomer(customer);
        Menu.addCustomer(customer1);
        Menu.addCustomer(customer2);

        Product product = new Product("candle",branch,customer,city,city,100,
                new Date(1398,5,7),new Date(1398,7,3),
                SystemSend.Land,SystemPost.Normal);
        Product product1 = new Product("perfume",branch,customer,city1,city2,10,
                new Date(1398,6,5),new Date(1398,6,10),
                SystemSend.Air,SystemPost.MadeToOrder);
        Product product2 = new Product("watch",branch,customer,city2,city,55,
                new Date(1399,11,12),new Date(1399,12,18),
                SystemSend.Sea,SystemPost.MadeToOrder);
        Menu.addProduct(product);
        Menu.addProduct(product1);
        Menu.addProduct(product2);
    }
    public static void main(String[] args){
        create();
        while (true){
            Menu.printMenu();
            Scanner scn = new Scanner(System.in);
            int choice = scn.nextInt();
            switch (choice){
                case 0 :
                    System.exit(0);
                    break;
                case 1 :
                    Menu.createCity();
                    break;
                case 2 :
                    Menu.createBranch();
                    break;
                case 3 :
                    Menu.createCustomer();
                    break;
                case 4 :
                    if (Menu.getCustomers().size() >= 2 && Menu.getCities().size() >= 2
                    && Menu.getBranches().size() >= 1){
                        Menu.createProduct();
                    }
                    else{
                        System.out.println("please confirm requirements");
                    }
                    break;
                case 5 :
                    Menu.sendProduct();
                    break;
                case 6:
                    Menu.showStatus();
                    break;
                case 7 :
                    Menu.search();
                    break;
                case 8:
                    Menu.filter();
                    break;
                default:
                    break;

            }
        }
    }
}

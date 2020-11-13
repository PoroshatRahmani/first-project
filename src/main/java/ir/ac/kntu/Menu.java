package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Branch> branches = new ArrayList<>();
    private static ArrayList<City> cities = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();

    private static void addCustomer(String name, int code){
        customers.add(new Customer(name,code));
    }
    private static void addBranch(City city, String numEmployee,int codeBranch){
        branches.add(new Branch(city,numEmployee,codeBranch));
    }
    private static void addCity(City city){
        cities.add(city);
    }

    private static void addProduct(Product product){
        products.add(product);
    }

    public static void printMenu(){
        System.out.println("1)City");
        System.out.println("2)Branch");
        System.out.println("3)Customer");
        System.out.println("4)Product");
        System.out.println("5)Send and Receive");
        System.out.println("6)Order tracking");
        System.out.println("7)SearchB");
    }

    public static void createBranch(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter city:");
        for (int i = 0; i < Menu.getCities().size(); i++) {
            System.out.println(i+1 +")"+Menu.getCities().get(i).getName());
        }
        int cityIndex = scn.nextInt();
        cityIndex--;
        City city = cities.get(cityIndex);
        System.out.println("enter number of employee: ");
        String numbEmployee = scn.next();
        System.out.println("enter branch's code: ");
        int codeBranch = scn.nextInt();
        addBranch(city,numbEmployee,codeBranch);
    }

    public static void createCustomer(){
        System.out.println("Enter nameCustomer, code");
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        int code = scn.nextInt();
        addCustomer(name,code);
    }

    public static void createCity(){
        System.out.println("Enter coordinateX, coordinateY, citiesName ");
        Scanner scn = new Scanner(System.in);
        int coordinateX = scn.nextInt();
        int coordinateY = scn.nextInt();
        String name = scn.next();
        addCity(new City(coordinateX,coordinateY,name));
    }

    public static void createProduct(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter product's name: ");
        String name = scn.next();
        System.out.println("Enter receiver's code: ");
        int customerCode = scn.nextInt();
        Customer customer = null;
        for (Customer cus: customers) {
            if (cus.getCode() == customerCode){
                customer = cus;
                break;
            }
        }

        System.out.println("Enter branch's code: ");
        int branchCode = scn.nextInt();
        Branch branch;
        for (Branch  br : branches) {
            if (br.getCodeBranch() == branchCode){
                branch = br;
                break;
            }
        }
        System.out.println("Enter product's weight: ");
        int weight = scn.nextInt();

        System.out.println("Enter send date: ");
        int sDay = scn.nextInt();
        System.out.println("Enter send month: ");
        int sMonth = scn.nextInt();
        System.out.println("Enter send year: ");
        int sYear = scn.nextInt();

        System.out.println("Enter receive date: ");
        int rDay = scn.nextInt();
        System.out.println("Enter receive month: ");
        int rMonth = scn.nextInt();
        System.out.println("Enter receive year: ");
        int rYear = scn.nextInt();

        System.out.println("Enter send system : 1) air\n2) land\n3) sea");
        int s = scn.nextInt();
        SystemSend ss = null;
        switch (s){
            case 1:
                ss = SystemSend.Air;
                break;
            case 2:
                ss = SystemSend.Land;
                break;
            case 3:
                ss = SystemSend.Sea;
                break;
            default:
                break;
        }

        System.out.println("Enter post system : 1) normal\n2) vip");
        int p = scn.nextInt();
        SystemPost sp = null;
        switch (p){
            case 1:
                sp = SystemPost.Normal;
                break;
            case 2:
                sp = SystemPost.MadeToOrder;
                break;
            default:
                break;
        }
        System.out.println("Enter origin city's name: ");
        String cName = scn.next();
        City originCity = null;
        for (City c: cities) {
            if (c.getName().equals(cName)){
                originCity = c;
                break;
            }
        }
        System.out.println("Enter destination city's name: ");
        String cdName = scn.next();
        City destinationCity = null;
        for (City c: cities) {
            if (c.getName().equals(cdName)){
                destinationCity = c;
                break;
            }
        }
        addProduct(new Product(name,customer,originCity,destinationCity,weight,
                new Date(sYear,sMonth,sDay),new Date(rYear,rMonth,rDay),ss,sp));
    }
    public static void sendProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        Date currentDate = new Date(year, month, day);

        for (Product pr:
             products) {
            if (pr.getSendDate().getYear() < currentDate.getYear()){
                pr.setCondition(Condition.Sent);
            } else if (pr.getSendDate().getYear() == currentDate.getYear()) {
                if (pr.getSendDate().getMonth() < currentDate.getMonth()){
                    pr.setCondition(Condition.Sent);
                } else if (pr.getSendDate().getMonth() == currentDate.getMonth()){
                    if (pr.getSendDate().getDay() <= currentDate.getDay()){
                        pr.setCondition(Condition.Sent);
                    }else {
                        pr.setCondition(Condition.Warehouse);
                    }
                }else {
                    pr.setCondition(Condition.Warehouse);
                }
            }else {
                pr.setCondition(Condition.Warehouse);
            }

            if (pr.getReceiveDate().getYear() < currentDate.getYear()){
                pr.setCondition(Condition.Received);
            } else if (pr.getReceiveDate().getYear() == currentDate.getYear()) {
                if (pr.getReceiveDate().getMonth() < currentDate.getMonth()){
                    pr.setCondition(Condition.Received);
                } else if (pr.getReceiveDate().getMonth() == currentDate.getMonth()){
                    if (pr.getReceiveDate().getDay() <= currentDate.getDay()){
                        pr.setCondition(Condition.Received);
                    }
                }
            }
        }
    }
    public static void showStatus(){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i+1 + ")" +products.get(i).getName());
        }
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        index--;
        System.out.println(products.get(index).getCondition());
    }
    public static void search(){
        System.out.println("1) search product");
        System.out.println("2) search customer");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Search search = new Search();
        switch (choice){
            case 1:
                System.out.println("Select first Origin city's number and" +
                        "then destination city's number");
                for (int i = 0; i < Menu.getCities().size(); i++) {
                    System.out.println(i+1 +")"+Menu.getCities().get(i).getName());
                }
                int origin = scanner.nextInt();
                int destination = scanner.nextInt();
                origin--;
                destination--;
                System.out.println(search.searchProduct
                        (Menu.getCities().get(origin), Menu.getCities().get(destination)));
                break;
            case 2:
                System.out.println("Enter customer's name");
                String name = scanner.next();

                System.out.println("Enter customer's code");
                int code = scanner.nextInt();
                System.out.println(search.searchCustomer(name, code));
                break;
        }
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static ArrayList<Branch> getBranches() {
        return branches;
    }

    public static ArrayList<City> getCities() {
        return cities;
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }
}

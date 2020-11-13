package ir.ac.kntu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

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
                default:
                    break;

            }
        }
    }
}

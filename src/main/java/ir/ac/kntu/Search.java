package ir.ac.kntu;

import java.util.ArrayList;

public class Search {
    public Customer searchCustomer(String name ,int code){
        Customer customer = null;
        for (Customer c:
             Menu.getCustomers()) {
            if (c.getCode() == code && c.getName().equals(name)){
                customer = c;
                break;
            }
        }
        return customer;
    }

    public ArrayList<Product> searchProduct(City origin,City destination ){
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < Menu.getProducts().size(); i++) {
            Product product = Menu.getProducts().get(i);
            if (product.getOrigin().equals(origin) && product.getOrigin().equals(destination)){
                products.add(product);
            }
        }
        return products;
    }


}

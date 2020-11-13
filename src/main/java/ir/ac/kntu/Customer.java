package ir.ac.kntu;

import java.util.Objects;

public class Customer {
    private String name;
    private int code;


    public Customer(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public Customer(){

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(code, customer.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

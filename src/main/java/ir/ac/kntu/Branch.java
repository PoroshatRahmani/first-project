package ir.ac.kntu;

import java.util.Objects;

public class Branch {
    private City city;
    private String numEmployee;
    private int codeBranch;

    public Branch(City city, String numEmployee, int codeBranch) {
        this.city = city;
        this.numEmployee = numEmployee;
        this.codeBranch = codeBranch;
    }

    public Branch(){

    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(String numEmployee) {
        this.numEmployee = numEmployee;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "city='" + city + '\'' +
                ", numEmployee='" + numEmployee + '\'' +
                ", codeBranch=" + codeBranch +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return codeBranch == branch.codeBranch &&
                Objects.equals(city, branch.city) &&
                Objects.equals(numEmployee, branch.numEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, numEmployee, codeBranch);
    }

    public int getCodeBranch() {
        return codeBranch;
    }

    public void setCodeBranch(int codeBranch) {
        this.codeBranch = codeBranch;
    }
}

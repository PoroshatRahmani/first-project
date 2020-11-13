package ir.ac.kntu;

import java.util.Objects;

public class City {
    private int coordinateX;
    private int coordinateY;
    private String name;


    public City() {
    }

    public City(int coordinateX, int coordinateY, String name) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.name = name;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }

    public void setName(String citiesName) {
        this.name = citiesName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return getCoordinateX() == city.getCoordinateX() &&
                getCoordinateY() == city.getCoordinateY() &&
                getName().equals(city.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoordinateX(), getCoordinateY(), getName());
    }

    @Override
    public String toString() {
        return "City{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", name='" + name + '\'' +
                '}';
    }
}


package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Model {
        private int id;
        private String name;
        private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return name;
    }

    public void setModel(String model) {
        this.name = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", model='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model1 = (Model) o;
        return id == model1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }
}

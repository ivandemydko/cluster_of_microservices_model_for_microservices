package model.firstmodel;

import lombok.Data;

import javax.persistence.*;

//@Data
@Entity
@Table(name = "first_model")
public class FirstModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    public FirstModel() {
    }
    public FirstModel(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FirstModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

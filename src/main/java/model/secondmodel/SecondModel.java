package model.secondmodel;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "second_model")
public class SecondModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
}
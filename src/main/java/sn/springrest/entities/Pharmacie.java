package sn.springrest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

//mes entites
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pharmacie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 200)
    private String nom;

    @Column(length = 200)
    private String quartier;

    @Column(length = 200)
    private String ville;

    @Column(length = 200)
    private int etat;
}

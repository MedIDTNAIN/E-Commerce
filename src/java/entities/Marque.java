/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author MOHAMED
 */
@Entity
@Table(name = "marque")
public class Marque {

    @Id
    private int id;
    private String nom;
    @OneToMany
    private List<Produit> produits;

    public Marque() {
    }

    public Marque(String nom, List<Produit> produits) {
        this.nom = nom;
        this.produits = produits;
    }

    public Marque(int id, String nom, List<Produit> produits) {
        this.id = id;
        this.nom = nom;
        this.produits = produits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
    
    

}

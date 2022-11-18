/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lachgar
 */
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String designation;
    private double prix;
    private String image;
    private int unite;
    private String description;
    @OneToMany(mappedBy = "produit", fetch = FetchType.EAGER)
    private List<LigneCommande> lcs;
    @ManyToOne(targetEntity = Marque.class)
    private Marque marque;
    @ManyToOne(targetEntity = Categorie.class)
    private Categorie categorie;

    public Produit() {
    }

    public Produit(int id, String nom, String designation, double prix, int unite, String description, Marque marque) {
        this.id = id;
        this.nom = nom;
        this.designation = designation;
        this.prix = prix;
        this.unite = unite;
        this.description = description;
        this.marque = marque;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getUnite() {
        return unite;
    }

    public void setUnite(int unite) {
        this.unite = unite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LigneCommande> getLcs() {
        return lcs;
    }

    public void setLcs(List<LigneCommande> lcs) {
        this.lcs = lcs;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }
    
    
    
}
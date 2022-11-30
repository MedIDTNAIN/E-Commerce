/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author LAASRI MOHAMED
 */
public class Panier extends Produit {
    
    private int qte;

    public Panier() {
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
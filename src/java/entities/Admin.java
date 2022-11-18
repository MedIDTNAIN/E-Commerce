/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author MOHAMED
 */
@Entity
@Table(name = "admin")
public class Admin extends User {

    public Admin() {
    }

    public Admin(String nom, String prenom, String tele, String adresse, String email, String password, String role) {
        super(nom, prenom, tele, adresse, email, password, role);
    }

    public Admin(int id, String nom, String prenom, String tele, String adresse, String email, String password, String role) {
        super(id, nom, prenom, tele, adresse, email, password, role);
    }

    

   
   

    
}

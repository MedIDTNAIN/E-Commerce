/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Categorie;
import entities.Client;
import entities.Marque;
import entities.Produit;
import service.CategorieService;
import service.ClientService;
import service.MarqueService;
import service.ProduitService;
import service.UserService;
import util.HibernateUtil;

/**
 *
 * @author MOHAMED
 */
public class Test {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        //MarqueService ms = new MarqueService();
        //CategorieService cs = new CategorieService();
        ProduitService ps = new ProduitService();
        //ProduitService ps = new ProduitService();
        //cs.create(new Categorie("aiazhz"));
        //ms.create(new Marque("frfj"));
        //ps.create(new Produit("yugyj", "yuyuyu", 130, "image.jpg", 2, "hoi", ms.findById(1), cs.findById(1)));
                ps.create(new Produit("Table", "fsdfsd", 12, "tableee", 1221, "sjcbsjkbccjqcjkcbjkcs", null, null));

        /*for(Produit p : ps.findByCategorie(cs.findById(1))){
            System.out.println(p);
        }*/
    }
    
}

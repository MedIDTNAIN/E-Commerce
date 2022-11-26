/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author LAASRI MOHAMED
 */
public class Panier {
    
    private ArrayList<LignePanier> items = new ArrayList<LignePanier>();
    
    public ArrayList<LignePanier> getItems(){
        return items;
    }
    
    public void setItems(ArrayList<LignePanier> items){
    
        this.items=items;
        
    }
    
    public void addItem(int id,int qte){
        boolean flag = true;
        for(LignePanier lp:items){
            if(lp.getProduit().getId()== id){
                lp.setQte(lp.getQte()+qte);
                flag =false;
                break;
            }
        }
        if(flag){
            Session s = HibernateUtil.getSession();
            Produit pr= (Produit) s.get(Produit.class,id);
            LignePanier lp = new LignePanier(pr,qte);
            items.add(lp);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Client;
import service.ClientService;
import service.UserService;
import util.HibernateUtil;

/**
 *
 * @author MOHAMED
 */
public class Test {
    public static void main(String[] args) {
            HibernateUtil.getSessionFactory().openSession();
    }
    
}

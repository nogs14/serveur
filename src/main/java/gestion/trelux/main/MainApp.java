/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.main;


import gestion.trelux.DAO.ClientHomeImpl;
import gestion.trelux.DAO.PersonneHomeImpl;
import gestion.trelux.utilitaire.SpringClass;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;


/**
 *
 * @author pc
 */
public class MainApp   {
   
//
    public static void main(String args []) throws RemoteException, MalformedURLException{
        
        ApplicationContext context ;
        context=SpringClass.getContext();
        PersonneHomeImpl homePersonne=context.getBean("personneHome",PersonneHomeImpl.class);
        ClientHomeImpl homeClient=context.getBean("clientHome",ClientHomeImpl.class);
        LocateRegistry.createRegistry(1099);
        System.out.println(homePersonne.toString());
        System.out.println(homeClient.toString());
      
        try {
            Naming.rebind("rmi://localhost:1099/homePersonne", homePersonne);
            Naming.rebind("rmi://localhost:1099/homeClient",homeClient);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

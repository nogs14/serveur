/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;


import gestion.trelux.metier.Familleboisson;
import gestion.trelux.services.FamilleBoissonHome;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
public class FamilleboissonHomeImpl extends UnicastRemoteObject implements FamilleBoissonHome{
  
  public  FamilleboissonHomeImpl() throws RemoteException
  {
      super();
  }

    @Override
    public Familleboisson findById(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean inserer(Familleboisson fammilleB) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Familleboisson> listFamilleBoisson() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

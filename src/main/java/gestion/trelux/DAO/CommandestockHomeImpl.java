/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Lignecommandestock;
import gestion.trelux.services.LignecommandestockHome;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author pc
 */
public class CommandestockHomeImpl extends UnicastRemoteObject implements LignecommandestockHome{
    public CommandestockHomeImpl() throws RemoteException
    {
        super();
    }

    @Override
    public Lignecommandestock findById(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean inserer(Lignecommandestock ligneCommande) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lignecommandestock> listLigneCommande() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

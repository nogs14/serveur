/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;


import gestion.trelux.services.DetailsinventaireHome;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class DetailsinventaireHomeImpl extends UnicastRemoteObject implements DetailsinventaireHome{
    public DetailsinventaireHomeImpl() throws RemoteException
    {
        super();
    }

}

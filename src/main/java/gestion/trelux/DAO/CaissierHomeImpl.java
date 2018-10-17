/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.DAO;

import gestion.trelux.metier.Caissier;
import gestion.trelux.services.CaissierHome;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pc
 */
public class CaissierHomeImpl extends UnicastRemoteObject implements CaissierHome{
   public CaissierHomeImpl() throws RemoteException
   {
       super();
   }
    public boolean inserer(Caissier caissier) {
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tr =session.beginTransaction();
                        session.persist(caissier.getEmploye());
			session.persist(caissier);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
   
}

    @Override
    public Caissier findById(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Caissier> listFamilleBoisson() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

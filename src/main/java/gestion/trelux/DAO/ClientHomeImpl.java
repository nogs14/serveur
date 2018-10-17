package gestion.trelux.DAO;
// Generated 26 f�vr. 2018 17:39:09 by Hibernate Tools 4.0.1.Final

import gestion.trelux.metier.Client;
import gestion.trelux.services.ClientHome;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Home object for domain model class Client.
 * @see dao.Client
 * @author Hibernate Tools
 */
public class ClientHomeImpl extends UnicastRemoteObject implements ClientHome{

        public ClientHomeImpl() throws RemoteException
        {
            super();
        }
	  public boolean inserer(Client client) throws RemoteException {
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tr =session.beginTransaction();
                        session.persist(client.getPersonne());
			session.persist(client);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
	}

    @Override
    public Client findById(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> listClient() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

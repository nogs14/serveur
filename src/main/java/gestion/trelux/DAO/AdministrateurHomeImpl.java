/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestion.trelux.DAO;

import gestion.trelux.services.AdministrateurHome;
import gestion.trelux.metier.Administrateur;
import gestion.trelux.utilitaire.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class AdministrateurHomeImpl extends UnicastRemoteObject implements AdministrateurHome {
    public  AdministrateurHomeImpl() throws RemoteException
    {
        super();
        }

    @Override
    public Administrateur findById(String id) throws RemoteException {
         try{
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=session.beginTransaction();
        Administrateur ad=(Administrateur)session.get(Administrateur.class,id);
        tr.commit();
        session.close();
        return ad;
    }
    catch(Exception e){System.out.println("Recherche échouée");return null;}
    }

    @Override
    public boolean inserer(Administrateur administrateur) throws RemoteException {
       try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tr =session.beginTransaction();
			session.persist(administrateur);
			tr.commit();
			session.close();
                        return true;
		} catch (RuntimeException re) {
		
			throw re;
		}
    }

    @Override
    public List<Administrateur> listAdministrateur() throws RemoteException {
     try{
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=session.beginTransaction();
        Query req=session.createQuery("select * from administrateur");
        tr.commit();
        session.close();
        return req.list();
    }
    catch(Exception e){throw e;}
    }

    @Override
    public List<Administrateur> getAdministrateurByMC(String mc) throws RemoteException {
    try{
            Session session=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=session.beginTransaction();
            Query req=session.createQuery("select * from admininstrateur a where a.prenom like :x");
            req.setParameter("x","%"+mc+"%");
            tr.commit();
            session.close();
            return req.list();
        }
        catch(Exception e){System.out.println("Echec");throw e;}
    }

    @Override
    public void deleteAdministrateur(String codeAdmin) throws RemoteException {
        try{
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=session.beginTransaction();
        Administrateur ad=(Administrateur)session.get(Administrateur.class,codeAdmin);
        session.delete(ad);
        tr.commit();
        session.close();
    }
    catch(Exception p){System.out.println("Supression échouée");}
        
    }
    }

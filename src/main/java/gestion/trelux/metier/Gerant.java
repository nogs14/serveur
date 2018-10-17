package gestion.trelux.metier;
// Generated 9 juin 2018 15:00:41 by Hibernate Tools 4.3.1



/**
 * Gerant generated by hbm2java
 */
public class Gerant  implements java.io.Serializable {


     private GerantId id;
     private Boutique boutique;
     private Employe employe;
     private String securegerant;
     private String droit;

    public Gerant() {
    }

	
    public Gerant(GerantId id, Employe employe) {
        this.id = id;
        this.employe = employe;
    }
    public Gerant(GerantId id, Boutique boutique, Employe employe, String securegerant, String droit) {
       this.id = id;
       this.boutique = boutique;
       this.employe = employe;
       this.securegerant = securegerant;
       this.droit = droit;
    }
   
    public GerantId getId() {
        return this.id;
    }
    
    public void setId(GerantId id) {
        this.id = id;
    }
    public Boutique getBoutique() {
        return this.boutique;
    }
    
    public void setBoutique(Boutique boutique) {
        this.boutique = boutique;
    }
    public Employe getEmploye() {
        return this.employe;
    }
    
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    public String getSecuregerant() {
        return this.securegerant;
    }
    
    public void setSecuregerant(String securegerant) {
        this.securegerant = securegerant;
    }
    public String getDroit() {
        return this.droit;
    }
    
    public void setDroit(String droit) {
        this.droit = droit;
    }




}



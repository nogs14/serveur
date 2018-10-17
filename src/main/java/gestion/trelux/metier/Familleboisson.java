package gestion.trelux.metier;
// Generated 9 juin 2018 15:00:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Familleboisson generated by hbm2java
 */
public class Familleboisson  implements java.io.Serializable {


     private String codefamille;
     private String gazeuse;
     private String sucre;
     private String alcool;
     private Set produits = new HashSet(0);

    public Familleboisson() {
    }

	
    public Familleboisson(String codefamille) {
        this.codefamille = codefamille;
    }
    public Familleboisson(String codefamille, String gazeuse, String sucre, String alcool, Set produits) {
       this.codefamille = codefamille;
       this.gazeuse = gazeuse;
       this.sucre = sucre;
       this.alcool = alcool;
       this.produits = produits;
    }
   
    public String getCodefamille() {
        return this.codefamille;
    }
    
    public void setCodefamille(String codefamille) {
        this.codefamille = codefamille;
    }
    public String getGazeuse() {
        return this.gazeuse;
    }
    
    public void setGazeuse(String gazeuse) {
        this.gazeuse = gazeuse;
    }
    public String getSucre() {
        return this.sucre;
    }
    
    public void setSucre(String sucre) {
        this.sucre = sucre;
    }
    public String getAlcool() {
        return this.alcool;
    }
    
    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }
    public Set getProduits() {
        return this.produits;
    }
    
    public void setProduits(Set produits) {
        this.produits = produits;
    }




}


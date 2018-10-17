package gestion.trelux.metier;
// Generated 9 juin 2018 15:00:41 by Hibernate Tools 4.3.1



/**
 * Ecaissement generated by hbm2java
 */
public class Ecaissement  implements java.io.Serializable {


     private String codeencaiss;
     private Caissier caissier;
     private Integer montantencaisse;
     private String dateencaiss;

    public Ecaissement() {
    }

	
    public Ecaissement(String codeencaiss) {
        this.codeencaiss = codeencaiss;
    }
    public Ecaissement(String codeencaiss, Caissier caissier, Integer montantencaisse, String dateencaiss) {
       this.codeencaiss = codeencaiss;
       this.caissier = caissier;
       this.montantencaisse = montantencaisse;
       this.dateencaiss = dateencaiss;
    }
   
    public String getCodeencaiss() {
        return this.codeencaiss;
    }
    
    public void setCodeencaiss(String codeencaiss) {
        this.codeencaiss = codeencaiss;
    }
    public Caissier getCaissier() {
        return this.caissier;
    }
    
    public void setCaissier(Caissier caissier) {
        this.caissier = caissier;
    }
    public Integer getMontantencaisse() {
        return this.montantencaisse;
    }
    
    public void setMontantencaisse(Integer montantencaisse) {
        this.montantencaisse = montantencaisse;
    }
    public String getDateencaiss() {
        return this.dateencaiss;
    }
    
    public void setDateencaiss(String dateencaiss) {
        this.dateencaiss = dateencaiss;
    }




}



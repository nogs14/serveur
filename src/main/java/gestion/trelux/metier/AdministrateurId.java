package gestion.trelux.metier;
// Generated 9 juin 2018 15:00:41 by Hibernate Tools 4.3.1



/**
 * AdministrateurId generated by hbm2java
 */
public class AdministrateurId  implements java.io.Serializable {


     private String idpersonne;
     private String codeadmin;

    public AdministrateurId() {
    }

    public AdministrateurId(String idpersonne, String codeadmin) {
       this.idpersonne = idpersonne;
       this.codeadmin = codeadmin;
    }
   
    public String getIdpersonne() {
        return this.idpersonne;
    }
    
    public void setIdpersonne(String idpersonne) {
        this.idpersonne = idpersonne;
    }
    public String getCodeadmin() {
        return this.codeadmin;
    }
    
    public void setCodeadmin(String codeadmin) {
        this.codeadmin = codeadmin;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AdministrateurId) ) return false;
		 AdministrateurId castOther = ( AdministrateurId ) other; 
         
		 return ( (this.getIdpersonne()==castOther.getIdpersonne()) || ( this.getIdpersonne()!=null && castOther.getIdpersonne()!=null && this.getIdpersonne().equals(castOther.getIdpersonne()) ) )
 && ( (this.getCodeadmin()==castOther.getCodeadmin()) || ( this.getCodeadmin()!=null && castOther.getCodeadmin()!=null && this.getCodeadmin().equals(castOther.getCodeadmin()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdpersonne() == null ? 0 : this.getIdpersonne().hashCode() );
         result = 37 * result + ( getCodeadmin() == null ? 0 : this.getCodeadmin().hashCode() );
         return result;
   }   


}


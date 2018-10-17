package gestion.trelux.metier;
// Generated 9 juin 2018 15:00:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Message generated by hbm2java
 */
public class Message  implements java.io.Serializable {


     private String codemsg;
     private String contenu;
     private String objet;
     private String datemsg;
     private Set detailsmessages = new HashSet(0);

    public Message() {
    }

	
    public Message(String codemsg) {
        this.codemsg = codemsg;
    }
    public Message(String codemsg, String contenu, String objet, String datemsg, Set detailsmessages) {
       this.codemsg = codemsg;
       this.contenu = contenu;
       this.objet = objet;
       this.datemsg = datemsg;
       this.detailsmessages = detailsmessages;
    }
   
    public String getCodemsg() {
        return this.codemsg;
    }
    
    public void setCodemsg(String codemsg) {
        this.codemsg = codemsg;
    }
    public String getContenu() {
        return this.contenu;
    }
    
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    public String getObjet() {
        return this.objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }
    public String getDatemsg() {
        return this.datemsg;
    }
    
    public void setDatemsg(String datemsg) {
        this.datemsg = datemsg;
    }
    public Set getDetailsmessages() {
        return this.detailsmessages;
    }
    
    public void setDetailsmessages(Set detailsmessages) {
        this.detailsmessages = detailsmessages;
    }




}



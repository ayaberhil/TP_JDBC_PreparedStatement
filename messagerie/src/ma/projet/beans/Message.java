
package ma.projet.beans;

import java.util.Date;


public class Message {
    
    private int id;
    private String objet;
    private String sujet;
    private Date date;
    private Employe empEmetteur;
    private Employe empRecepteur;
    private int idE;
    private int idR;

      public Message() {
       
    }

    public Message(int id, String objet, String sujet, Date date, int idE, int idR) {
        this.id = id;
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
        this.idE = idE;
        this.idR = idR;
    }

      
      
      
    public Message(String objet, String sujet, Date date, int idE, int idR) {
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
        this.idE = idE;
        this.idR = idR;
    }

    public Employe getEmpEmetteur() {
        return empEmetteur;
    }

    public Employe getEmpRecepteur() {
        return empRecepteur;
    }

    public int getIdE() {
        return idE;
    }

    public int getIdR() {
        return idR;
    }

    public void setEmpEmetteur(Employe empEmetteur) {
        this.empEmetteur = empEmetteur;
    }

    public void setEmpRecepteur(Employe empRecepteur) {
        this.empRecepteur = empRecepteur;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }


       
  

    public int getId() {
        return id;
    }

    public String getObjet() {
        return objet;
    }

    public String getSujet() {
        return sujet;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    
    
    
}

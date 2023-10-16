
package ma.projet.test;

import java.util.Date;
import ma.projet.beans.Employe;
import ma.projet.beans.Message;
import ma.projet.service.EmployeService;
import ma.projet.service.MessageService;


public class Test {
    public static void main (String [] args){

    //Teste Employe
    EmployeService es = new EmployeService();
    
    //Création des employes
    es.create(new Employe("BERHIL", "Aya"));
    es.create(new Employe("MOUFID", "Amine"));
    es.create(new Employe("ESSAOULAJY", "Manal"));
    
    //Modification d’un employe
    Employe e = es.getById(3);
    if (e != null) {
    e.setNom("AHLAMI");
    e.setPrenom("Asmaa");
    es.update(e);
  }
    
    //Suppression d’un employe
    es.delete(es.getById(4));
    
    //Liste des employes
    for(Employe emp : es.getAll()){
     System.out.println(""+emp.getNom());
   }
    
    MessageService ms = new MessageService();
    
    ms.create(new Message("Réunion", "Réunion de fin d’année", new Date(),es.getById(1).getId(), es.getById(2).getId()));
    ms.create(new Message("Réunion", "Réunion de fin d’année", new Date(),es.getById(1).getId(), es.getById(3).getId()));
    ms.create(new Message("Stage", "Stage à Marrakech", new Date(),es.getById(2).getId(), es.getById(1).getId()));
    ms.create(new Message("Stage", "Stage à Marrakech", new Date(),es.getById(2).getId(), es.getById(3).getId()));
    
    //Les message reçus par l’employé 3
    for (Message m : ms.getAll()) {
        if(m.getEmpRecepteur().getId() == 3)
        System.out.println(""+m.getSujet());
    
   }
  }   
}
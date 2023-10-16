
package ma.projet.test;

import ma.projet.beans.Developpeur;
import ma.projet.beans.Manager;
import ma.projet.services.DeveloppeurService;
import ma.projet.services.ManagerService;


public class Test {
    
     public static void main(String[] args) {
         
        DeveloppeurService ds = new DeveloppeurService();
        ManagerService ms = new ManagerService();
                 
        ds.create(new Developpeur("BERHIL", 200));
        ms.create(new Manager("MOUFID", 1000));
        
   
       
}
}

package ma.projet.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Manager;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;


public class ManagerService implements IDao<Manager>{

     @Override
    public boolean create(Manager o) {
    try {
        String req = "insert into manager (nom, salaire) values(?,?)";
        PreparedStatement ps =
        Connexion.getConnection().prepareStatement(req);
        ps.setString(1, o.getNom());
        ps.setDouble(2, o.getSalaire());
            if (ps.executeUpdate() == 1) {
        return true;
            }
    } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
            null, ex);
       }
            return false;
   }
    
    @Override
    public boolean update(Manager o) {
        try {
        String req = "update manager set nom = ? , salaire = ? where id =?";
        PreparedStatement ps =
        Connexion.getConnection().prepareStatement(req);
        ps.setString(1, o.getNom());
        ps.setDouble(2, o.getSalaire());
            if (ps.executeUpdate() == 1) {
        return true;
            }
    } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
            null, ex);
      }
        return false;
   }
    
    @Override
    public boolean delete(Manager o) {
        try {
        String req = "delete from manager where id = ?";
        PreparedStatement ps =
        Connexion.getConnection().prepareStatement(req);
        ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
        return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
            null, ex);
    }
        return false;
  }
    
    @Override
    public Manager findById(int id) {
        Manager manager = null;
        try {
        String req = "select * from manager where id = ?";
        PreparedStatement ps =
        Connexion.getConnection().prepareStatement(req);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
            if(rs.next())
            manager = new Manager( rs.getString("nom"), rs.getDouble("salaire"));
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
            null, ex);
        }
        return manager;
    }
    
    @Override
    public List<Manager> findAll() {
        List <Manager> managers = new ArrayList<>();
        try {
        String req = "select * from manager ";
        PreparedStatement ps =
        Connexion.getConnection().prepareStatement(req);
        ResultSet rs = ps.executeQuery();
          while(rs.next())
            managers.add(new Manager( rs.getString("nom"), rs.getDouble("salaire")));
        } catch (SQLException ex) {
            Logger.getLogger(ManagerService.class.getName()).log(Level.SEVERE,
            null, ex);
            }
    return managers;
 }
  
}

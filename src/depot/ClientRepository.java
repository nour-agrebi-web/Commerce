package depot;

import commercial.Client;
import config.DBCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ClientRepository {

        public boolean save(Client client) {
            Connection connexion = DBCon.getInstance().getCon();
            String req = "INSERT INTO `client`(`nom`,`telephone`,`points`) VALUES(?,?,?)";
            try{
                PreparedStatement ps = connexion.prepareStatement(req);
                ps.setString(1, client.getNom());
                ps.setString(2, client.getTelephone());
                ps.setInt(3, client.getPoints());
                int l = ps.executeUpdate();
                return(l>0);
            } catch(SQLException e){
                System.out.println(e.getMessage());
            }
            return false;
        }
    }



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import model.ClientModel;
import utils.ConnectionDB;

/**
 *
 * @author casierrav
 */
public class ClientDAO {
    
    private Connection conn = null;
        
    /**
     * 
     * @return 
     */
    public ArrayList<ClientModel> getAllClients() {
        ArrayList<ClientModel> clients = new ArrayList();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql          = "SELECT id, alias FROM client;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                ClientModel client = new ClientModel(result.getInt(1), result.getString(2));
                clients.add( client );
                System.out.println(client.getId());
                System.out.println(client.getAlias());
                
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return clients;
    }
}


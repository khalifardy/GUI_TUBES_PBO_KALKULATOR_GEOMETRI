/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author khalifardy
 */
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost:3306/PBO_Praktikum";
    static final String DB_USER = "admin";
    static final String DB_PASS = "Ayu20021993";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public Database() throws SQLException{
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),
                    "ConnectionError",JOptionPane.WARNING_MESSAGE);
            
        }
        
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage()
                    ,"Communication Error",
                    JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    public ResultSet query_filter_login(String SQLString,String username){
        try{
            PreparedStatement pstmt=conn.prepareStatement(SQLString);
            pstmt.setString(1, username);
            return pstmt.executeQuery();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
        return null;
        
        
    }
    
    
    public void query_update(String SQLString,String nama, int harga, int stok, int id){
        try{
            PreparedStatement preparedStatement=conn.prepareStatement(SQLString);
            preparedStatement.setString(1, nama);
            preparedStatement.setInt(2, harga);
            preparedStatement.setInt(3, stok);
            preparedStatement.setInt(4, id);
            
            preparedStatement.executeUpdate();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void query_delete(String SQLString,int id){
        try{
            PreparedStatement preparedStatement=conn.prepareStatement(SQLString);
            preparedStatement.setInt(1, id); 
            preparedStatement.executeUpdate();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void query_insert(String SQLString, String dimensi,String jenis_bangun,String jenis_hitungan, double hasil, LocalDateTime time, int user_id){
        try{
            PreparedStatement preparedStatement=conn.prepareStatement(SQLString);
            preparedStatement.setString(1, dimensi);
            preparedStatement.setString(2, jenis_bangun);
            preparedStatement.setString(3, jenis_hitungan);
            preparedStatement.setDouble(4, hasil);
            preparedStatement.setObject(5, time);
            preparedStatement.setInt(6, user_id);
            
            preparedStatement.executeUpdate();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,
                "Error:"+e.getMessage(),"Communication Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    

    public void closeConn(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}

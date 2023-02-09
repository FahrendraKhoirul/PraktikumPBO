
package prakpbo_uas_sem2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    Connection conn;
    Statement st;
    
    void insertData(String Judul, String dl, String cat, String user, String status, String a){
        String statusValue = "";
        if (status.equals("To Do")){
            status = "todo";
            statusValue = "To Do";
        } else if(status.equals("On Progress")){
            status = "onprogress";
            statusValue = "On Progress";
        } else {
            status = "done";
            statusValue = "Done";
        }
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            st = (Statement) conn.createStatement();
            String sql = "INSERT INTO "+status+" VALUES ('"+Judul+"','"+statusValue+"','"+dl+"','"+cat+"','"+user+"')";
            st.execute(sql);
            if ( a == null) JOptionPane.showMessageDialog(null, "Insert Data Success");
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Insert Data Failed");
        }
        
        try {
            if (conn != null) {
                conn.close();
                st.close();
            }
        } catch (SQLException e) {
        }
    }
    
    void deleteData(String Judul, String status, String dl, String cat, String user, String a){
        if (status.equals("To Do")){
            status = "todo";
        } else if(status.equals("On Progress")){
            status = "onprogress";
        } else {
            status = "done";
        }
        
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            st = (Statement) conn.createStatement();
            String sql = "DELETE FROM "+status+" WHERE Judul = '"+Judul+"'AND Deadline = '"+dl+"' AND Catatan = '"+cat+"'AND user = '"+user+"'";
            st.execute(sql);
            if ( a == null) JOptionPane.showMessageDialog(null, "Delete Data Success");
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Delete Data Failed");
        }
        
        try {
            if (conn != null) {
                conn.close();
                st.close();
            }
        } catch (SQLException e) {
        }
    }
    
    boolean loginAccount(String user, String pw){
        boolean ada = false;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            st = (Statement) conn.createStatement();
            String sql = "SELECT * FROM user WHERE username='"+user+"' AND password='"+pw+"'";
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                String un = rs.getString(1);
                String ps = rs.getString(2);
                if(un.equals(user) && ps.equals(pw)){
                    ada = true;
                }
            }
        
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Login Failed");
        }
        
        try {
            if (conn != null) {
                conn.close();
                st.close();
            }
        } catch (SQLException e) {
        }
        return ada;
    }
    
    void registerAccount(String user, String pw){
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/prakpbo_uas_sem2","root","");
            st = (Statement) conn.createStatement();
            String sql = "INSERT INTO user VALUES ('"+user+"','"+pw+"')";
            st.execute(sql); 
            JOptionPane.showMessageDialog(null, "Register Success");
        } catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Insert Data Failed");
        }
        
        try {
            if (conn != null) {
                conn.close();
                st.close();
            }
        } catch (SQLException e) {
        }
    }
    
}

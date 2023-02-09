
package prakpbo_uas_sem2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Task extends Database{
    private String judul;
    private String status;
    private String deadline;
    private String catatan;
    private String user;
    Database d = new Database();

    
    Task(String a, String b, String c, String d, String e){
       judul = a;
       deadline = b;
       catatan = c;
       status = d;
       user = e;
    }
    
    public void setJudul(String a){
        judul = a;
    }
    public void setStatus(String a){
        status = a;
    }
    public void setDeadline(String a){
        deadline = a;
    }
    public void setCatatan(String a){
        catatan = a;
    }
    
    public String getJudul(){
        return judul;
    }
    public String getStatus(){
        return status;
    }
    public String getDeadline(){
        return deadline;
    }
    public String getCatatan(){
        return catatan;
    }
    public String getUser(){
        return user;
    }
    
    public void insert(){
        d.insertData(getJudul(),getDeadline(), getCatatan(),getUser(), getStatus(), null);
    }
    
    public void delete(){
        d.deleteData(getJudul(), getStatus(), getDeadline(), getCatatan(),getUser(), null);
    }
    
    public void insert(String a){
        d.insertData(getJudul(),getDeadline(), getCatatan(),getUser(), getStatus(), a);
    }
    
    public void delete(String a){
        d.deleteData(getJudul(), getStatus(), getDeadline(), getCatatan(),getUser(), a);
    }
    
    @Override
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
}


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur Rahmi Ozdemir
 */
public class mesajgetir {
    public static  String getir(int id){
       DefaultTableModel dt;   
        try{
             
              
          
	Connection bag = (Connection) giris.getConnection();

	PreparedStatement st = (PreparedStatement) bag.prepareStatement("SELECT mesaj_char from mesaj where id='"+id+"'");
	
        ResultSet result = st.executeQuery();
        if(result.next()){
           return result.getString("mesaj_char");
            
        }
        else{
            return "Bir Hata olustu";
        }
        //"select *from kullanici where yetki='2'"
        }
        catch(Exception e){
	 System.out.println(e);
}
         return "Bir Hata olustu";
    }
    public static int gonderengetir(int id){
         DefaultTableModel dt;   
        try{
             
              
          
	Connection bag = (Connection) giris.getConnection();

	PreparedStatement st = (PreparedStatement) bag.prepareStatement("SELECT gonderen_id from mesaj where id='"+id+"'");
	
        ResultSet result = st.executeQuery();
        if(result.next()){
           return result.getInt("gonderen_id");
            
        }
        else{
            return 0;
        }
        //"select *from kullanici where yetki='2'"
        }
        catch(Exception e){
	 System.out.println(e);
}
         return 0;
    }
}

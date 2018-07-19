
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur Rahmi Ozdemir
 */
public class odaidgetir {
    
    public static  int getir(String g){
        try{
             
              
          
	Connection bag = (Connection) giris.getConnection();

	PreparedStatement st = (PreparedStatement) bag.prepareStatement("select id from odalar where oda_no='"+g+"'");
	
        ResultSet result = st.executeQuery();
        if(result.next()){
         return result.getInt("id");
        }
        
        
        }
        catch(Exception e){
	 System.out.println(e);
}
              return -1;
        
    } 
        
        
    
    
}

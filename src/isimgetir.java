
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
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
public class isimgetir {
    public static String isim(int id){
        
         try{
	Connection bag = (Connection)giris.getConnection(); ;

	PreparedStatement st = (PreparedStatement) bag.prepareStatement("select * from personel where id='" + id + "'");
	ResultSet result = st.executeQuery();
        
       if(result.next()){
          return result.getString("isim");
            
       }else{
           return "Isim Bulunamadi";
       }

	
        }
        catch(Exception e){
                 System.out.println(e);
        }
        return "null";
    }     
}

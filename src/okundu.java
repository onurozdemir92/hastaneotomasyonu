
import com.mysql.jdbc.Connection;
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
public class okundu {
    public  static void yap(int id){
        
                 try{
	Connection bag = (Connection)giris.getConnection();

	java.sql.PreparedStatement st = (java.sql.PreparedStatement) bag.prepareStatement("update mesaj set durum=? where id=?");
      
        st.setInt(1,1);
        st.setInt(2,id);

	 st.executeUpdate();
         System.out.println("yapildi");	
                    
                     
			//insert into vip (kid,baslangict,bitist) values ("+dt.getValueAt(jTable1.getSelectedRow(),0).toString()+",'"+bugun+"','"+formatted+"')
		               
	
}
catch(Exception e){
	 System.out.println(e);

     
    
    }
    }
}

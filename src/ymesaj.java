
import com.mysql.jdbc.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur Rahmi Ozdemir
 */
public class ymesaj {
    public  static String gonder(String alici,String tarih, String mesaj){
               try{
	Connection bag = (Connection)giris.getConnection();

	java.sql.PreparedStatement st = (java.sql.PreparedStatement) bag.prepareStatement("CALL mesajgonder(?,?,?,?,?)");
      
        st.setInt(1,giris.girisyapan);
        st.setInt(2,personelid.getir(alici));
        st.setString(3,tarih);
        st.setString(4,mesaj);
        st.setString(5,"0");
        

	 st.executeUpdate();
        return "Mesaj Gonderildi";	
                    
                     
			
		               
	
}
catch(Exception e){
	 System.out.println(e);

     
    
    }
               return "Mesaj Gonderilemedi";
    }
    
     public  static String gonderint(int alici,String tarih, String mesaj){
               try{
	Connection bag = (Connection)giris.getConnection();

	java.sql.PreparedStatement st = (java.sql.PreparedStatement) bag.prepareStatement("CALL mesajgonder(?,?,?,?,?)");
      
        st.setInt(1,giris.girisyapan);
        st.setInt(2,alici);
        st.setString(3,tarih);
        st.setString(4,mesaj);
        st.setString(5,"0");
        

	 st.executeUpdate();
        return "Cevap Gonderildi";	
                    
                     
			
		               
	
}
catch(Exception e){
	 System.out.println(e);

     
    
    }
               return "cevap Gonderilemedi";
    }
    
}

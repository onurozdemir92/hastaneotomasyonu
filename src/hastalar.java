
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
public class hastalar {
    public String tc;
    public String isim;
    public String dogumt;
    public String dogumy;
    public String tel;
    public String eposta;
    
    public  static String Kayit(hastalar k){
         try{
	Connection bag = (Connection)giris.getConnection();

	PreparedStatement st = (PreparedStatement) bag.prepareStatement("select *, COUNT(*) as kac from hastalar where TC='" + k.tc + "'");
	ResultSet result = st.executeQuery();
        
       

	if(result.next()){
		if(result.getString("kac").equals("0")){
                     st = (PreparedStatement) bag.prepareStatement("insert into hastalar (TC,isim,d_tarihi,d_yeri,tel,eposta) values ("+k.tc+",'"+k.isim+"','"+k.dogumt+"','"+k.dogumy+"','"+k.tel+"','"+k.eposta+"')");
                      st.execute();
                     return "Hasta Kayıt edılmıstır";
			//insert into vip (kid,baslangict,bitist) values ("+dt.getValueAt(jTable1.getSelectedRow(),0).toString()+",'"+bugun+"','"+formatted+"')
		}else{
			
                        
			
                       return "Bu Tc ye ait Hasta Bulunmaktadır";
			  
			
		}                
	}
}
catch(Exception e){
	 System.out.println(e);
}
      return null;
    }
    
    
}


import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.scene.chart.PieChart;
import javax.xml.crypto.Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur Rahmi Ozdemir
 */
public class randevukontrol {
    public  static  Boolean kontrolet(int doktor,String tarih,int saat ){
          try{
	Connection bag = (Connection)giris.getConnection();

	PreparedStatement st = (PreparedStatement) bag.prepareStatement("select *, COUNT(*) as kac from randevu where doktor_id='" + doktor + "'&& randevu_tarih='" + tarih + "'&& saat_id='" + saat + "'");
	ResultSet result = st.executeQuery();
        
       

	if(result.next()){
		if(result.getString("kac").equals("0")){
                    
                     return false;
			//insert into vip (kid,baslangict,bitist) values ("+dt.getValueAt(jTable1.getSelectedRow(),0).toString()+",'"+bugun+"','"+formatted+"')
		}else{
			
                        
			
                       return true;
			  
			
		}                
	}
}
catch(Exception e){
	 System.out.println(e);
}
          return null;
    }
    
}

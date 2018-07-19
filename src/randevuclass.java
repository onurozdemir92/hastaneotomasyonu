
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
public class randevuclass {
    public  int doktor;
    public  int hasta;
    public String tarih;
    public int saat;
    
    public  static String kaydet(randevuclass r){

 try{
	Connection bag = (Connection)giris.getConnection();

	java.sql.PreparedStatement st = (java.sql.PreparedStatement) bag.prepareStatement("select *, COUNT(*) as kac from randevu where doktor_id='" + r.doktor + "' and randevu_tarih='" + r.tarih + "' and saat_id='" + r.saat + "'");
	ResultSet result = st.executeQuery();
        
       

	if(result.next()){
		if(result.getString("kac").equals("0")){
                     st = (java.sql.PreparedStatement) bag.prepareStatement("insert into randevu (doktor_id,hasta_id,randevu_tarih,saat_id) values ("+r.doktor+",'"+r.hasta+"','"+r.tarih+"','"+r.saat+"')");
                      st.execute();
                     return "randevu kayit edildi";
			//insert into vip (kid,baslangict,bitist) values ("+dt.getValueAt(jTable1.getSelectedRow(),0).toString()+",'"+bugun+"','"+formatted+"')
		}else{
			
                        
			 return "bu randevu bulunmaktadit";
                     
			  
			
		}                
	}
}
catch(Exception e){
	 System.out.println(e);

     
    
    }
 return "Islem Gerceklestirilemedi";
    }
    
}

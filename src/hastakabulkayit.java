
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur Rahmi Ozdemir
 */
public class hastakabulkayit {
    public int hasta;
    public String oda;
    LocalDate now = LocalDate.now();
    public static  String kaydet(hastakabulkayit h){
        
        
        try{
	Connection bag = (Connection)giris.getConnection();

	java.sql.PreparedStatement st = (java.sql.PreparedStatement) bag.prepareStatement("select *, COUNT(*) as kac from hastakabul where hasta_id='" + h.hasta + "' and durum='" + 0 + "'");
	ResultSet result = st.executeQuery();
        
       

	if(result.next()){
		if(result.getString("kac").equals("0")){
                     st = (java.sql.PreparedStatement) bag.prepareStatement("insert into hastakabul (hasta_id,oda_id,kabul_tarih,durum) values ("+h.hasta+",'"+odaidgetir.getir(h.oda)+"','"+h.now.toString()+"','"+0+"')");
                      st.execute();
                     return "randevu kayit edildi";
			//insert into vip (kid,baslangict,bitist) values ("+dt.getValueAt(jTable1.getSelectedRow(),0).toString()+",'"+bugun+"','"+formatted+"')
		}else{
			
                        
			 return "Bu hasta zaten kayitlidir";
                     
			  
			
		}                
	}
}
catch(Exception e){
	 System.out.println(e);

     
    
    }
 return "Islem Gerceklestirilemedi";
    }
        
    
    
}

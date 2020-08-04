/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kontrol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hendra Rusdiyanto
 */
public class kontrol_transaksi extends koneksi{
    public kontrol_transaksi(){
        setkonek();
    }
    public void tampil(DefaultTableModel dtm){
    String sql = "SELECT * FROM `transaksi` INNER JOIN obat ON transaksi.obat_id=obat.id_obat";
        try {
            rs=st.executeQuery(sql);
            Object[] data = new Object[7];
            while(rs.next()){
            data[0]=rs.getString("id_transaksi");
            data[1]=rs.getString("nama_obat");
            data[2]=rs.getString("kategori");
            data[3]=rs.getString("jumlah_beli");
            data[4]=rs.getString("harga");
            data[5]=rs.getString("total");
            data[6]=rs.getString("tanggal");
            dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}

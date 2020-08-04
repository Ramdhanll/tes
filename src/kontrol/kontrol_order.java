/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kontrol;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hendra Rusdiyanto
 */
public class kontrol_order extends koneksi {
    public kontrol_order() {
        setkonek();
    }
    
    public void simpandataorder(String idorder, String obatid, int jumlahbeli, String tanggal, String total) {
       String sql = "INSERT INTO `transaksi` VALUES ('"+idorder+"','"+obatid+"','"+jumlahbeli+"','"+tanggal+"','"+total+"')";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void tampildata (DefaultTableModel dtm){
        String sql = "SELECT * FROM `order`";
        try {
            rs = st.executeQuery(sql);
            Object [] data = new Object[6];
            while(rs.next()) {
                data[0] = rs.getString("id_order");
                data[1] = rs.getString("no_meja");
                data[2] = rs.getDate("tanggal");
                data[3] = rs.getString("id_user");
                data[4] = rs.getString("keterangan");
                data[5] = rs.getString("status_order");
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_order.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
      public void hapusdata(String idorder) {
        String sql = "DELETE FROM `order` WHERE id_order = '"+idorder+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_order.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }
      
      public ResultSet cekId(String id) throws SQLException{
          String sql = "SELECT * FROM `transaksi` where id_transaksi='"+id+"'";
          rs = st.executeQuery(sql);
          return rs;
      }
      
}

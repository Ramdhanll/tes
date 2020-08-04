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
public class kontrol_obat extends koneksi {
    public kontrol_obat() {
        setkonek();
    }
    
    public void simpandata(String idobat, String namaobat, String kategori, String komposisi, String dosis, String aturanpakai,  String harga) {
       String sql = "INSERT INTO obat VALUES ('"+idobat+"','"+namaobat+"','"+kategori+"','"+komposisi+"','"+dosis+"','"+aturanpakai+"','"+harga+"')";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_obat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void tampildata (DefaultTableModel dtm){
        String sql = "SELECT * FROM obat";
        try {
            rs = st.executeQuery(sql);
            Object [] data = new Object[8];
            while(rs.next()) {
                data[0] = rs.getString("id_obat");
                data[1] = rs.getString("nama_obat");
                data[2] = rs.getString("kategori");
                data[3] = rs.getString("komposisi");
                data[4] = rs.getString("dosis");
                data[5] = rs.getString("aturan_pakai");
                data[6] = rs.getString("harga");
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_obat.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void updatedata(String idobat, String namaobat, String kategori, String komposisi, String dosis, String aturanpakai, String harga) {
         String sql = "UPDATE obat SET nama_obat = '"+namaobat+"', kategori = '"+kategori+"', komposisi = '"+komposisi+"',dosis = '"+dosis+"',aturan_pakai = '"+aturanpakai+"', harga = '"+harga+"' WHERE id_obat = '"+idobat+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_obat.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
      public void hapusdata(String idobat) {
        String sql = "DELETE FROM obat WHERE id_obat = '"+idobat+"'";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_obat.class.getName()).log(Level.SEVERE, null, ex);
        } 
      }
      
      public ResultSet cari(String cari) throws Exception {
          String sql = "SELECT * FROM obat WHERE id_obat = '"+cari+"'";
          return rs = st.executeQuery(sql);
      }

      public ResultSet caridata(DefaultTableModel dtm, String cari) {
        try {
            String sql = "SELECT * FROM obat WHERE id_obat LIKE '%"+cari+"%' OR nama_obat LIKE '%"+cari+"%' OR harga LIKE '%"+cari+"%'";
            rs = st.executeQuery(sql);
            Object [] data = new Object[4];
                while(rs.next()) {
                data[0] = rs.getString("id_obat");
                data[1] = rs.getString("nama_obat");
                data[2] = rs.getInt("harga");
                data[3] = rs.getString("status_obat");
                dtm.addRow(data);
                
             }
        } catch (SQLException ex) {
            Logger.getLogger(kontrol_obat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
         
        
        
      }
     
        
        
      }


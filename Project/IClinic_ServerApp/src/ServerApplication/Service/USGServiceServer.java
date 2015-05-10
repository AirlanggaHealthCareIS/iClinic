/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Antrian;
import Database.Entity.Pembayaran;
import Database.Entity.USG;
import Database.Service.USGService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arlin
 */
public class USGServiceServer extends UnicastRemoteObject implements USGService {

    public USGServiceServer() throws RemoteException {
    }

    public USG insertUSG(USG usg) throws RemoteException {

        System.out.println("Client Melakukan Proses Insert pada Tabel usg");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO transaksi_usg (ID_USG,ID_PASIEN,TANGGAL,HASIL,DESKRIPSI,HARGA) values(?,?,?,?,?,?)"
            );
            statement.setString(1, usg.getId_USG());
            statement.setString(2, usg.getId_pasien());
            statement.setString(3, usg.getTanggal());
            statement.setBytes(4, usg.getHasil());
            statement.setString(5, usg.getDeskripsi());
            statement.setInt(6, usg.getHarga());

            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                usg.setId_USG(result.getString(1));
            }
            result.close();
            return usg;
        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }
        }
    }

    public Antrian Id_pasien(Antrian antrian)throws RemoteException {
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT* FROM antrian WHERE JENIS_ANTRIAN=USG AND STATUS=0 ");
            ResultSet result = statement.executeQuery();
            if(result.first()==false){
                antrian.setId_Pasien("kosong");
                return antrian;
            }
            else{
               result.first();
               antrian.setId_Antrian(result.getString("ID_ANTRIAN"));
               antrian.setId_Pasien(result.getString("ID_PASIEN"));
               antrian.setJenis_Antrian(result.getString("JENIS_ANTRIAN"));
               antrian.setKeterangan(result.getString("KETERANGAN"));
               return antrian;
            }
        } catch (SQLException ex) {
            Logger.getLogger(USGServiceServer.class.getName()).log(Level.SEVERE, null, ex);
            antrian.setId_Pasien("salah");
            return antrian;  
        }
}
    public void ubahstatus(String ID_ANTRIAN)throws RemoteException{
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE antrian SET STATUS=1 WHERE ID_ANTRIAN = '"+ID_ANTRIAN+"'");
            statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(USGServiceServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String Id_usg()throws RemoteException {
        PreparedStatement statement = null;
        int id;
        String IdUsg;
        String usg;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT ID_USG FROM transaksi_usg ");
            ResultSet result = statement.executeQuery();
            if(result.first()==false){
                return "USG0001";
            }
            else{
               result.last();
               IdUsg = result.getString("ID_USG");
               id =Integer.parseInt(IdUsg.substring(3));
               id++;
               usg=Integer.toString(id);
               if(usg.length()<4){
                   for(int i=0;i<usg.length();i++){
                       usg="0"+usg;
                   }
               }
               IdUsg=IdUsg.substring(0, 3);
               IdUsg=IdUsg+usg;
               return IdUsg;
            }
        } catch (SQLException ex) {
            Logger.getLogger(USGServiceServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "salah";   
}
//    public void updateUSG(USG usg) throws RemoteException {
//
//        System.out.println("Client Melakukan Proses Update pada Tabel USG");
//
//        PreparedStatement statement = null;
//       try{
//           statement = DatabaseUtilities.getConnection().prepareStatement(
//                 "UPDATE pembayaran SET ID_PASIEN = ?," +
//                 "HASIL = ?, HARGA = ?, DESKRIPSI = ? " +
//                 "WHERE ID_USG = ?"
//                   );
//           statement.setString(1, usg.getId_USG());
//           statement.setString(2, usg.getId_pasien());
//           statement.setLong(3, usg.getHasil());
//           statement.setInt(4, usg.getHarga());
//           statement.setString(5, usg.getDeskripsi());
//
//           statement.executeUpdate();
//
//       }catch(SQLException exception){
//        exception.printStackTrace();
//       }finally{
//           if(statement != null){
//               try{
//                   statement.close();
//               }catch(SQLException exception){
//                exception.printStackTrace();
//               }
//           }
//       }
//    }
//    public void deleteUSG(String Id_USG) throws RemoteException {
//
//        System.out.println("Client Melakukan Proses Delete pada Tabel USG");
//
//        PreparedStatement statement = null;
//       try{
//           statement = DatabaseUtilities.getConnection().prepareStatement(
//                    "DELETE FROM usg WHERE ID_USG = ?");
//
//           statement.setLong(1, Id_USG);
//
//           statement.executeUpdate();
//
//       }catch(SQLException exception){
//        exception.printStackTrace();
//       }finally{
//           if(statement != null){
//               try{
//                   statement.close();
//               }catch(SQLException exception){
//                exception.printStackTrace();
//               }
//           }
//       }
//    }
    public USG getUSG(String Id_USG) throws RemoteException {

        System.out.println("Client Melakukan Proses Get By Id pada Tabel USG");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM transaksi_usg WHERE ID_USG = ?");

            ResultSet result = statement.executeQuery();

            USG usg = null;

            if (result.next()) {
                usg = new USG();
                usg.setId_USG(result.getString("ID_USG"));
                usg.setId_pasien(result.getString("ID_PASIEN"));
                usg.setTanggal(result.getString("TANGGAL"));
                usg.setHasil(result.getBytes("HASIL"));
                usg.setDeskripsi(result.getString("DESKRIPSI"));
                usg.setHarga(result.getInt("HARGA"));
            }

            return usg;

        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public List<USG> getUSG() throws RemoteException {

        System.out.println("Client Melakukan Proses Get All pada Tabel USG");

        Statement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM transaksi_usg");

            List<USG> list = new ArrayList<USG>();

            while (result.next()) {
                USG usg = new USG();
                usg.setId_USG(result.getString("ID_USG"));
                usg.setId_pasien(result.getString("ID_PASIEN"));
                usg.setTanggal(result.getString("TANGGAL"));
                usg.setHasil(result.getBytes("HASIL"));
                usg.setDeskripsi(result.getString("DESKRIPSI"));
                usg.setHarga(result.getInt("HARGA"));
                list.add(usg);
            }

            result.close();

            return list;

        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

//    public USG getUSG(int Id_USG) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    //-----Pembayaran-----//
    public String mencariIdPembayaranDariPembayaran(String idPasien) throws RemoteException {
        System.out.println("Client Melakukan Proses Pencarian ID PEMBAYARAN dengan Mengakses Tabel Pembayaran");
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        Statement state = null;
        ResultSet rs = null;
        String idPembayaran = "";
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT `pembayaran`.ID_PEMBAYARAN \n"
                    + "FROM `pembayaran`,`transaksi_usg` \n"
                    + "WHERE `pembayaran`.ID_PASIEN = `transaksi_usg`.ID_PASIEN \n"
                    + "AND `pembayaran`.ID_PASIEN = '" + idPasien + "' \n"
                    + "AND `pembayaran`.TANGGAL_BAYAR = '" + date + "' \n"
                    + "AND `pembayaran`.STATUS = 'HUTANG'";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                idPembayaran = rs.getString(1);
            }
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(idPembayaran);
        return idPembayaran;
    }

    public Pembayaran getPembayaranDariPembayaran(String idPembayaran) throws RemoteException {
        System.out.println("Client Melakukan Proses Pencarian get PEMBAYARAN dengan Mengakses Tabel Pembayaran");
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        System.out.println(date);
        PreparedStatement statement = null;
        Pembayaran pembayaranDB = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT `pembayaran`.* \n"
                    + "FROM `pembayaran` \n"
                    + "WHERE `pembayaran`.ID_PEMBAYARAN = '" + idPembayaran + "'");

            ResultSet result = statement.executeQuery();

            if (result.next()) {
                pembayaranDB = new Pembayaran();
                pembayaranDB.setID_PEMBAYARAN(result.getString("ID_PEMBAYARAN"));
                pembayaranDB.setID_PASIEN(result.getString("ID_PASIEN"));
                pembayaranDB.setID_USG(result.getString("ID_USG"));
                pembayaranDB.setID_TRANSAKSI_LAB(result.getString("ID_TRANSAKSI_LAB"));
                pembayaranDB.setID_RESEP(result.getString("ID_RESEP"));
                pembayaranDB.setID_REKAM(result.getString("Id_REKAM"));
                pembayaranDB.setID_TRANSAKSI_LAYANAN(result.getString("ID_TRANSAKSI_LAYANAN"));
                pembayaranDB.setTANGGAL_BAYAR(result.getDate("TANGGAL_BAYAR"));
                pembayaranDB.setTOTAL_HARGA(result.getInt("TOTAL_HARGA"));
                pembayaranDB.setSTATUS(result.getString("STATUS"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
        return pembayaranDB;
    }

    public void updatePembayaranDariPembayaran(Pembayaran pembayaranDB, String idTransaksiUSG, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Update pada Tabel Pembayaran");
        int totalHarga = pembayaranDB.getTOTAL_HARGA() + Harga;
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET ID_USG = ?, ID_TRANSAKSI_LAB = ?, "
                    + "ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, "
                    + "TOTAL_HARGA = ? "
                    + "WHERE ID_PEMBAYARAN = ?");
            statement.setString(1, idTransaksiUSG);
            statement.setString(2, pembayaranDB.getID_TRANSAKSI_LAB());
            statement.setString(3, pembayaranDB.getID_RESEP());
            statement.setString(4, pembayaranDB.getID_REKAM());
            statement.setString(5, pembayaranDB.getID_TRANSAKSI_LAYANAN());
            statement.setInt(6, totalHarga);
            statement.setString(7, pembayaranDB.getID_PEMBAYARAN());

            statement.executeUpdate();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public String getAutoNumberDariPembayaran() throws RemoteException {
        System.out.println("Client Melakukan Proses Auto Number dengan Mengakses Tabel Pembayaran");
        Statement state = null;
        ResultSet rs = null;

        String number = "";
        String nomerBaru = "";
        int numberBaru = 0;
        try {
            state = (Statement) DatabaseUtilities.getConnection().createStatement();
            String sql = "SELECT ID_PEMBAYARAN FROM pembayaran ORDER BY ID_PEMBAYARAN DESC limit 1";
            rs = state.executeQuery(sql);
            while (rs.next()) {
                number = rs.getString(1);
            }
            System.out.println(number);
        } catch (Throwable ex) {
            System.out.println("masuk catch");
        }
        System.out.println(number);
        if (number.equals("")) {
            nomerBaru = "BYR0001";
        } else {
            String[] pisah = number.split("(?<=\\G.{1})");
            String numbersebelumnya = pisah[3] + pisah[4] + pisah[5] + pisah[6];
            numberBaru = Integer.parseInt(numbersebelumnya) + 1;
            String[] pisah1 = String.valueOf(numberBaru).split("(?<=\\G.{1})");
            String nol = "";
            if (pisah1.length == 1) {
                nol = "000";
            } else if (pisah1.length == 2) {
                nol = "00";
            } else if (pisah1.length == 3) {
                nol = "0";
            }
            nomerBaru = "BYR" + nol + numberBaru;
        }
        System.out.println(nomerBaru);
        return nomerBaru;
    }

    public void insertPembayaranDariPembayaran(String idPembayaran, String idPasien, String idTransaksiUSG, int Harga) throws RemoteException {
        System.out.println("Client Melakukan Proses Insert pada Tabel Pembayaran");
        PreparedStatement statement = null;
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "INSERT INTO pembayaran (ID_PEMBAYARAN,ID_PASIEN,ID_USG,"
                    + "ID_DETAIL_LAB,ID_RESEP,ID_REKAM,ID_TRANSAKSI_LAYANAN,"
                    + "TANGGAL_BAYAR,TOTAL_HARGA,STATUS) values(?,?,?,?,?,?,?,?,?,?)");
            statement.setString(1, idPembayaran);
            statement.setString(2, idPasien);
            statement.setString(3, idTransaksiUSG);
            statement.setString(4, null);
            statement.setString(5, null);
            statement.setString(6, null);
            statement.setString(7, null);
            statement.setDate(8, date);
            statement.setInt(9, Harga);
            statement.setString(10, "HUTANG");

            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }
        }
    }

}

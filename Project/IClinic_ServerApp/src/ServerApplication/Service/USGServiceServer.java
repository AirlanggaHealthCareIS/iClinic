/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerApplication.Service;

import Database.Entity.Pembayaran;
import Database.Entity.USG;
import Database.Service.USGService;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
                    "INSERT INTO transaksi_usg (ID_USG,ID_PASIEN,HASIL,HARGA,DESKRIPSI) values(?,?,?,?,?)"
            );
            statement.setString(1, usg.getId_USG());
            statement.setString(2, usg.getId_pasien());
            statement.setBlob(3, usg.getHasil());
            statement.setInt(4, usg.getHarga());
            statement.setString(5, usg.getDeskripsi());

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

        System.out.println("Client Melakukan Proses Get By Id pada Tabel Pembayaran");

        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "SELECT * FROM transaksi_usg WHERE ID_USG = ?");

            ResultSet result = statement.executeQuery();

            USG usg = null;

            if (result.next()) {
                usg = new USG();
                usg.setId_USG(result.getString("Id_USG"));
                usg.setId_pasien(result.getString("Id_Pasien"));
                usg.setHasil(result.getBlob("Hasil"));
                usg.setHarga(result.getInt("Harga"));
                usg.setDeskripsi(result.getString("Deskripsi"));
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
                usg.setId_pasien(result.getString("Id_PASIEN"));
                usg.setHasil(result.getBlob("HASIL"));
                usg.setHarga(result.getInt("HARGA"));
                usg.setDeskripsi(result.getString("DESKRIPSI"));
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
                pembayaranDB.setId_Pembayaran(result.getString("Id_Pembayaran"));
                pembayaranDB.setId_Pasien(result.getString("Id_Pasien"));
                pembayaranDB.setId_USG(result.getString("Id_USG"));
                pembayaranDB.setId_Detail_Lab(result.getString("Id_Detail_Lab"));
                pembayaranDB.setId_Resep(result.getString("Id_Resep"));
                pembayaranDB.setId_Rekam(result.getString("Id_Rekam"));
                pembayaranDB.setId_Transaksi_Layanan(result.getString("Id_Transaksi_Layanan"));
                pembayaranDB.setTanggal_Bayar(result.getDate("Tanggal_Bayar"));
                pembayaranDB.setTotal_Harga(result.getInt("Total_Harga"));
                pembayaranDB.setStatus(result.getString("Status"));
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
        int totalHarga = pembayaranDB.getTotal_Harga() + Harga;
        PreparedStatement statement = null;
        try {
            statement = DatabaseUtilities.getConnection().prepareStatement(
                    "UPDATE pembayaran SET ID_USG = ?, ID_DETAIL_LAB = ?, "
                    + "ID_RESEP = ?, ID_REKAM = ?, ID_TRANSAKSI_LAYANAN = ?, "
                    + "TOTAL_HARGA = ? "
                    + "WHERE ID_PEMBAYARAN = ?");
            statement.setString(1, idTransaksiUSG);
            statement.setString(2, pembayaranDB.getId_Detail_Lab());
            statement.setString(3, pembayaranDB.getId_Resep());
            statement.setString(4, pembayaranDB.getId_Rekam());
            statement.setString(5, pembayaranDB.getId_Transaksi_Layanan());
            statement.setInt(6, totalHarga);
            statement.setString(7, pembayaranDB.getId_Pembayaran());

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

}

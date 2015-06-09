/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PendaftarandanRegistrasiPasienLama;

import Database.Entity.Pasien;
import ServerApplication.Service.Bag_PendaftaranServiceServer;
import ServerApplication.model.TableModelLog;
import java.sql.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author adammuhammad
 */
public class DataPasienLamaTerdaftar {
    TableModelLog tableModelLog=new TableModelLog();
      @Test
    public void testGetPasien_String() throws Exception {
        System.out.println("getPasien");
        String Id_Pasien = "0023";
        Bag_PendaftaranServiceServer instance = new Bag_PendaftaranServiceServer(tableModelLog);
        Pasien expResult = new Pasien();
        expResult.setNama_Pasien("Jordan");
        expResult.setAlamat("sepanjang");
        expResult.setJenis_Kelamin("L");
        expResult.setNo_HP("23456");
        expResult.setNo_Ktp("123456789");
        expResult.setTanggal_Daftar(new Date (2015-04-30));
        expResult.setTanggal_Lahir(new Date (2015-04-28));
        Pasien result = instance.getPasien(Id_Pasien);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

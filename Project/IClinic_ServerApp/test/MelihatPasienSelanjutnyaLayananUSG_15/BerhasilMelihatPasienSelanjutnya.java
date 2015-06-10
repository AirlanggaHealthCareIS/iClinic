/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MelihatPasienSelanjutnyaLayananUSG_15;

import Database.Entity.Antrian;
import ServerApplication.Server;
import ServerApplication.Service.USGServiceServer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import ServerApplication.model.TableModelLog;

/**
 *
 * @author Arline
 */
public class BerhasilMelihatPasienSelanjutnya implements Remote{

    USGServiceServer usgServiceServer;
    TableModelLog tableModelLog = new TableModelLog();
    
     public BerhasilMelihatPasienSelanjutnya() throws RemoteException {
        this.usgServiceServer = new USGServiceServer(tableModelLog);
    }
    
     
     /**
     * Test of Id_usg method, of class USGServiceServer.
     */
    @Test
    public void testId_usg() throws Exception {
        System.out.println("Id_usg");
        this.usgServiceServer = new USGServiceServer(tableModelLog);
//        USGServiceServer instance = new USGServiceServer();
        String instance = usgServiceServer.Id_usg();
        System.out.println(instance);
        String expResult = "USG0002";
//        String result = instance.Id_usg();
        assertEquals(expResult, instance);
    }
    
    
    /**
     * Test of Id_pasien method, of class USGServiceServer.
     */
    @Test
    public void testId_pasien() throws Exception {
        System.out.println("Id_pasien");
        this.usgServiceServer = new USGServiceServer(tableModelLog);
        Antrian antrian = new Antrian();
        Antrian instance = usgServiceServer.Id_pasien(antrian);
        System.out.println(instance);
        antrian.setId_Antrian("A0001");
        antrian.setId_Pasien("P0001");
        antrian.setJenis_Antrian("USG");
        antrian.setKeterangan("sehat");
//        USGServiceServer instance = new USGServiceServer();
        assertEquals(antrian, instance);
    }

    
     /**
     * Test of Nama_pasien method, of class USGServiceServer.
     */
    @Test
    public void testNama_pasien() throws Exception {
        System.out.println("Nama_pasien");
        this.usgServiceServer = new USGServiceServer(tableModelLog);
        String id_pasien = "P0001";
//        USGServiceServer instance = new USGServiceServer();
        String instance = usgServiceServer.Nama_pasien(id_pasien);
        System.out.println(instance);
        String expResult = "AGUS"; 
        assertEquals(expResult, instance);
    }
    
    
    /**
     * Test of ubahstatus method, of class USGServiceServer.
     */
    @Test
    public void testUbahstatus() throws Exception {
        System.out.println("ubahstatus");
        this.usgServiceServer = new USGServiceServer(tableModelLog);
//        Antrian antrian = new Antrian();
        String ID_ANTRIAN = "A0001";
//        USGServiceServer instance = new USGServiceServer();
        usgServiceServer.ubahstatus(ID_ANTRIAN);
//        instance.ubahstatus(ID_ANTRIAN);
    }

   
}
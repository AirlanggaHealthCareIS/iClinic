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
public class GagalMelihatPasienSelanjutnya implements Remote{
        USGServiceServer usgServiceServer;
        TableModelLog tableModelLog = new TableModelLog();
    
    public GagalMelihatPasienSelanjutnya() throws RemoteException{
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
        Antrian antrian = new Antrian();
        antrian.setId_Antrian("kosong");
        Antrian instance = usgServiceServer.Id_pasien(antrian);
        System.out.println(instance);
//        USGServiceServer instance = new USGServiceServer();
        Antrian expResult = antrian;
//        Antrian result = new Antrian();
//        result = instance.Id_pasien(antrian);
        assertEquals(expResult, instance);
        // TODO review the generated test code and remove the default call to fail.
    }

}
package MelihatDataTagihanTransaksiPasien_21;

import Database.Entity.Pembayaran;
import ServerApplication.Server;
import ServerApplication.Service.Bag_PembayaranServiceServer;
import ServerApplication.model.TableModelLog;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Tiara Ratna Sari 081211632014
 *
 */
public class BerhasilMelihatDataTagihanTransaksiPasien implements Remote {

    Bag_PembayaranServiceServer bag_PembayaranServiceServer;
    TableModelLog tableModelLog = new TableModelLog();

    public BerhasilMelihatDataTagihanTransaksiPasien() throws RemoteException {
        this.bag_PembayaranServiceServer = new Bag_PembayaranServiceServer(tableModelLog);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws RemoteException {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMeihatTotalTagihanPembayaran() throws Exception {
        System.out.println("MeihatTotalTagihanPembayaran");

        bag_PembayaranServiceServer = new Bag_PembayaranServiceServer(tableModelLog);
        String Id_Pasien = "P0001";
        Date tanggal = new java.util.Date();

        Pembayaran instance = bag_PembayaranServiceServer.MeihatTotalTagihanPembayaran(Id_Pasien, tanggal);
        System.out.println(instance.getID_PEMBAYARAN());
        System.out.println(instance.getID_PASIEN());
        System.out.println(instance.getTOTAL_USG());
        System.out.println(instance.getTOTAL_LAB());
        System.out.println(instance.getTOTAL_RESEP());
        System.out.println(instance.getTOTAL_REKAM());
        System.out.println(instance.getTOTAL_KECANTIKAN());
        System.out.println(instance.getTOTAL_HARGA());
        System.out.println(instance.getSTATUS());

        Pembayaran expResult = new Pembayaran();
        expResult.setID_PEMBAYARAN("BYR0001");
        expResult.setNAMA_PASIEN("AGUS");
        expResult.setTOTAL_USG(250000);
        expResult.setTOTAL_LAB(50000);
        expResult.setTOTAL_RESEP(50000);
        expResult.setTOTAL_REKAM(120000);
        expResult.setTOTAL_KECANTIKAN(0);
        expResult.setTOTAL_HARGA(562000);
        expResult.setSTATUS("HUTANG");

        assertEquals(expResult.getID_PEMBAYARAN(), instance.getID_PEMBAYARAN());
        assertEquals(expResult.getNAMA_PASIEN(), instance.getNAMA_PASIEN());
        assertEquals(expResult.getTOTAL_USG(), instance.getTOTAL_USG());
        assertEquals(expResult.getTOTAL_LAB(), instance.getTOTAL_LAB());
        assertEquals(expResult.getTOTAL_RESEP(), instance.getTOTAL_RESEP());
        assertEquals(expResult.getTOTAL_REKAM(), instance.getTOTAL_REKAM());
        assertEquals(expResult.getTOTAL_KECANTIKAN(), instance.getTOTAL_KECANTIKAN());
        assertEquals(expResult.getTOTAL_HARGA(), instance.getTOTAL_HARGA());
        assertEquals(expResult.getSTATUS(), instance.getSTATUS());
    }
}

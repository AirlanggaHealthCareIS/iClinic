package MencetakBuktiPembayaran_23;

import MelihatDataTagihanTransaksiPasien_21.*;
import Database.Entity.Pembayaran;
import ServerApplication.Server;
import ServerApplication.Service.Bag_PembayaranServiceServer;
import ServerApplication.model.TableModelLog;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
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
public class BerhasilMencetakBuktiPembayaranPembelianObat implements Remote {

    Bag_PembayaranServiceServer bag_PembayaranServiceServer;
    TableModelLog tableModelLog = new TableModelLog();

    public BerhasilMencetakBuktiPembayaranPembelianObat() throws RemoteException {
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
    public void testMencetakBuktiPembayaranLayananKesehatan() throws Exception {
        System.out.println("MencetakBuktiPembayaranLayananKesehatan");

        bag_PembayaranServiceServer = new Bag_PembayaranServiceServer(tableModelLog);
        String Id_Pembayaran = "BYR0001";

        List<Pembayaran> instance = bag_PembayaranServiceServer.getPembayaranPrintPo(Id_Pembayaran);

        Pembayaran expResult = new Pembayaran();
        expResult.setID_PEMBAYARAN("BYR0001");
        expResult.setNAMA_PASIEN("PEMBELIAN OBAT");
        expResult.setTOTAL_USG(0);
        expResult.setTOTAL_LAB(0);
        expResult.setTOTAL_RESEP(15800);
        expResult.setTOTAL_REKAM(0);
        expResult.setTOTAL_KECANTIKAN(0);
        expResult.setTOTAL_HARGA(15800);
        expResult.setSTATUS("HUTANG");

        assertEquals(expResult.getID_PEMBAYARAN(), instance.get(0).getID_PEMBAYARAN());
        assertEquals(expResult.getNAMA_PASIEN(), instance.get(0).getNAMA_PASIEN());
        assertEquals(expResult.getTOTAL_USG(), instance.get(0).getTOTAL_USG());
        assertEquals(expResult.getTOTAL_LAB(), instance.get(0).getTOTAL_LAB());
        assertEquals(expResult.getTOTAL_RESEP(), instance.get(0).getTOTAL_RESEP());
        assertEquals(expResult.getTOTAL_REKAM(), instance.get(0).getTOTAL_REKAM());
        assertEquals(expResult.getTOTAL_KECANTIKAN(), instance.get(0).getTOTAL_KECANTIKAN());
        assertEquals(expResult.getTOTAL_HARGA(), instance.get(0).getTOTAL_HARGA());
        assertEquals(expResult.getSTATUS(), instance.get(0).getSTATUS());
    }
}

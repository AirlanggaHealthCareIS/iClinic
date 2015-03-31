/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication;

import ServerApplication.Service.OfficesServiceServer;
import ServerApplication.Service.Detail_PembelianServiceServer;
import ServerApplication.Service.Detail_PenjualanServiceServer;
import ServerApplication.Service.KategoriServiceServer;
import ServerApplication.Service.PembelianServiceServer;
import ServerApplication.Service.PenjualanServiceServer;
import ServerApplication.Service.SuplierServiceServer;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Madridista
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        Registry server = LocateRegistry.createRegistry(6789);

        OfficesServiceServer barangService = new OfficesServiceServer(); //bikin server
        KategoriServiceServer kategoriService = new KategoriServiceServer();
        SuplierServiceServer suplierService = new SuplierServiceServer();
        PembelianServiceServer pembelianService = new PembelianServiceServer();
        PenjualanServiceServer penjualanService = new PenjualanServiceServer();
        Detail_PembelianServiceServer detail_PembelianService = new Detail_PembelianServiceServer();
        Detail_PenjualanServiceServer detail_PenjualanService = new Detail_PenjualanServiceServer();

        server.rebind("service", barangService);
        server.rebind("service1", kategoriService);
        server.rebind("service2", suplierService);
        server.rebind("service3", pembelianService);
        server.rebind("service4", penjualanService);
        server.rebind("service5", detail_PembelianService);
        server.rebind("service6", detail_PenjualanService);

        System.out.println("Server Berhasil Berjalan");
    }

}

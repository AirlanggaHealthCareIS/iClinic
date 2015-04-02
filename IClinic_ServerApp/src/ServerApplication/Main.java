/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerApplication;

import Database.Service.AdministratorService;
import Database.Service.Bag_PendaftaranService;
import ServerApplication.Service.AdministratorServiceServer;
import ServerApplication.Service.ApotekerServiceServer;
import ServerApplication.Service.Bag_PembayaranServiceServer;
import ServerApplication.Service.Bag_PendaftaranServiceServer;
import ServerApplication.Service.DokterServiceServer;
import ServerApplication.Service.KecantikanServiceServer;
import ServerApplication.Service.KepalaKlinikServiceServer;
import ServerApplication.Service.LabServiceServer;
import ServerApplication.Service.USGServiceServer;
import ServerApplication.Utilities.DatabaseUtilities;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 *
 * @author Tiara Ratna Sari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        // TODO code application logic here
        Registry server = LocateRegistry.createRegistry(6789);
        
        AdministratorServiceServer administratorServiceServer = new AdministratorServiceServer();
        ApotekerServiceServer apotekerServiceServer = new ApotekerServiceServer();
        Bag_PembayaranServiceServer bag_PembayaranServiceServer = new Bag_PembayaranServiceServer();
        Bag_PendaftaranServiceServer bag_PendaftaranServiceServer = new Bag_PendaftaranServiceServer();
        DokterServiceServer dokterServiceServer = new DokterServiceServer();
        KecantikanServiceServer kecantikanServiceServer = new KecantikanServiceServer();
        KepalaKlinikServiceServer kepalaKlinikServiceServer = new KepalaKlinikServiceServer();
        LabServiceServer labServiceServer = new LabServiceServer();
        USGServiceServer uSGServiceServer = new USGServiceServer();
                
        server.rebind("service", administratorServiceServer);
        server.rebind("service1", apotekerServiceServer);
        server.rebind("service2", bag_PembayaranServiceServer);
        server.rebind("service3", bag_PendaftaranServiceServer);
        server.rebind("service4", dokterServiceServer);
        server.rebind("service5", kecantikanServiceServer);
        server.rebind("service6", kepalaKlinikServiceServer);
        server.rebind("service7", labServiceServer);
        server.rebind("service8", uSGServiceServer);
                
        System.out.println("Server Berhasil Berjalan");
    }

}

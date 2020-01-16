 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.linggapurnama.latihanmvcjdbc.main;

import edu.linggapurnama.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.linggapurnama.latihanmvcjdbc.entity.Pelanggan;
import edu.linggapurnama.latihanmvcjdbc.error.PelangganException;
import edu.linggapurnama.latihanmvcjdbc.service.PelangganDao;
import edu.linggapurnama.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 */
public class IF110118038LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(IF110118038LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
    
}

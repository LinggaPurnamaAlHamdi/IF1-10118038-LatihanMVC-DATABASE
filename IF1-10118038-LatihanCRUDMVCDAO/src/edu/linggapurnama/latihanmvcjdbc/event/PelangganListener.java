/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.linggapurnama.latihanmvcjdbc.event;

import edu.linggapurnama.latihanmvcjdbc.entity.Pelanggan;
import edu.linggapurnama.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
}

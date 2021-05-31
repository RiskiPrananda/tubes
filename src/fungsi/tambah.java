/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class tambah {
    
    public static  double totalHarga(DefaultTableModel dataModel){
        
        double totalHarga = 0;
        
        ArrayList <String> numdata = new ArrayList <String>();

        for(int count = 0; count < dataModel.getRowCount(); count++){
            totalHarga += Double.valueOf(String.valueOf(dataModel.getValueAt(count, 5).toString()));
        }
        return totalHarga;
    }
}

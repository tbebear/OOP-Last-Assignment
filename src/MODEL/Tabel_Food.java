/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shintadl
 */
public class Tabel_Food extends AbstractTableModel {
    List <Food> foodList;
    // 
    public Tabel_Food(List<Food> foodList) {
        this.foodList = foodList;
    }
    
    @Override
    public int getRowCount() {
        return foodList.size();
    }
    
    public int getColumnCount() {
        return 1;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return foodList.get(rowIndex).getfoodName();
    }
    
    public String getColumnName() {
        return "foodName";
    }
}
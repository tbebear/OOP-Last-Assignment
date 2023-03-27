/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Implement;

import MODEL.Food;
import VIEW.HomePage;
import java.util.List;

/**
 *
 * @author shintadl
 */
public interface Homeable {

    public List<Food> FoodTable();
    public List<Food> SearchFoodTable(String foodName);
}

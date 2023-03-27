/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author shintadl
 */
public class Food {
    private int foodId;
    private String foodName;
    private String foodDesc;
    private String foodRecipe;
    
    private int getfoodId() {
        return foodId;
    }
    
    private void setfoodId(int foodId) {
        this.foodId = foodId;
    }
    
    public String getfoodName() {
        return foodName;
    }
    
    public void setfoodName(String foodName) {
        this.foodName = foodName;
    }
    
    public void setfoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }
    
    public String getfoodRecipe() {
        return foodRecipe;
    }
    
    public void setfoodRecipe(String name) {
        this.foodRecipe = foodRecipe;
    }
}

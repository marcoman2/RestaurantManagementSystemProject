/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagementsys;

/**
 *
 * @author WMarcoMan
 * Subscribe our Channel for support --> https://www.youtube.com/@marcomanchannel
 */
public class categories {
    
    private String productId;
    private String name;
    private String type;
    private Double price;
    private String status;
    
    public categories(String productId, String name, String type, Double price, String status){
        this.productId = productId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.status = status;
    }
    
    public String getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public Double getPrice(){
        return price;
    }
    public String getStatus(){
        return status;
    }
    
}

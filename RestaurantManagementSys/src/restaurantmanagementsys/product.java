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
public class product {
    
    private Integer id;
    private String productId;
    private String name;
    private String type;
    private Double price;
    private Integer quantity;
    
    public product(Integer id, String productId, String name, String type, Double price, Integer quantity){
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Integer getId(){
        return id;
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
    public Integer getQuantity(){
        return quantity;
    }
    
}

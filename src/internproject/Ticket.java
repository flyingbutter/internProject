package internproject;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhammed
 */
public enum Ticket {
    /**
     * Predefined tickets 
     */
    Opera (300),
    BungeeJumping   (100),
    Cinema(30);
    

    private final double price;   // $$$
    //private final String name; //name
    Ticket(double price) {
        this.price = price;
        //this.name=name;
        
    }
    public double getPrice() {
        return price; 
        
    }
   // private String getName(){ return name; }

    public static String[] getNames() {
    return Arrays.toString(Ticket.values()).replaceAll("^.|.$", "").split(", ");
    
}
   
}
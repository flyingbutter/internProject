/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muhammed
 */
public abstract class DefPromo implements PromotionInterface{
    private String name = "";                // promotion name
    private List<Ticket> required = new ArrayList<>();   // requirements for discount
    private List<Ticket> discount = new ArrayList<>();   // discount as tickets
    private double cash;             // discount as cash

   
    
}

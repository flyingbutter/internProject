/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internproject;

import java.util.List;

/**
 *
 * @author muhammed
 */
public interface PromotionInterface {
    public boolean addDiscount(Ticket t);
    public boolean addRequirement(Ticket t);
    public boolean setCashDiscount(double c);
    public boolean setName(String s);
    
    public double getCashDiscount();
    public List<Ticket> getDiscount();
    public List<Ticket> getRequired();
    
}

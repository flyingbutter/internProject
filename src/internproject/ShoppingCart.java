package internproject;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author muhammed
 */
public class ShoppingCart {

    private List<Ticket> ticketsToBuy=new ArrayList<Ticket>();
public ShoppingCart()
{
}
    
   public ShoppingCart(List<Ticket> t)
   {
   this.ticketsToBuy=t;
   }
    public boolean add(Ticket t) {
        try {
            ticketsToBuy.add(t);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<Ticket> getList()
    {
        return ticketsToBuy;
    }

    public void clear(){
    ticketsToBuy.clear();
    }
    public double total() {
        double sum = 0;

        Iterator itr = ticketsToBuy.iterator();
        while (itr.hasNext()) {
            Ticket element = (Ticket) itr.next();
            sum += element.getPrice();
        }

        return sum;
    }
    
}

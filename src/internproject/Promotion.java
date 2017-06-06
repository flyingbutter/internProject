package internproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class Promotion extends DefPromo implements java.io.Serializable{

    private String name = "";                // promotion name
    private List<Ticket> required = new ArrayList<>();   // requirements for discount
    private List<Ticket> discount = new ArrayList<>();   // discount as tickets
    private double cash;             // discount as cash

    Promotion() {
    }

    // private List<Promotion> promotionList; 
    Promotion(List<Ticket> required, List<Ticket> discount, double cash) {
        this.cash = cash;
        this.discount = discount;
        this.required = required;
    }

    public List<Ticket> getRequired() {
        return required;
    }

    public double totalDiscount() {
        double sum = 0;

        for (Ticket element : discount) {
            sum += element.getPrice();
        }

        return sum;
    }

    public List<Ticket> getDiscount() {
        return discount;
    }

    public double getCashDiscount() {
        return cash;
    }

    public void clearInstance() {
        required.clear();
        discount.clear();

    }

    public boolean addRequirement(Ticket t) {
        try {
            required.add(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setName(String t) {
        try {
            this.name = t;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setCashDiscount(double t) {
        try {
            this.cash = t;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean addDiscount(Ticket t) {
        try {
            discount.add(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Promotion> deserializePromotion() {
        List<Promotion> p = null;
        try {

            FileInputStream fileIn = new FileInputStream("D:\\promotions.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            p = (List<Promotion>) in.readObject();
            in.close();
            fileIn.close();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return p;
        }

    }

    public boolean serializePromotions(List<Promotion> p) {

        try {

            File serFile = new File("D:\\promotions.ser");
            serFile.createNewFile(); // if file already exists will do nothing 

            FileOutputStream fileOut = new FileOutputStream(serFile, false);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}

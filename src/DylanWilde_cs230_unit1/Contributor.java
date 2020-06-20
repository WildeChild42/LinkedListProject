/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DylanWilde_cs230_unit1;

/**
 *
 * @author Dylan Wilde
 */
public class Contributor {
    
    //Declare variables needed for contributors
    private final String name;
    private final String city;
    private final String country;
    private final String phoneNumber;
    private final double amount;
    private final int accountID;
    
    public Contributor(String name, String city, String country, String phone, double amount, int id) //Custom constructor
    {
        this.name = name;
        this.city = city;
        this.country = country;
        this.phoneNumber = phone;
        this.amount = amount;
        this.accountID = id;        
    }
    
    @Override
    public String toString() //Format data
    {
        return String.format("%s,%s,%s,%s,%s,%s",name,city,country,phoneNumber,amount,accountID);
    }
}

package INTERFACE;

import java.io.*;   
import java.util.*;   
// class College  
class Vechicle {   
    public String Vechicle_Name;   
    public String Fuel_Type;   
    Vechicle(String name, String Type)   
    {   
        this.Vechicle_Name = name;   
        this.Fuel_Type = Type;   
    }   
}   
// University has more than one college.   
class Saurabh {   
    // reference to refer to list of college.   
    private final List<Vechicle> vechicles;   
    Saurabh(List<Vechicle> vechciles)  
    {  
        this.vechicles = vechciles;  
    }   
    // Getting total number of colleges  
    public List<Vechicle> TotalVeclces()   
    {   
        return vechicles;   
    }   
}   
class CompositionExample {   
    public static void main(String[] args)   
    {   
        // Creating the Objects of College class.   
        Vechicle v1   
            = new Vechicle("Ducati", "Petrol");   
        Vechicle v2   
            = new Vechicle("Honda Accord", "Diesel");   
   
        List<Vechicle> vechicle = new ArrayList<Vechicle>();   
        vechicle.add(v1);   
        vechicle.add(v2);   
//        vechicle.add(c3);   
        Saurabh sv = new Saurabh(vechicle);   
        List<Vechicle> vechicles = sv.TotalVeclces();   
        for (Vechicle vh : vechicles) {   
            System.out.println("Vechcle Name : " + vh.Vechicle_Name  
                               + " and "  
                               + " Fuel_Type : " + vh.Fuel_Type);   
        }   
    }   
}  
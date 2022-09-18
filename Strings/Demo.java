package Strings;

import java.io.*;   
import java.util.*;   
// class Vechcile 
class Vechicle{  
    public String vechicle_name;   
    public String fuel_type;   
    Vechicle(String name, String fuel_type)   
    {   
        this.vechicle_name = name;   
        this.fuel_type = fuel_type;   
    }   
}   
// Saurabh has  one or more vechcles
class Saurabh {   
    // reference to refer to list of vechicle  
    private final List<Vechicle> vechciles;   
    Saurabh(List<Vechicle> vechicles)  
    {  
        this.vechciles = vechicles;  
    }   
    // Getting total number of vechciles 
    public List<Vechicle> getTotal()   
    {   
        return vechciles;   
    }   
}   
class CompositionExample {   
    public static void main(String[] args)   
    {   
        // Creating the Objects of vechcle class.   
        Vechicle v1   
            = new Vechicle("Ducati", "Petrol");   
        Vechicle v2   
            = new Vechicle("Honda Accord", "Diesel");   
        Vechicle v3 = new Vechicle("Ducati",   
                           "Petrol");   
        // Creating list which contains the no. of vechcle.   
        List<Vechicle> vechicles = new ArrayList<Vechicle>();   
        vechicles.add(v1);   
        vechicles.add(v2);   
        vechicles.add(v3);   
        Saurabh sv = new Saurabh(vechicles);   
        List<Vechicle> vechicles2 = sv.getTotal();   
        for (Vechicle vh : vechicles) {   
            System.out.println("Vechcile Name : " + vh.vechicle_name   
                               + " and "  
                               + " Fuel Type : " + vh.fuel_type);   
        }   
    }   
}  

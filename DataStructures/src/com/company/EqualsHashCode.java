package com.company;

public class EqualsHashCode {

	public static void main(String[] args) {
		
		String a = "Andrew";  
        String b = "Andrew";  
        
        System.out.println();
  
        if(a.equals(b)){     
            System.out.println("a & b are equal variables, and their respective hashvalues are:"
        + " "+ a.hashCode() + " & " + b.hashCode());  
          
        }  
  
        String c = new String("Maria");  
        String d= new String("Julie");  
  
        if(!c.equals(d))
        {      
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:"
        + " "+ c.hashCode() + " & " + d.hashCode());  

	}

}
}

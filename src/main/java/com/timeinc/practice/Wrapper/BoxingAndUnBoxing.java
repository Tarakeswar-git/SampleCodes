package com.timeinc.practice.Wrapper;

public class BoxingAndUnBoxing {
	
	public static void main(String[] args) {
		
		//Boxing :This operation of wrapping primitive content into an object is called boxing.
		
		byte b = 10;             
        Byte B = new Byte(b);   
        System.out.println(B);
 
        short s = 15;              
        Short S = new Short(s); 
        System.out.println(S);
        
        //Auto-Boxing: 
        
        byte b1 = 10;   
        Byte B1 = b1;
        System.out.println(B1);
        
        //UnBoxing :unwrapping wrapper object into corresponding primitive data.
        
        Integer I = new Integer(15);   
        int i = I.intValue(); 
        
        System.out.println(i);
 
        Long L = new Long(50);     
        long l = L.longValue(); 
        
        System.out.println(l);
        
        //Auto-Unboxing
        
        Float F = new Float(20);      
        float f = F;  
        System.out.println(f);
 
        Double D = new Double(20.5);   
        double d = D;  
        
        System.out.println(d);
		
	}

}

package com.sayriv.returnHowItWorks;

public class Ret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t = true;
        System.out.println("Before the return.");
      
        if (t)
            return;
  
        // Compiler will bypass every statement 
        // after return
        System.out.println("This won't execute.");
	}

}

package com.kipalog;

import javax.inject.Named;

@Named
public class SpellChecker {
   public SpellChecker(){
	      System.out.println("Inside SpellChecker constructor." );
   }

   public void checkSpelling(){
      System.out.println("Inside checkSpelling." );
   }
}

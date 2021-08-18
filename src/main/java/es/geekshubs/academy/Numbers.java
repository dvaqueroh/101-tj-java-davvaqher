package es.geekshubs.academy;

public class FizzBuzz {

	/*
	   * Apply Method
	   * @param count
	   * @return
	   */
	
  public String apply(final int count) {
	  
	  for (int i = 1; i < count; i++) {
		  if(i%3==0) {// si el multiplo de 3
			  System.out.println("GREEKS"); 
		  }
		  else if(i%5==0) {// si el multiplo de 3
			  System.out.println("HUBS");
		  }
		  else { // si no lo es de ninguno de los dos
			  System.out.println(i);
		  }
		  
		
	  }// fin for
   return null;
  }// fin apply
  
}// fin class

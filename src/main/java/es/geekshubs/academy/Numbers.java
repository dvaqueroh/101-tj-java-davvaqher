package es.geekshubs.academy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
	
	/* No he conseguido hacerlo funcionar, debe ser un problema con el cambio de entero a double, 
	 * tras mucho tiempo e intentos cambio a otro ejercicio*/

  /**
   * Apply Method
   * @param input
   * @return
   */
	//ArrayList<Integer> nPositivos;
	//ArrayList<Integer> nNegativos;
	//ArrayList<Integer> nZero;
	int numPos,numNeg,numZero;
	Double  resPos, resNeg, resZero;
	
	
  public List<String> apply(final List<Integer> input) {
	  
	  System.out.println("lista numeros = "+ input.size());
	  for (int i = 0; i < input.size(); i++) {
		  int num = input.get(i);
		  System.out.println("numero: "+ num);
		  if(num>0) {
			  //nPositivos.add( num);
			  numPos+= num;
		  }
		  else if (num<0) {
			  //nNegativos.add( num);
			  numNeg += num;
		  }
		  
		  else if(num == 0) {
			  //nZero.add(num);
			  numZero += num;
		  }
		  
		  // resultados
		  resPos = (double) (numPos / input.size());
		  resNeg = (double) (numNeg / input.size());
		  resZero = (double) (numZero / input.size());
		  
	  }
	  // pasamos los resultados en String
	  List<String> resultado = Arrays.asList(Double.toString(resPos), Double.toString(resNeg), Double.toString(resZero));
	  return resultado;
  }// fin metodo apply

}// fin clase

import java.util.Scanner;

public class quinto {
	public  static  void  main ( String [] args ) {
		
		Scanner reander = new Scanner ( System . in );
	       System.out.println ( " Ingrese un numero " );
	       int num1 = reander. nextInt ();
	       System.out.println ( " Ingrese otro numero " );
	       int num2 = reander. nextInt ();
	       System.out.println( " Ingrese el n�mero de los m�ltiples que desee que no aparezcan: " );
	       int mul =reander. nextInt ();
	       if (num1 > num2) {
	           for( int i = num2; i <= num1; i ++ ) {
	        	   if (i % mul !=  0 ) {
	        		   System.out.println (i);
	           }
	        } 
	        } else {
	        	for ( int i = num1; i <= num2; i ++ ) {
	        		if (i % mul !=  0 ) {
	        			System.out.println(i);
	        		}   
	        	}
	        }
		}
}

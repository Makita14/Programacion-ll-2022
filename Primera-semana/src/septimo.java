import java.util.Scanner;

public class septimo {
public  static  void  main ( String [] args ) {
		
		Scanner reander = new Scanner( System  . in);
		
	    String usuarioA = " Enzo " ;
        int contrase�aA = 4321 ;
        	        
        System.out.println  ( " Ingrese un Usuario: " );		
        String usuario =reander. next();		
		
        System.out.println  ( " Ingrese una contrase�a: " );		
        int contrase�a =reander . nextInt ();
		
		if ((usuario != usuarioA) && (contrase�a != contrase�aA)) {
			System.out.println ( " Ud. no es Enzo " );
		} else{
			System.out.println  ( " Bienvenido Enzo " );
		}
	}
}

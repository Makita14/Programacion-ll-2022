import java.util.Scanner;

public class octavo {
public  static  void  main ( String [] args ) {
		
		Scanner leer= new Scanner ( System  . in);
	    String usuarioA = " Enzo " ;
        int contrase�aA = 4321 ;
        	        
        System.out.println  ( " Ingrese un Usuario: " );		
        String usuario = leer.next();		
        System.out.println  ( " Ingrese una contrase�a: " );		
        int contrase�a = leer . nextInt ();
		
		if ((usuario != usuarioA) && (contrase�a != contrase�aA)) {
			System.out.println ( " Ud. no es Enzo " );
		} else{
			System.out.println  ( " Bienvenido Enzo " );
			
			System.out.println  ( "� Desea actualizar su contrase�a? " );
			System.out.println  ( " 1- Nueva contrase�a " );
			System.out.println  ( " 2- Salir " );
			String opcion = leer .next();
			
			if (opcion == ( " 1-Nueva contrase�a " )); {
				System.out.println  ( " Ingrese una contrase�a: " );		
		        int con = leer . nextInt ();
		        System.out.println ( " Su contrase�a ha sido cambiada " );
		        System.out.println ( " Su nueva contrase�a es: " + con);
			}
			
			if (opcion == ( " 2-Salir " )) {
				System.out.println ( "   Bienvenido, usted se ha registrado correctamente " );	
			}
		}			
	}
}
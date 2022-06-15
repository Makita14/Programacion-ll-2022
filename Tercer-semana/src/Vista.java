import java.util.Scanner;

public class Vista {
	public  static  void  escribirAtributo ( String  atributo , String  valor ) {
		System.out.println (atributo + " : " + valor);
	}
	
	 public static String leerAtributo ( String atributo ) {  
		Scanner  reander = new Scanner( System . in);
		System.out.println ( " Ingrese el " + atributo);
		String artA = reander .next();
		return artA;
	}

}

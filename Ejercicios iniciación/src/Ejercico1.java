import java.util.Scanner;

public class Ejercico1 {
	//main + ctrl espacio te sale public... 
	public static void main(String[] args) {
		/* 	datos de entrada: capital en el banco y porcentaje mensual
		    datos de salida: resultado de la inversión */
		
		Scanner teclado = new Scanner(System.in); //para introducir un número y que te lo lea
		
		float capital;
		float retrubución; 
		
		//sout + ctrl espacio 
		System.out.println("Introduzca su capital: ");
		capital = teclado.nextFloat(); 
		
		System.out.println("Retrubución: " + capital * 0.02f); //otra manera de hacerlo sin usar los que tienen // en el margen (izquierda)
		teclado.close(); } //para que no salga advertencia en teclado 
		
//		retribución = capital * .02f //hace lo mismo que lo de abajo / el 0 se puede omitir en 0.02
		
		/* retribución = (float) (capital * 1.02);
		dices que te da igual que no sea double (de otra manera habria que cambiar los float de arriba por double  */
	
//		System.out.println("Retribución: " + retribucion); //le suma el valor del "retribucion = capital * 1.02f" de antes
	
		//conversion de tipo implicita
		/* antes se extrae de la memoria de la variable y se convierte a cadena de caracteres, una vez convertido se concatena
		concatenacion coger un trozo de texto y unirlo a otro */
	
		//hay que formatear la salida para que salgan dos decimales y salga el resultado con coma
	}



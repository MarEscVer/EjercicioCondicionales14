package unico;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/* Realiza un programa que nos diga si hay probabilidad de que nuestra
 * pareja nos está siendo infiel. El programa irá haciendo preguntas que
 * el usuario contestará con verdadero o falso. Cada pregunta contestada
 * como verdadero sumará 3 puntos. Las preguntas contestadas con falso no
 * suman puntos. A continuación se listan las preguntas del test.
 */
			String respuesta;
		    int puntos = 0;
		    
		    System.out.println("TEST DE FIDELIDAD");
		    System.out.println("Este programa te dirá si hay probabilidad de que tu pareja está siendo infiel.");

		    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }

		    System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		    
		    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }

		    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		    
		    System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		    
		    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		        
		    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		    
		    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		    
		    System.out.print("9. Has notado que últimamente se perfuma más.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		    
		    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
		    respuesta = teclado.nextLine();
		    if ( respuesta.equalsIgnoreCase("v") ) {
		      puntos += 3;
		    }
		    
		  
// Texto de resultados
		    
		    if ( puntos <= 10 ) {
		      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		    }
		    
		    if ( (puntos > 11 ) && (puntos <= 22) ) {
		      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");    
		    }
		    
		    if ( puntos >= 22 ) {
		      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
		    }
	}
}
import java.util.*;

public class Bisiesto {  
static Scanner sc = new Scanner(System.in);
    
public static void main(String args[]) {
    String Pregunta = "si";
        
    int a\u00f1o;
    System.out.print("Ingrese el año: ");
        do {
        try {
        a\u00f1o = sc.nextInt();          
                
            if ((a\u00f1o > 999) && (a\u00f1o < 10000)) {
                              
                    if((a\u00f1o % 4 ==0) && (a\u00f1o % 100 != 0 || a\u00f1o % 400 == 0)) {          
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
             
                    Scanner entrada=new Scanner(System.in);
                    
                    System.out.println(" ");
                    System.out.print("¿Desea ingresar otro año? (si/no): ");
                    Pregunta=entrada.nextLine();
                    System.out.println(" ");                 
                    System.out.print("Ingrese el año: ");
                    
            } else {
                    System.out.println("\nEl valor numérico debe ser de 4 dígitos");
                    Bisiesto.main (null); 
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Hubo un error. Favor de escribir el año entero y con solamente dígitos.");
                 System.exit(0);
                } 
        
        } while (Pregunta.equals("si")); {
                    System.out.println("Fin del programa");
                    System.exit(0);
        
                    }    
}
}
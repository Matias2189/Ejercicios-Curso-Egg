
package ejercicio14;

import java.util.Scanner;


public class Ejercicio14 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        String opcion = "";
        System.out.println("Ingrese cantidad de euros a convertir");
        euros = leer.nextDouble();
        int opc;
        do {
            System.out.println("Convertir 1-Libras 2-Dolar 3-Yenes");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    opcion = "Libras";
                    break;
                case 2:
                    opcion = "Dolar";
                    break;
                case 3:
                    opcion = "Yenes";
                    break;
                default:
                    System.out.println("Opcion ingresada no es correcta");
            }
        } while (opc >= 4);
        
        conver(euros,opcion);
    } 
    public static void conver(double euros, String opcion) {
         
         if (opcion.equals("Libras")){
             System.out.println("El monto ingresado corresponde a: "+(euros*0.86)+" Libras" );
         }
         if (opcion.equals("Dolar")){
             System.out.println("El monto ingresado corresponde a: "+(euros*1.28611)+" Dolares" );
         }
         if (opcion.equals("Yenes")){
             System.out.println("El monto ingresado corresponde a: "+(euros*129.852)+" Yenes" );
         }
               
        }
     }


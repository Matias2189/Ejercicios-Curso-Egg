
package servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in);
     public void llenarCafetera(Cafetera C) {
         C.setCantidadActual(C.getCapacidadMaxima());
         System.out.println("Se ha llenado la cafetera, capacidad actual: "+C.getCantidadActual()+"ml");
    }
    
  /* • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
   public void servirTaza(Cafetera C) {
       System.out.println("Ingrese tamaño de taza en ml:"); 
       int t = leer.nextInt();
       do{
           if (t<=0) {
               System.out.println("Debe ingresar un numero positivo mayor que cero");
               t=leer.nextInt();
           }
       }while(t<=0);
       if (t>C.getCantidadActual() && C.getCantidadActual()!=0) {
           System.out.println("Cantidad de cafe actual "+C.getCantidadActual());
           System.out.println("Se servira la cantidad restante de cafe");
           System.out.println("Se sirvio "+C.getCantidadActual()+"ml de cafe en su taza y la cafetera quedo vacia, debe recargar cafetera para continuar o de lo contario salir");
           C.setCantidadActual(0);
            }else if (C.getCantidadActual()==0){
                 System.out.println("La cafetera esta vacia, debe recargar cafetera para continuar o de lo contario salir");
            }else{
                C.setCantidadActual(C.getCantidadActual()-t);
                System.out.println("Se sirvio taza correctamente, la capacidad actual de la cafetera es de: "+C.getCantidadActual()+"ml"); 
       }
    }
    
    public void vaciarCafetera(Cafetera C) {
        C.setCantidadActual(0);
        System.out.println("Se vacio cafetera, capacidad actual: "+C.getCantidadActual()+"ml");
    }
    
   /* • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
    public void agregarCafe(Cafetera C) {
        System.out.println("Ingrese cantidad de cafe a agregar: ");
        int agregar=leer.nextInt();
        while (agregar<=0) {
            System.out.println("Debe agregar una cantidad positiva mayor a 0");
        } 
        C.setCantidadActual(C.getCantidadActual()+agregar);
        System.out.println("Se agrego "+agregar+"ml de cafe en la cafetera, cantidad actual de cafe: "+C.getCantidadActual()+"ml");
    }
    
}

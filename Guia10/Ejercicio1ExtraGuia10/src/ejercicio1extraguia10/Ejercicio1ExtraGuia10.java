/*
 En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package ejercicio1extraguia10;

import entidad.Alquiler;
import entidad.Barco;
import entidad.BarcoMotor;
import entidad.Velero;
import entidad.YatesDeLujo;
import java.util.Scanner;

public class Ejercicio1ExtraGuia10 {

    public static void main(String[] args) {
        Alquiler a1 = new Alquiler();
        Barco b1 = new Barco();
        Velero v1 = new Velero(3, "MUC916", 15, 2013);
        BarcoMotor bM = new BarcoMotor(200, "BQK758", 30, 1998);
        YatesDeLujo y1 = new YatesDeLujo(18, 300, "AA500BB", 50, 2016);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double modulo = 0;

        int opcion;

        do {
            System.out.println("\tBIENVENIDO AL MUELLE");
            System.out.println("");
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Seleccionar Barco a alquilar");
            System.out.println("2 - Seleccionar dias de alquiler");
            System.out.println("3 - Ver precio final");
            System.out.println("4 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int opc;

                    do {
                        System.out.println("\t.:Menu:.");
                        System.out.println("1 - Barco Velero");
                        System.out.println("2 - Barco a Motor");
                        System.out.println("3 - Yate de Lujo");
                        System.out.println("4 - Salir");
                        System.out.println("Elija su opcion:");
                        opc = leer.nextInt();

                        switch (opc) {
                            case 1:
                                b1.setAñoDeFanricacion(v1.getAñoDeFanricacion());
                                b1.setEslora(v1.getEslora());
                                b1.setMatricula(v1.getMatricula());
                                modulo = v1.getNdeMastiels() + (v1.getEslora() * 10);
                                a1.setBar(b1);
                                System.out.println("Se selecciono el velero matricula " + v1.getMatricula());
                                System.out.println("Este velero tiene "+v1.getEslora()+"m de eslora y "+ v1.getNdeMastiels() + " mastiles");
                                break;
                            case 2:
                                b1.setAñoDeFanricacion(bM.getAñoDeFanricacion());
                                b1.setEslora(bM.getEslora());
                                b1.setMatricula(bM.getMatricula());
                                modulo = bM.getPotenciaCV() + (bM.getEslora() * 10);
                                a1.setBar(b1);
                                System.out.println("Se selecciono el barco matricula " + bM.getMatricula());
                                System.out.println("Este barco tiene "+ bM.getPotenciaCV() + "CV y "+bM.getEslora()+"m de eslora");
                                break;
                            case 3:
                                b1.setAñoDeFanricacion(y1.getAñoDeFanricacion());
                                b1.setEslora(y1.getEslora());
                                b1.setMatricula(y1.getMatricula());
                                modulo = y1.getPotenciaCV() + y1.getEslora() + (y1.getEslora() * 10);
                                a1.setBar(b1);
                                System.out.println("Se selecciono el barco matricula " + y1.getMatricula());
                                System.out.println("Este Yate tiene "+ y1.getPotenciaCV() + "CV y " + y1.getCamarotes() + " Camarotes, y "+y1.getEslora()+"m de eslora");
                                break;
                            case 4:
                                System.out.println("Hasta Luego...");
                                break;
                            default:
                                System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                                break;
                        }
                    } while (!(opc == 4));
                    break;
                case 2:
                    System.out.println("Ingrese dias de alquiler del barco:");
                    a1.setDias(leer.nextInt());
                    break;
                case 3:
                    if (a1.getBar() == null) {
                        System.out.println("Debe seleccionar un tipo de barco");
                    } else if (a1.getDias() == null) {
                        System.out.println("Seleccione cantidad de dias de alquiler");
                    } else {
                        System.out.println("El monto de alquiler del barco seleccionado es de $" + a1.getDias() * modulo);
                    }
                    break;
                case 4:
                    System.out.println("Hasta Luego...");
                    break;

                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 4));

    }

}

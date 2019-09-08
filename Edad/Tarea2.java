import java.util.*;
import  java.lang.Math;


public class Tarea2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("**********************************************************");
        System.out.println("Bienvenido al calculador de edad actual");
        System.out.println("Ingresa el año de nacimiento");
        int anoNacimiento = entrada.nextInt()-1900;
        System.out.println("Ahora ingrese el número del mes de nacimiento");
        int mesNacimiento = entrada.nextInt() ;
        System.out.println("Por último ingrese el día de nacimiento");
        int diaNacimiento = entrada.nextInt() ;


        if (anoNacimiento > 0 && mesNacimiento < 12 && mesNacimiento > -1
                && diaNacimiento > 0 && diaNacimiento < 32){
            Date dateActual = new Date();
            Date dateNacimiento = new Date(anoNacimiento,mesNacimiento,diaNacimiento);
            System.out.println(dateNacimiento.toString());

            int comparador = dateNacimiento.compareTo(dateActual);
            if (comparador < 0){
                int diaActual = dateActual.getDate();
                int mesActual = (dateActual.getMonth() + 1) ;
                int anoActual = dateActual.getYear();
                boolean salida = true;
                
                System.out.println("Has ingresado una fecha valida, seleccione una opción:");

                do{
                    System.out.println("[1]Edad en años    [2]Edad en años y meses   [3]Edad en año, mes y días  [0]Salir del programa ");
                    int menu = entrada.nextInt();
                    String faltan = "";
                    int meses = 0;
                    int a = 0;
                    int b = 0;

                    switch (menu){

                        case 1:
                            if (mesActual <= mesNacimiento ){
                                a = -1;
                            }
                            if (diaActual <= diaNacimiento){
                            }

                            System.out.println("Tienes: " + (anoActual -anoNacimiento  + a ) + " años");
                            break;
                        case 2:
                            if (mesActual <= mesNacimiento ) {
                                a = -1;
                                b = 0;
                                faltan = " y para tu cumpleaños faltan ";
                                if (diaActual > diaNacimiento){
                                    a = 0;
                                    faltan = "";
                                }
                            }else{
                                if (diaActual < diaNacimiento) {
                                    b = 0;
                                }else {
                                    b = 1;
                                    meses = -31;
                                }
                            }
                            System.out.println("Tienes:" + (anoActual -anoNacimiento + a) + " años " + faltan +
                            + (Math.abs(mesActual - mesNacimiento) - b)  + " meses" );
                            break;
                        case 3:
                            if (mesActual <= mesNacimiento ) {
                                a = -1;
                                b = 0;
                                faltan = " y para tu cumpleaños faltan ";
                                if (diaActual > diaNacimiento){
                                    a = 0;
                                    faltan = "";
                                }
                            }else{
                                if (diaActual < diaNacimiento) {
                                    b = 0;
                                }else {
                                        b = 1;
                                        meses = -31;
                                }
                            }
                            System.out.println("Tienes: " +   (anoActual -anoNacimiento + a) + " años, " + faltan
                                    + (Math.abs(mesActual -mesNacimiento) - b)  + " meses y " + Math.abs(  diaActual - diaNacimiento + meses) + " días" );
                            break;
                        case 0:
                            salida = false;
                            break;
                        default:
                            System.out.println("Elige una opción valida");

                    }

                }while (salida);
            }else {
                System.out.println("Esa fecha todavía no ha pasado");
            }
        } else {
            System.out.println("Fecha de nacimiento no valida");
        }

        System.out.println("Gracias por su visita");
        System.out.println("**********************************************************");
    }
}

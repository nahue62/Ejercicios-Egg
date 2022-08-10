/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package guia5_01;
import java.util.Scanner;

/**
 *
 * @author hered
 */
public class Java12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena, primerCaracter, ultimoCaracter;
        String FDE = "&&&&&";
        int contadorCorrectas, contadorIncorrectas, longitud;
        contadorCorrectas = 0;
        contadorIncorrectas = 0;
        
        do{
            System.out.println("Ingrese una cadena: ");
            cadena = sc.nextLine();
            longitud = cadena.length();
            if(longitud <= 5 && !cadena.equals(FDE)){
                primerCaracter = cadena.substring(0, 1);
                ultimoCaracter = cadena.substring(longitud-1);
                if(primerCaracter.equals("X") && ultimoCaracter.equals("O")){
                    contadorCorrectas++;
                }
                else{
                    contadorIncorrectas++;
                }
            }
            else{
                contadorIncorrectas++;
            }
            
        }while(!cadena.equals(FDE));
        
        System.out.println("Total de cadenas correctas: " + contadorCorrectas);
        System.out.println("Total de cadenas incorrectas: " + contadorIncorrectas);
        
        
    }
    
}

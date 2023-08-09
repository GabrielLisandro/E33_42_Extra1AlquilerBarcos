/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de 
devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado 
con la fecha de alquiler y devolución), por un valor módulo de cada barco 
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el 
modulo normal y sumándole el atributo particular de cada barco. En los veleros 
se suma el número de mástiles, en los barcos a motor se le suma la potencia en CV
y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las 
clases y los métodos necesarios que permitan al usuario elegir el barco que quiera
alquilar y mostrarle el precio final de su alquiler.
 */
package e33_42_extra1alquilerbarcos;

import java.time.LocalDate;
import java.util.Scanner;


public class E33_42_Extra1AlquilerBarcos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Uso un menu para interactuar con el Cliente
        Menu menu1 = new Menu(); // nuevo objeto menu1
        int opcion = menu1.mostrarMenu(); // llamar al menu
       
        Barco barco1;

        switch (opcion) {
            case 1:
                System.out.println("\n******* ALQUILER DE VELERO *******");
                System.out.println("Ingrese la información del Velero:");
                System.out.print("Matrícula: ");
                String matriculaVelero = scanner.next();
                System.out.print("Eslora (en metros): ");
                double esloraVelero = scanner.nextDouble();
                System.out.print("Año de fabricación: ");
                int anioFabricacionVelero = scanner.nextInt();
                System.out.print("Número de mástiles: ");
                int numeroMastiles = scanner.nextInt();

                barco1 = new Velero(numeroMastiles, matriculaVelero, esloraVelero, anioFabricacionVelero);
                break;
            case 2:
                System.out.println("\n******* ALQUILER DE BARCO A MOTOR *******");
                System.out.println("Ingrese la información del Barco a Motor:");
                System.out.print("Matrícula: ");
                String matriculaBarcoMotor = scanner.next();
                System.out.print("Eslora (en metros): ");
                double esloraBarcoMotor = scanner.nextDouble();
                System.out.print("Año de fabricación: ");
                int anioFabricacionBarcoMotor = scanner.nextInt();
                System.out.print("Potencia en CV: ");
                double potenciaCV = scanner.nextDouble();

                barco1 = new BarcoMotor(potenciaCV, matriculaBarcoMotor, esloraBarcoMotor, anioFabricacionBarcoMotor);
                break;
            case 3:
                System.out.println("\n******* ALQUILER DE YATE DE LUJO *******");
                System.out.println("Ingrese la información del Yate de Lujo:");
                System.out.print("Matrícula: ");
                String matriculaYate = scanner.next();
                System.out.print("Eslora (en metros): ");
                double esloraYate = scanner.nextDouble();
                System.out.print("Año de fabricación: ");
                int anioFabricacionYate = scanner.nextInt();
                System.out.print("Potencia en CV: ");
                double potenciaCVYate = scanner.nextDouble();
                System.out.print("Número de camarotes: ");
                int numeroCamarotes = scanner.nextInt();

                barco1 = new YateLujo(potenciaCVYate, numeroCamarotes, matriculaYate, esloraYate, anioFabricacionYate);
                break;
            default:
                System.out.println("Opción inválida. Saliend o del programa.");
                return;
        }
        
       
        // Llamo para pedir las fechas
        LocalDate fechaAlquiler = menu1.obtenerFecha("Ingrese la fecha de Alquiler en formato DD-MM-AAAA: ");
        LocalDate fechaDevolucion = menu1.obtenerFecha("Ingrese la fecha de Devolución en formato DD-MM-AAAA: ");

        
        // Genero el nuevo alquiler
        int posicionAmarre = (int) (Math.random()*10+1);
        Alquiler alquiler1 = new Alquiler("Pablo Poder", "35353535", fechaAlquiler, fechaDevolucion, posicionAmarre, barco1);
        
        // Genero el precio
        System.out.println("El precio del Alquiler es $" + alquiler1.calcularAlquiler());
                
        System.out.println("\nFecha Devolución: " + menu1.fechaDev(fechaDevolucion) );
        System.out.println("River esta en 4tos de la libertadores");
        
        System.out.println();
        System.out.println(alquiler1.toString());     
        
        System.out.println("hecho por juan jajan't");
        
        
        
    }
    
}

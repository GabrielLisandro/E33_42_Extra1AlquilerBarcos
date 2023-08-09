
package e33_42_extra1alquilerbarcos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Menu {
    private Scanner leer; // atributo leer tipo Scanner
    
    public Menu() { // Constructor
        leer = new Scanner(System.in);
    }
    
    // Metodos
    // Mostrar Menu
    public int mostrarMenu() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                    ALQUILAR BARCO                    |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("Por favor Ingrese el tipo de Barco que desea Alquilar");
        System.out.println("1. VELERO");
        System.out.println("2. BARCO A MOTOR");
        System.out.println("3. YATE DE LUJO");
        System.out.print("Opcion: ");
        int opcion = leer.nextInt();
        return opcion;
    }

    //hola =)
    // Fechas
    public LocalDate obtenerFecha(String mensaje) {
        System.out.print(mensaje);
        String fechaStr = leer.next();
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(fechaStr, forma); // convierto a LocalDate con formato YYYY-MM-dd
    }
    
    public String fechaDev(LocalDate fechaDevolucion) {
        DateTimeFormatter forma1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return forma1.format(fechaDevolucion); // convierto de LocalDate con formato YYYY-MM-dd a STring con formato dd-MM-yyyy
        
    }
}

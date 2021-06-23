package pe.edu.upeu.jgm;
import pe.edu.upeu.jgm.utils.LeerTeclado;
import pe.edu.upeu.jgm.examenjgm.Resolucion;
/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args )
    {
        
        System.out.println( "...::::::Bienivenido, puedes escoger entre los siguientes algoritmos para abrirlos::::..." );
        System.out.println("Opciones:\n1.- Sistema de calculo de impuestos para empresa de coches.\n2.- Sistema para ver tablas de multiplicar.\n3.- Sistema de numeros perfectos.\n4.- Sistema recursivo.");
        int opcion;
        String mensaje="Gracias por visitarnos, hasta la proxima.";
        LeerTeclado Ingresojgm= new LeerTeclado();
        
        opcion=Ingresojgm.leer(0,"\nEscriba una de estas opciones:");
        switch(opcion){
            case 1: Resolucion.EmpresaCochesjgm();
            System.out.println(mensaje);
            break;
            case 2: Resolucion.tabladeMultiplicarjgm();
            System.out.println(mensaje);
            break;
            case 3: Resolucion.numerosperfectojgm();
            System.out.println(mensaje);
            break;
            case 4:; Resolucion.metodorecursivo();
            break; 
            default: System.out.println("Error: has ingresado una opción incorrecta.");
        }
        
        
    }
}



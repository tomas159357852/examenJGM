package pe.edu.upeu.jgm.examenjgm;
import pe.edu.upeu.jgm.utils.LeerTeclado;

/**
 * Resolucion
 */
public class Resolucion {

    public static void EmpresaCochesjgm() {
        System.out.println("..::: Sistema para determinar el impuesto que pagará por los vehiculos ::..");
        LeerTeclado teclado=new LeerTeclado();
        int totalcochesjgm, categoriajgm;
        double preciojgm, totalimpuesto1=0, impuesto1=0, totalimpuesto2=0, impuesto2=0, impuesto3=0, totalimpuesto3=0, preciofinal=0;
        totalcochesjgm=teclado.leer(0,"Ingrese la cantidad total de coches que tiene:");
        
        for (int i=1; i <= totalcochesjgm ; i++){
            preciojgm=teclado.leer(0,"Ingrese el precio del coche "+i+":");
            categoriajgm=teclado.leer(0,"Ingrese la categoria del coche 1 2 o 3:");
            switch(categoriajgm){
            case 1: impuesto1=preciojgm*0.12;
                System.out.println("El impuesto que pagará por este coche es de: "+impuesto1);
                break;
            case 2: impuesto2=preciojgm*0.08;
                System.out.println("El impuesto que pagará por este coche es de: "+impuesto2);
                break;
            case 3: impuesto3=preciojgm*0.05;
                System.out.println("El impuesto que pagará por este coche es de: "+impuesto3);
                break;
            default: System.out.println("La categoria ingresada es incorrecta.");
            }
            totalimpuesto1=totalimpuesto1+impuesto1;
            totalimpuesto2=totalimpuesto2+impuesto2;
            totalimpuesto3=totalimpuesto3+impuesto3;
            preciofinal=preciofinal+preciojgm;
        }

        System.out.println("El total de impuesto que pagara por la categoría 1 es de: "+totalimpuesto1+"\nEl total de impuesto que pagara por la categoria 2 es de: "+totalimpuesto2+"\nEl total de impuesto que pagara por la categoria 3 es de: "+totalimpuesto3);
        System.out.println("El total de impuesto que pagara por todos los coches es de: "+(totalimpuesto1+totalimpuesto2+totalimpuesto3)+"\nEl total de paga que hara por todos los coches considerando los duescuentos es de: "+(preciofinal-(totalimpuesto1+totalimpuesto2+totalimpuesto3)));    
    }
         
    public static void tabladeMultiplicarjgm() {
        System.out.println("..:::tabla de multiplicar:::...");
        LeerTeclado datojgm = new LeerTeclado();
        int totaltablajgm, resultado=0;
        totaltablajgm=datojgm.leer(0,"Ingrese el número al total de la tablajgm que quiere ver:");
        for(int tablajgm=1; tablajgm<=totaltablajgm; tablajgm++){
            for(int multiplicandojgm=1; multiplicandojgm<=10; multiplicandojgm++)
            System.out.println(tablajgm+"*"+multiplicandojgm+"="+(resultado=tablajgm*multiplicandojgm));
        System.out.println("\n");
        }
        
    }
    public static void numerosperfectojgm() {
        System.out.println("..:::Bienvenido al sistema de numeros perfectos:::..");
        LeerTeclado ingresar= new LeerTeclado();
        int perfectojgm, perfectojgms=0, i=1;
        perfectojgm=ingresar.leer(0,"Ingrese el numero que quiere verificar, para ver si es perfecto o no:");
        while(i<perfectojgm){
            if(perfectojgm%i==0){
                perfectojgms=perfectojgms+i;
                System.out.print("+"+i);
            }
            i++;
        }
        if(perfectojgms==perfectojgm){
                System.out.print(" = "+perfectojgm+" es perfecto");
            }
        else{
                System.out.println(" = "+perfectojgms+"\n"+perfectojgm+" No es perfecto");
            }
        
    }
    public int metodorevursivojgm(int numerojgm){
        LeerTeclado valor= new LeerTeclado();
        int resultadojgm=0, valorx, valorn;
        valorx=valor.leer(0,"Ingrese el valor de X:");
        valorn=valor.leer(0,"Ingrese el valor de N:");
        if(valorx>=1){
            
        }

        return resultadojgm;


    }

    public static void metodorecursivo() {
        LeerTeclado valor= new LeerTeclado();
        int resultadojgm=0, valorx, valorn;
        valorx=valor.leer(0,"Ingrese el valor de X:");
        valorn=valor.leer(0,"Ingrese el valor de N:");
        
    }

    }
        


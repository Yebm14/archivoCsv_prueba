/*
 
 */
package test;

import domain.Comercial;
import domain.Repartidor;
import java.util.Scanner;

/**
 *
 * @author yesen
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    protected static String nombre;
    protected static int edad;
    protected static double salario;
    private static double comision;
    protected static String zona;
            
    public static void main(String[] args) {

        //variables
        //
        Comercial comercial1;
        Repartidor repartidor1;
        String rol = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un Nombre: \n");
        nombre = teclado.nextLine();
        System.out.println("Ingresa Edad: \n");
        edad = teclado.nextInt();
        System.out.println("Ingresa Salario: \n");
        salario = teclado.nextDouble();

        System.out.println("Ingresa un rol: \n");
        rol = teclado.nextLine();

        if (rol == "Comercial") {

            
            comercial1 = new Comercial();
            System.out.println("Ingresa Comision: \n");
            comision = teclado.nextDouble();

        } else {
            //Repartidor repartidor1 = new Repartidor();
            System.out.println("Ingresa zona: \n");
            zona = teclado.nextLine();
        }

//        Comercial comercial1 = new Comercial(400000, "Yesenia", 20, 5000);
//        comercial1.bonificacion();
//        System.out.println(" :" + comercial1);
//        Repartidor repartidor1 = new Repartidor("zona 2", "Yesenia", 20, 5000.0);
//        repartidor1.bonificacion();
//        System.out.println(" :" + repartidor1);
//Pedir un valor con nuestra clase scanner
//        var consola = new Scanner(System.in);
//        System.out.println("Proporcione el nombre:");
//        nombre = consola.nextLine();
////        System.out.println("Caracter: " + caracter);
//        var consola2 = new Scanner(System.in);
//        System.out.println("Proporcione el id");
//        id = Integer.parseInt(consola.nextLine());
    }

}












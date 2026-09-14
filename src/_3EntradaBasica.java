import javax.swing.*;
import java.util.Scanner;

public class _3EntradaBasica {
    public static void main(String[] args) {
        //3 Entrada Basica
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int edad;
        double estatura;

        //**** RECOGIENDO VALORES EN VARIAS LINEAS
        System.out.print("Introduce tu nombre:");
        nombre = teclado.nextLine();

        System.out.print("Introduce tu edad:");
        edad = Integer.parseInt(teclado.nextLine());

        System.out.print("Estatura (con decimales .):");
        estatura = Double.parseDouble(teclado.nextLine());

        System.out.println("Tu nombre es " + nombre + ", tiens " + edad + "años y mides "+estatura);
        System.out.printf("Tu nombre es %s, tienes %d años y mides %.5f m\n",nombre,edad,estatura);

        System.out.println("---------------------------------------");

        //Leyendo varios datos de golpe. Ojo, puede hacer cosas inesperadas!!!!!!
        System.out.print("Introduce nombre, edad, altura (decimales con coma) separados por un espacio: ");
        nombre = teclado.next();
        edad = teclado.nextInt();
        estatura = teclado.nextDouble();
        System.out.println("Tu nombre es " + nombre + ", tu edad es " + edad + " y mides "+estatura);


        //*********** Porqué es mejor usar nextLine() que next()
        System.out.println("Dime edad:");
        edad = teclado.nextInt();
        System.out.println("Dime nombre:");
        nombre = teclado.nextLine();

        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);


        System.out.println("---------------------------------------");

        String nombre2 = JOptionPane.showInputDialog("Introduce tu nombre:");
        JOptionPane.showMessageDialog(null, "Hola " + nombre2);



    }
}

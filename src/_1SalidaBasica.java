public class _1SalidaBasica {
    public static void main(String[] args) {
        System.out.print("Imprimo sin saltar la linea.");
        System.out.println("Continuo en la linea anterior");
        System.out.println("Esto ya va en otra linea");
        System.out.print("\033[31mEN ROJO\033[38m"); //no liarse con colores
        System.out.print("\033[34mEN AZUL\033[38m"); //no liarse con colores

        System.out.println();//meto un salto de linea
        System.out.println("Cruz en UNICODE:\u2020");  //codigo en HEXADECIMAL
        System.out.println("Cara sonriente \u263A");   //cara en HEXADECIMAL

        //Para codigos hexadecimales de más de 4 digitos
        char[] emoji=Character.toChars(0x1F600);
        System.out.println(emoji);

        //Esto es un comentario de 1 línea

        /* Esto es un comentario de
           varias líneas.
        */

        //Esto es un comentario de
        //varias líneas.


    }

}

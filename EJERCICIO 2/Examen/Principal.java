import java.util.Scanner;

public class Principal{

    /* La clase principal va mandar llamar a la clase Metodos y sus metodos 
    correspondientes.*/

    public static void main(String[] args) {

        /* Se declaran variables*/

        int respuesta;

        Scanner entrada = new Scanner(System.in);

        /*Se genera un objeto para mandar llamar a los metodos*/

        Metodos llamar = new Metodos();

        /* Este bucle le permite a los jugadores decidir si quieren volver
        a jugar o si desean cerrar el juego*/

        do{

        llamar.Reglas();
        llamar.Juego();

        System.out.println("Desea volver a jugar(Es pregunta). Escriba 1 de querer jugar de nuevo");
        respuesta = entrada.nextInt();

        }while(respuesta == 1);
        

        
    }
}

import java.util.Scanner;

public class Metodos extends Persona{

    Scanner entrada = new Scanner(System.in);

/*Se declaran las variables que se van a ocupar dentro del programa*/

    private int num1 = 0;
    private char letter;
    private int num2 = 0;
    private int aciertos = 0;
    private int gana = 0;

    /* Se declara el metodo juego donde se lleva acabo practicamente toda la diversion*/


    public void Juego(){

        /* Aqui se llena el array con la palabra con la que quiera jugar el jugador 2*/


        System.out.println("\nJugador uno, ingresa el numero de letras que tenga su palabra"); 
    
        num1 = entrada.nextInt();

        char[] letras = new char[num1];

        for(int i=0 ; i<num1 ; i++){

            System.out.println("Escribe la letra "+(i+1));
            letras[i] = entrada.next().charAt(0);
        }
/* Se hace uso de otro array donde se muestran los guiones correspondientes a la 
cantidad de letras de la palabra ingresada*/

    char[] letras2 = new char[num1];
    for(int i=0 ; i<num1 ; i++){
        
        letras2[i] = '_';

    }
/* Dentro de este bucle, el jugador 2, va ingresando una letra. Si el jugador
ingresa una letra que no corresponde a la anadida inicialmente, perdera,
ya que los jugadores no cuentan con vidas*/
    do{
        for(int i=0 ; i<num1 ; i++){
            
            System.out.print(letras2[i]);

        }

        System.out.println(" ");
        
        System.out.println("\nJugador dos ingresa una letra\n");
        letter = entrada.next().charAt(0);

        for(int i=0 ; i<num1 ; i++){

        if (letras[i] == letter){

            letras2[i] = letter;  
  
        }

        } 
        aciertos++; 



    }while(aciertos < num1);

    /* Esta parte final, permite que los jugadores sepan quien gano y la 
    palabra que ingreso inicialmente el jugador uno*/

    for(int i=0 ; i<num1 ; i++){
            
        System.out.print(letras2[i]);

    }
    System.out.println(" ");
    for(int i=0 ; i<num1 ; i++){

    if(letras[i] == letras2[i]){

        gana++;

    }

    }
    if(gana == num1){
        System.out.println("Felicidades, jugador 2 ha ganado");
        
    }
    else{

        System.out.println("Lo sentimos, jugador 1 ha ganado");
        System.out.println("Jugador 2, la palabra era ");
        for(int i=0 ; i<num1 ; i++){

            System.out.print(letras[i]);


    }
    System.out.println(" ");
}
}
}
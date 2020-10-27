import java.util.Scanner;
class pokedex{
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    int opcion,pokemon,menu,vida,numero,vida2,vidas,vidas2;
    
    
    System.out.println("3IV8 NUNEZ RAMIREZ VALERY AYIN\n");
    System.out.println("Elija a un pokemon");
    System.out.println("1.Charmander");
    System.out.println("2.Bulbasaor");
    System.out.println("3.Squartle");
    System.out.println("4.Opcion pantalla pokemon");
    System.out.println("5.SALIR DEL POKEDEX");

    opcion = entrada.nextInt();
    switch (opcion) {
        case 1:
        System.out.println("ID = 001\n Nombre:Charmander\nFuerza:media\nDefensa vida:media\nAtaque principal:fuego\nAtaque secundario:agua");
        break;
        case 2:
        System.out.println("ID = 002\n Nombre:Bulbasasor\nFuerza:baja\nDefensa vida:alta\nAtaque principal:tierra\nAtaque secundario:agua");
        break;
        case 3:
        do{System.out.println("ID = 0013\n Nombre:Squartle\nFuerza:alta\nDefensa vida:baja\nAtaque principal:agua\nAtaque secundario:tierra");
        System.out.println("Escriba 10 para regresar al menu principal");
        menu = entrada.nextInt();
        }while(menu == 10);
        break;
        case 4:
     System.out.println("Bienvenido a la batalla");
     System.out.println("Escriba 1(Bulbasaor vs Squartle), 2(Squartle vs Charmander) o 3(Charmander vs Bulbasaor) para elegir su batalla");
     numero = entrada.nextInt();

     if(numero == 1){
       System.out.println("Bulbasaor vs Squartle");
       System.out.println("Bulbasaor 8 vidas");
       System.out.println("Squartle 8 vidas");

       do{
        System.out.println("Escriba un numero jugador 1");
        vida = entrada.nextInt();
        System.out.println("Escriba un numero jugador 2");
        vida2 = entrada.nextInt(); 
       }while(vida != 0 || vida2 != 0);
       vidas = vida-vida2;
       if(vida > vida2){
        System.out.println("Su pokemon ha muerto jugador 2 :( "); 
    }
    else if(vida<vida2){
        System.out.println("Su pokemon ha muerto jugador 1 :( "); 
    }
    

     }
     switch (opcion) {
        case 1:
        System.out.println("ID = 002\n Nombre:Bulbasasor\nFuerza:baja\nDefensa vida:alta\nAtaque principal:tierra\nAtaque secundario:agua");
        break;
        case 2:
        System.out.println("ID = 002\n Nombre:Bulbasasor\nFuerza:baja\nDefensa vida:alta\nAtaque principal:tierra\nAtaque secundario:agua");
        break;
        case 3:
         default:
     }
     
        default: 
    }
    
        
    }
}
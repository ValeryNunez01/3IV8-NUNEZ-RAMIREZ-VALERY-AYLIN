import java.util.*;

public class metodos{


     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int opcion,num;
         int num2=0;
         metodos menu = new metodos();

         System.out.println("\nHecho por Nunez Ramirez Valery Aylin \n");

         do{

         System.out.println("Elija una opcion");
         System.out.println("1.Ejercicio 1");
         System.out.println("2.Ejercicio 2");
         System.out.println("3.Ejercicio 3");
         System.out.println("4.Ejercicio 4");
         System.out.println("5.SALIR");
     
         opcion = entrada.nextInt();

         switch (opcion) {
             case 1:
             do{
                 menu.ejerciciouno();
                 System.out.println("\n¿Desea repetir esta opcion?, si su respuesta es si escriba un 0, si no, escriba el numero 3");
                 num = entrada.nextInt();
                }while(num == 0);
                System.out.println("\n¿Desea repetir el menu?, si su respuesta es si escriba un 1, si no, escriba el numero 3");
                num2 = entrada.nextInt();
             
             break;
             case 2:
             do{
                menu.ejerciciodos();
                System.out.println("\n¿Desea repetir esta opcion?, si su respuesta es si escriba un 0, si no, escriba el numero 3");
                num = entrada.nextInt();
               }while(num == 0);
               System.out.println("\n¿Desea repetir el menu?, si su respuesta es si escriba un 1, si no, escriba el numero 3");
               num2 = entrada.nextInt();
             
             break;
             case 3:
             do{
                menu.ejerciciotres();
                System.out.println("\n¿Desea repetir esta opcion?, si su respuesta es si escriba un 0, si no, escriba el numero 3");
                num = entrada.nextInt();
               }while(num == 0);
               System.out.println("\n¿Desea repetir el menu?, si su respuesta es si escriba un 1, si no, escriba el numero 3");
               num2 = entrada.nextInt();
             
             break;
             case 4:
             do{
                menu.ejerciciocuatro();
                System.out.println("\n¿Desea repetir esta opcion?, si su respuesta es si escriba un 0, si no, escriba el numero 3");
                num = entrada.nextInt();
               }while(num == 0);
               System.out.println("\n¿Desea repetir el menu?, si su respuesta es si escriba un 1, si no, escriba el numero 3");
               num2 = entrada.nextInt();
            
             break;

             default:
             System.out.println("Gracias,hasta pronto");
             num2 = 0;
             num = 1;
             break;
            }

        }while(num2 == 1);
        
         
        
    }    




    Scanner entrada = new Scanner(System.in); 

    public void ejerciciouno(){

        int promediopos,promedioneg;
        int sumapos = 0,sumaneg = 0;
        int contadorneg = 0, contadorpos = 0;

        int matriz1[][] = new int [2][5];
        for (int i = 0; i<matriz1.length; i++){
            for (int j = 0; j<matriz1[i].length; j++){
                System.out.println("Ingresa un numero para la casilla "+i+","+j);
                matriz1[i][j] = entrada.nextInt();  
                
                if(matriz1[i][j]<0){
                    contadorneg++; 
                    sumaneg+=matriz1[i][j];
                 }
                 else if (matriz1[i][j]>=0){
                     contadorpos++; 
                      sumapos+=matriz1[i][j];               
                 }
            }
            
        }
        if (contadorneg == 0){
            System.out.println("No es posible obtener el promedio de 0 numeros");
            promediopos = sumapos/contadorpos;
            System.out.println("El promedio de los numeros positivos es: " +promediopos);
        }
        else{
            if(contadorpos == 0){
                System.out.println("No es posible obtener el promedio de 0 numeros");
                promedioneg = sumaneg/contadorneg;
                System.out.println("El promedio de los numeros negativos es: " +promedioneg);
            }
            else{
                promedioneg = sumaneg/contadorneg;
                promediopos = sumapos/contadorpos;
                System.out.println("El promedio de los numeros negativos es: " +promedioneg+ "\nEl promedio de los numeros positivos es: " +promediopos);                 
            }

        }
    }



    public void ejerciciodos(){

        int contador=0;
        int contador2=0;
        int Sumapar=0;
        int promedio=0;

        int matriz2[][] = new int [2][5];
        for (int i = 0; i<matriz2.length; i++){
            for (int j = 0; j<matriz2[i].length; j++){
                System.out.println("Ingresa un numero para la casilla "+i+","+j);
                matriz2[i][j] = entrada.nextInt(); 
                contador++;
                if((contador%2 == 0 || contador == 1) && matriz2[i][j] != 0){
                   contador2++;
                   Sumapar+=matriz2[i][j];
                   promedio=Sumapar/contador2;
                }
                
            }
        }
        System.out.println("El promedio de los datos ingresados en las posiciones pares es de "+promedio); 
    }

    public void ejerciciotres(){
        int promedio = 0,Suma = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int mayor,menor;

        int matriz3[][] = new int [2][5];
        for (int i=0 ; i<matriz3.length ; i++){
            for(int j=0 ; j<matriz3[i].length ; j++){
                System.out.println("Escriba la calificacion");
                matriz3[i][j] = entrada.nextInt();
            }
        }

        System.out.println(" \n Calificaciones:");

        for(int i = 0; i<matriz3.length; i++){
            for(int j = 0; j<matriz3[i].length; j++){
                if( matriz3[i][j] != 0){
                   contador3++;
                   Suma+=matriz3[i][j];
                }
                System.out.print(String.format("%d,", matriz3[i][j]));

            }

    }
    promedio=Suma/contador3;
    System.out.println("\nEl promedio es de "+promedio);

    mayor = menor = matriz3[0][0];

    for(int i = 0 ; i<matriz3.length ; i++){
        for(int j = 0 ; j<matriz3[i].length ; j++){
            if(matriz3[i][j]>mayor){
              mayor = matriz3[i][j];  
            }
            if(matriz3[i][j]<menor){
                menor = matriz3[i][j];  
              }
        }
    
    }
    System.out.println("El promedio mayor es de "+mayor);
    System.out.println("El promedio mayor es de "+menor);

    for(int i = 0 ; i<matriz3.length ; i++){
        for(int j = 0 ; j<matriz3[i].length ; j++){
            if(matriz3[i][j]>promedio){
              contador4++;  
            }
        }
    
    }
    System.out.println("Total de calificaciones mayores al promedio "+contador4);

    for(int i = 0 ; i<matriz3.length ; i++){
        for(int j = 0 ; j<matriz3[i].length ; j++){
            if(matriz3[i][j] <= 5){
              contador5++;  
            }
            else{
                contador6++;
            }
        }
    
    }
    System.out.println("Total de alumnos aprobados"+contador6);
    System.out.println("Total de alumnos reprobados"+contador5);

}
    public void ejerciciocuatro(){

        System.out.println("Matriz 1\n");
        
        int matriz4[][] = new int [3][3];
        for(int i = 0 ; i<matriz4.length ; i++){
            for(int j = 0 ; j<matriz4[i].length ; j++){

                System.out.println("Ingrese un numero para llenar la matriz 1");
                matriz4[i][j] = entrada.nextInt();               

            }
        }

        System.out.println("\nMatriz 2\n");

        int matriz5[][] = new int [3][3];
        for(int i = 0 ; i<matriz5.length ; i++){
            for(int j = 0 ; j<matriz5[i].length ; j++){

                System.out.println("Ingrese un numero para llenar la matriz 2");
                matriz5[i][j] = entrada.nextInt();          

            }
        }


        int matriz6[][] = new int [3][3];
        for(int i = 0 ; i<matriz6.length; i++){
            for(int j = 0 ; j<matriz6[i].length ; j++){

                matriz6[i][j] =  matriz4[i][j] + matriz5[i][j];
 
            }
        }
        
        System.out.println(" ");
        
        for(int i = 0; i<matriz6.length; i++){
            for(int j = 0; j<matriz6[i].length; j++){
                System.out.print(String.format("%d,", matriz6[i][j]));
            }

    }

    }
}

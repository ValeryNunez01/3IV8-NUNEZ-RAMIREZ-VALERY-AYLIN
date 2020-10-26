import java.util.Scanner;
class menu{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad=21,opcion,numero,digito,contadorpositivo=0,contadornegativo=0;
        int a,l,h,b,r,resultado,resultado1,numero2;
        int factorial=1,n=0,n1=n,respuesta=0;
        int resultado2=1;
        char letra;
        double grados,num;
        String binario = " ";

        do{
            System.out.println("Elija una opcion");
            System.out.println("1.Descuento");
            System.out.println("2.De decimal a binario");
            System.out.println("3.De Fahrenheit a ...");
            System.out.println("4.Contador de + y -");
            System.out.println("5.Factura");
            System.out.println("6.Perimetro, area y volumen");
            System.out.println("7.Tabla de valores");
            System.out.println("8.De entero a factorial");
            System.out.println("9.Calculadora");
            System.out.println("10.Salir");

            opcion = entrada.nextInt();

            switch(opcion) {
            case 1 :
                System.out.println("Ingrese su edad:");
                edad = entrada.nextInt();
                if(edad >= 65){
                    System.out.println("Tiene un descuento del 40% en su abono");
                }
                else if(edad <= 21){
                    System.out.println("¿Sus padres son socios?, de ser afirmativo escriba s, en caso contrario escriba n");
                    letra = entrada.next().charAt(0);
                    if(letra == 's'){
                        System.out.println("Tiene un descuento del 45%");
                    }
                    else{
                        System.out.println("Tiene un descuento del 25%");
                    }
                }
                 
                
            break;

            case 2:
                 System.out.println("Ingrese un número decimal");
                 numero = entrada.nextInt();

                 do{
                     digito = numero % 2;
                     binario += digito;
                     numero = numero/2;
                 }while(numero != 0);
                 binario = new StringBuilder(binario).reverse().toString();
                 System.out.println("El número en binario es "+binario);
            break;
                
            case 3:
                 System.out.println("Elija el numero de la opcion que desea ejecutar");
                 System.out.println("1.De FAHRENHEIT a CELSIUS");
                 System.out.println("2.De FAHRENHEIT a KELVIN");
                 System.out.println("3.De FAHRENHEIT a RANKINE");

                 opcion = entrada.nextInt();

                 switch(opcion){
                    case 1:
                    System.out.println("Escriba la temperatura en grados FAHRENHEIT");
                    grados = entrada.nextDouble();
                    grados = (grados-32)*5/9;
                    System.out.println("Celsius: "+grados+"°C");
                    break;

                    case 2:
                    System.out.println("Escriba la temperatura en grados FAHRENHEIT");
                    grados = entrada.nextDouble();   
                    grados = ((grados-32)*5/9)+273.15;
                    System.out.println("Kelvin: "+grados+"°K");
                    break;

                    case 3:
                    System.out.println("Escriba la temperatura en grados FAHRENHEIT");
                    grados = entrada.nextDouble();
                    grados = grados+459.67;
                    System.out.println("Rankine: "+grados+"°R");
                    break;
                 }
            break;

            case 4:
            System.out.println("Escriba el numero");
                numero = entrada.nextInt();
            while(numero != 0){
                if(numero<0){
                    contadornegativo=contadornegativo+1;
                }
                else if (numero>0){
                    contadorpositivo=contadorpositivo+1;
                }
                System.out.println("Escriba 0 si desea terminar la cuenta");
                numero = entrada.nextInt();
            }
            System.out.println("El total de números positivos fue de: "+contadorpositivo+",mientras que el total de números negativo fue de: "+contadornegativo);
            break; 
            
            case 5:
            System.out.println("Hola, esta es la lista de los productos disponibles en nuestra tienda con sus respectivos precios.");
            System.out.println("Agua 10 pesos\nLeche 30 pesos\nHelado de vainilla 50 pesos\nBarra de chocolate 20 pesos\nRebanada de pizza 20 pesos");
            System.out.println("Cantidad de aguas que deasea comprar");
            a = entrada.nextInt();
            System.out.println("Cantidad de Leches que desea comprar");
            l = entrada.nextInt();
            System.out.println("Cantidad de Helados de vainilla que desea comprar");
            h = entrada.nextInt();
            System.out.println("Cantidad de Barras de chocolate que deasea comprar");
            b = entrada.nextInt();
            System.out.println("Cantidad de Rebanadas de pizza que deasea comprar");
            r = entrada.nextInt();
            resultado = ((a*10)+(l*30)+(h*50)+(b*20)+(r*20));
            numero = a+l+h+b+r;
            System.out.println("Cantidad de productos comprados: "+numero+"\nCosto total: "+resultado+"pesos");
            break;

            case 6:
            System.out.println("Elija el numero de la opcion que desea ejecutar");
            System.out.println("1.Area y perimetro de un rectangulo");
            System.out.println("2.Area y perimetro de un triangulo");
            System.out.println("3.Volumen de una esfera");
            System.out.println("4.Volumen de un cilindro");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                System.out.println("Ingrese la altura del rectangulo");
                numero = entrada.nextInt();
                System.out.println("Ingrese la base del rectangulo");
                digito = entrada.nextInt();
                resultado = numero*digito;
                resultado1 = (2*numero)+(2*digito);
                System.out.println("Area= "+resultado+" Perimetro= "+resultado1);
                break;
                case 2:
                System.out.println("Ingrese la altura del triangulo");
                numero = entrada.nextInt();
                System.out.println("Ingrese la base del triangulo");
                digito = entrada.nextInt();
                System.out.println("Ingrese el lado faltante del triangulo");
                numero2 = entrada.nextInt();
                resultado = (numero*digito)/2;
                resultado1 = numero2+numero+digito;
                System.out.println("Area= "+resultado+" Perimetro= "+resultado1);
                break;
                case 3:
                System.out.println("Ingrese el radio de la esfera");
                numero = entrada.nextInt();
                num = 4/3*(3.1416*(numero^3));
                System.out.println("Volumen= "+num);
                break;
                case 4:
                System.out.println("Ingrese el radio del cilindro");
                numero = entrada.nextInt();
                System.out.println("Ingrese la altura del cilindro");
                digito = entrada.nextInt();
                num = (numero^2)*digito*3.1416;
                System.out.println("Volumen= "+num);
                break;

            }
            break;   

            case 7:
            System.out.println("N\n1  10  100  1000\n2  20  200  2000\n3  30  300  3000\n4  40  400  4000\n5  50  500  5000\n6  60  600  6000\n7  70  700  7000\n8  80  800  8000\n9  90  900  9000\n10 100 1000 1000");
            break;


            case 8:
            System.out.println("Escriba un numero positivo:");
            n = entrada.nextInt();
            while(n != 0){
                factorial = n * factorial;
                n--;
                
            }
            System.out.println("El factorial es de "+factorial);
                
            break;

            case 9:
            System.out.println("Elija la opcion que desea ejecutar");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                do{
                System.out.println("Ingrese un sumando"); 
                numero = entrada.nextInt();
                respuesta = respuesta+numero;
                }while(numero != 0);
                System.out.println("Resultado= "+respuesta); 
                break;
                
                case 2:
                System.out.println("Ingrese un numero"); 
                numero = entrada.nextInt();
                System.out.println("Ingrese otro numero"); 
                numero2 = entrada.nextInt();
                respuesta = numero-numero2;
                System.out.println("Resultado= "+respuesta); 
                break;
                
                case 3:
                System.out.println("Ingrese un numero");
                numero = entrada.nextInt();
                System.out.println("Ingrese otro numero"); 
                numero2 = entrada.nextInt(); 
                respuesta = numero-numero2;
                System.out.println("Resultado= "+respuesta); 
                break;
                
                case 4:
                System.out.println("Ingrese el dividendo"); 
                numero = entrada.nextInt();
                System.out.println("Ingrese el divisor"); 
                numero2 = entrada.nextInt();
                respuesta = numero/numero2;
                System.out.println("Resultado= "+respuesta); 
                break;


            }
            break;





            default:
            System.out.println("Tenga un lindo día :). Este programa fue hecho por 3IV8_NUNEZ_RAMIREZ_VALERY_AYLIN");
            break;
        
            }
            
            System.out.println("¿Desea repetir el programa?,de ser afirmativo escriba s");
            letra = entrada.next().charAt(0);
            
         }while(letra == 's');


        
    }
}
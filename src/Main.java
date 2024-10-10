import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //E2_PedirNombreJOptionPane();
        //E1MostrarMensajePorConsola();
        //E2_PedirNombrePorConsola(sc);
        //E3_OperacionConNumeros();
        //E4_NumerosMayorMenor();
        //E5_NumeroDivisiblePor2(sc);
        //E6_PrecioIva(sc);
        //E7_1_al_100_BucleWhile();
        //E8_1_al_100_BucleFor();
        //E9_1_al_100_Divisibles_Por_2y3_BucleWhile();
        //E9_1_al_100_Divisibles_Por_2y3_BucleFor();
        //E10_Numero_Mayor_o_Igual_Cero(sc);
        //E11_Contraseña(sc);
        //E12_Dia_Laboral(sc);
        //E13_Numeros_Primos(sc);
        //E14_Numero_Aleatorio(sc);


    }


    public static void E1MostrarMensajePorConsola(){
        System.out.println("EJERCICIO 1: ");
        /*
         Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por
         consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
         */
        //defino la variable y la inicializo
        String nombre = "Sabrina";

        //muestro por consola
        System.out.println("Bienvenida "+nombre);




    }

    public static void E2_PedirNombrePorConsola(Scanner sc){
        System.out.println("EJERCICIO 2 (SCANNER):");
        /*
        Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica
        Scanner y JOptionPane)
         */

       //metodo Scanner:

       //definir una variable tipo String
       System.out.println("----Metodo Scanner----");
       String nombre;

       //pedir por consola al usuario que ingrese un dato
       System.out.println("Ingrese su nombre:");
       //guardarlo en la variable nombre
       nombre = sc.nextLine();

       //mostrar por consola el mensaje con el dato guardado
       System.out.println("Bienvenidx "+nombre);
   }

    public static void E2_PedirNombreJOptionPane(){
        System.out.println("EJERCICIO 2 (JOptionPane):");

        //metodo JOptionPane
        System.out.println("----Metodo JOptionPane----");
        //definir variable
        String name;
        //pedir por el metodo JOptionPane al usuario que ingrese un dato, guardar en la variable
        name = JOptionPane.showInputDialog("Ingrese su nombre");

        //mostrar por metodo un mensaje con la variable
        JOptionPane.showMessageDialog(null,"Bienvenidx "+ name);
   }

    public static void E3_OperacionConNumeros(){
       System.out.println("EJERCICIO 3:");
       /*
       Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
       multiplicación, división y módulo (resto de la división).
        */

       //definir variables de tipo int, inicializarlas
       double num1 = 5;
       double num2 = 6;

       //operaciones:

       //SUMA:
       double suma = num1 + num2;
       System.out.println("La suma de "+num1+" y "+num2+" es: "+suma);

       //RESTA:
       double resta = num1 - num2;
       System.out.println("La resta de "+num1+" y "+num2+" es: "+resta);

       //MULTIPLICACION:
       double multi = num1 * num2;
       System.out.println("La multiplicacion de "+num1+" y "+num2+" es: "+multi);

       //DIVISION
       double division = num1 / num2;
       System.out.println("La division de "+num1+" y "+num2+" es: "+division);

       //MODULO
       double resto = num1 % num2;
       System.out.println("El resto de "+num1+" y "+num2+" es: "+resto);
   }

    public static void E4_NumerosMayorMenor(){
       System.out.println("EJERCICIO 4:");
       /*
       Declara 2 variables numéricas (con el valor que desees),
       he indica cual es mayor de los dos. Si
       son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
        */

       //definir variable e inicializarla
       int numero1 = 10;
       int numero2 = 10;

       //metodo if

       if (numero1 == numero2){ //numeros iguales
           System.out.println("Ambos numeros son iguales");

       }else if (numero1 > numero2){// a>b
           System.out.println(numero1+" es mayor que "+numero2);
       }else{//a<b
           System.out.println(numero2+" es mayor que "+numero1);
       }
   }

    public static void E5_NumeroDivisiblePor2 (Scanner sc){
        System.out.println("EJERCICIO 5:");
        /*
        Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
        debemos indicarlo.
         */

       //pedir al usuario que ingrese un numero, lo guardamos en una variable
       System.out.println("Ingrese un numero:");
       int numero = sc.nextInt();

       //validar si es divisible por 2, mediante un if
       if (numero%2==0){
           System.out.println(numero+" es divisible por 2");
       }else{
           System.out.println(numero+" no es divisible por 2");
       }
   }

    public static void E6_PrecioIva(Scanner sc){
       System.out.println("EJERCICIO 6:");
        /*
        Lee un número por teclado que pida el precio de un producto (puede tener decimales)
        y calcule
        el precio final con IVA. El IVA sera una constante que sera del 21%.
         */

       //pedir al usuario que ingrese un dato,guardarlo en una variable tipo double
       System.out.println("Ingrese el precio sin IVA:");
       double precio = sc.nextDouble();

       //crear una variable con el IVA del producto(21%)
       double IvaIncluido = precio * 0.21;

       //crear otra varibale con el total(precio + iva)
       double PrecioConIva = precio + IvaIncluido;

       //mostrar por consola el resultado
       System.out.println("El precio con IVA incluido es de: $"+PrecioConIva);




   }

    public static void E7_1_al_100_BucleWhile(){
        System.out.println("EJERCICIO 7:");
        /*
        Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
         */

        //bucle while:bloque de código repetidamente mientras se cumpla una determinada condición.
        // Es útil para realizar tareas que deben repetirse hasta que se alcance un estado específico.

        //definir i , inicializarla
        int i = 1;

        //while
        while (i<=100){//agregamos una condicion

            System.out.println("numero: "+(i));
            i++;
        }

    }

    public static void E8_1_al_100_BucleFor(){
        /*
        Haz el mismo ejercicio anterior con un bucle for.
         */
         //creamos un bucle for para iterar y mostrar los numeros
            for ( int i = 0; i <100 ; i++) {
                //mostrar por consola los numeros
                System.out.println("numero: "+(i+1));
            }
    }

    public static void E9_1_al_100_Divisibles_Por_2y3_BucleWhile(){
        System.out.println("EJERCICIO 9:");
        /*
        Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que
        desees.
         */

        //definir variable e iniciarla para la condicion del while
        int i = 1;

        while(i<=100){
            if(i % 2==0 && i % 3==0){
                System.out.println("numero divisible por 2 y 3:");
                System.out.println((i));

            }
            i++;
        }


    }

    public static void E9_1_al_100_Divisibles_Por_2y3_BucleFor(){

        for (int i = 1; i <= 100; i++){
            //crear un if
            if (i % 2==0 && i % 3 ==0){
                System.out.println("numero divisible por 2 y 3: "+(i));
            }
        }
    }

    public static void E10_Numero_Mayor_o_Igual_Cero(Scanner sc){

        System.out.println("EJERCICIO 10:");
        /*
        Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
        lo volverá a pedir (do while), después muestra ese número por consola.
         */

        //pedir al usuario que ingrese un valor, guardarlo en una variable tipo int

        System.out.println("Ingrese un numero:");
        int numero = sc.nextInt();


        //crear un bucle do while con la condicion dada
        do {
            if (numero<0){
                System.out.println("numero invalido, ingrese un numero mayor o igual a cero");
                numero = sc.nextInt();
            }
        }while(numero<0);// si es true se repite el bucle, si es false se detendra

        //mostrar por consola un mensaje
        System.out.println("numero ingresado:"+numero);
    }

    public static void E11_Contraseña(Scanner sc){
        System.out.println("EJERCICIO 11:");
        /*
        Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
        pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la
        contraseña y mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
        salida (3 intentos y si acierta sale, aunque le queden intentos).
         */

        System.out.println("crea una contraseña:");
        String password = sc.nextLine();
        System.out.println("Contraseña guardada exitosamente");

        int intentos = 0;
        boolean acceso = false;


        while (intentos<3){

            System.out.println("Ingrese contraseña:");
            String contra = sc.nextLine();



            if (contra.equals(password)){
                System.out.println("acceso correcto");
                acceso = true;
                break;
            }else{
                System.out.println("intente de nuevo, te quedan "+(3-intentos)+" intentos");
                intentos++;

            }
        }

        if (!acceso){
            System.out.println("Agotaste tus intentos");
        }




    }

    public static void E12_Dia_Laboral(Scanner sc){
        /*
        Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
        (siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número
        ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.
         */
        String dia = "";
        do {
            System.out.println("Ingrese un dia de semana:");
            System.out.println("1-Lunes");
            System.out.println("2-Martes");
            System.out.println("3-Miercoles");
            System.out.println("4-Jueves");
            System.out.println("5-Viernes");
            System.out.println("6-Sabado");
            System.out.println("7-Domingo");
             dia = sc.nextLine();

            switch (dia){

                case "1","2","3","4","5":
                    System.out.println("dia laboral");
                    break;

                case "6","7":
                    System.out.println("dia no laboral");
                    break;

                default:
                    System.out.println("numero no valido, intente de nuevo");


            }

        }while (Integer.parseInt(dia)<1 || Integer.parseInt(dia)>7);

    }

    public static void E13_Numeros_Primos(Scanner sc){
        /*
        Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
        solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
        entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
        ir comprobando que si es divisible desde ese número hasta 1.
        NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
         */

        // Pedimos al usuario que introduzca un número
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        boolean esPrimo = true;

        // Si el número es menor o igual a 1, no es primo
        if (num <= 1) {
            System.out.println(num + " no es primo");
        }
        // Si el número es 2 o 3, sabemos que es primo
        else if (num == 2 || num == 3) {
            System.out.println(num + " es primo");
        }
        // Si el número es divisible por 2 o 3, no es primo
        else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " no es primo");
        }

        // Si no es divisible por 2 o 3, seguimos verificando del 5 para adelante
        else {
            // Comenzamos desde 5 y probamos solo los números impares
            for (int i = 5; i * i <= num; i += 2) {
                // Si encontramos un divisor, no es primo
                if (num % i == 0) {
                    esPrimo = false;
                    break; // Salimos del bucle, no hace falta seguir buscando
                }
            }
            // Si no encontramos ningún divisor, el número es primo
            if (esPrimo) {
                System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
        }
    }

    public static void E14_Numero_Aleatorio(Scanner sc){
        /*
        Codifique un programa de consola en Java que permita realizar las siguientes acciones:
        Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:

        Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
        ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
        aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
        para lograrlo.
         */

        //crear numero aleatorio

        int NumeroRandom = (int) (Math.random()* 100) + 1; //numeros aleatorios del 1 al 100
        //int NumeroRandom = 10; //para comprobar si funciona

        //definir e inicializar variable
        int NumeroUsuario= 0;

        //variable para guardar cantidad de intentos
        int intentos = 0;

        do {

            //pedir al usuario que ingrese un numero
            System.out.println("Ingrese un numero entre 1 y 100");
             NumeroUsuario = sc.nextInt();

            if(NumeroUsuario>NumeroRandom){
                System.out.println("Es muy alto");
                intentos++;

            } else if (NumeroUsuario<NumeroRandom) {
                System.out.println("Es muy bajo");
                intentos++;

            }else {
                System.out.println("Numero encontrado");
                System.out.println("intentos realizados: "+(intentos+1));

            }
        }while (NumeroRandom!=NumeroUsuario);
    }







}
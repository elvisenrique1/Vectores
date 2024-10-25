package ejerciciosvectoresarreglos;
        /*
        crear un vector de 10 posiciones pedirle al usuario que cargue 10 valores para ese vector indicar cuántos números          pares y cuántos impares hay indicar cuántas veces se repitió el número 2
        */

        /*
        Crear un vector que contenga el monto de la facturación total de una empresa de los últimos 6 meses informar:
        la máxima facturación
        la facturación más baja
        el promedio de facturación
        */

        /*
        Pedirle al usuario que ingrese el tamaño del vector (longitud), luego pedirle al usuario que cargue los números           de cada posición.
        Al finalizar, por pantalla mostrar:
            * Listado de números ingresados, uno al lado del otro separados por una barra.
            * Sumatoria de todos los números
            * Mayor número ingresado
            * Menor número ingresado
            * Promedio de números ingresados (entero, sin decimales)
            * Cantidad de números pares
            * Cantidad de números impares
        */
import java.util.Scanner;

/**
 *
 * @author Elvis Enrique Guaiquire
 */
public class EjerciciosVectoresArreglos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        imprimirEncabezadoEjercicio1();
        int[] numEnteros = new int[10];
        int longitudVector = obtenerLongitudVector(teclado);        
        cargarVector(numEnteros, longitudVector, teclado);
        imprimirVector(numEnteros, longitudVector);        
        
        imprimirEncabezadoEjercicio2();       
        int[] facturas = new int[6];
        int longitudVectorFacturacion = obtenerLongitudVectorFacturacion(teclado);        
        cargarVectorFacturacion(facturas, longitudVectorFacturacion, teclado);
        imprimirVectorFacturacion(facturas, longitudVectorFacturacion);
        
        imprimirEncabezadoEjercicio3();
        int valorLongitudVector = solicitarLongitudVector(teclado);        
        int[] enteros = crearVector(valorLongitudVector);
        ingresarValoresVector(enteros, teclado);
        imprimirValoresVector(enteros, valorLongitudVector);
        
    } // Cierre del main
        
    // *** Ejercicio 1 Funciones y Procedimientos ***
    
    // *** Esta función simplemente imprime un encabezado para el ejercicio 1. ***
    public static void imprimirEncabezadoEjercicio1(){
        System.out.println("\n*.- Ejercicio 1 -.*");
        System.out.println("\n*** \"Vector de tamaño fijo(10) - JAVA\" ***");
    
    }  
    // *** Solicita al usuario que ingrese la longitud del vector y devuelve ese valor como int. ***
    public static int obtenerLongitudVector(Scanner teclado){
        System.out.print("*.- Ingrese el largo/longitud del vector: ");
        return teclado.nextInt();    
    }
    // *** Lee valores del usuario y los asigna al vector creado. ***
    public static void cargarVector(int[] numEnteros, int longitudVector, Scanner teclado){
        for (int i = 0; i < longitudVector; i++) {
            System.out.print("Ingrese un numero entero[" + i + "] = ");
            numEnteros[i] = teclado.nextInt();            
        }
    } 
    // *** Imprime los valores del vector y realiza algunos cálculos adicionales. ***
    public static void imprimirVector(int[] numEnteros, int longitudVector){        
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorNumeroDos = 0;
        System.out.println("\n*.- Impresión del Vector -.*");
        for (int i = 0; i < longitudVector; i++) {
            System.out.println("Enteros[" + i + "] = " + numEnteros[i]);
            
            if(numEnteros[i] % 2 != 0){
                contadorImpares++;                
            }else contadorPares++;
            
            if(numEnteros[i] == 2){
                contadorNumeroDos++;
            }
        }
        System.out.println("\nCantidad de números ingresados: " + longitudVector);        
        System.out.println("Cantidad de números pares encontrados: " + contadorPares);
        System.out.println("Cantidad de números impares encontrados: " + contadorImpares);
        System.out.println("El número dos(2) se repite " + contadorNumeroDos + " veces");        
    }

    // *** Ejercicio 2 Funciones y Procedimientos ***
    
    // *** Esta función simplemente imprime un encabezado para el ejercicio 2. ***
    public static void imprimirEncabezadoEjercicio2(){
        System.out.println("\n*.- Ejercicio 2 -.*");
        System.out.println("\n*** \"Vector de tamaño fijo(6) - JAVA\" ***");    
    }   
    // *** Solicita al usuario que ingrese la longitud del vector de facturación y devuelve ese valor como int. ***
    public static int obtenerLongitudVectorFacturacion(Scanner teclado){
        System.out.print("*.- Ingrese el largo/longitud del vector: ");
        return teclado.nextInt();    
    }
    // ***  Lee valores del usuario y los asigna al vector de facturas creado. ***
    public static void cargarVectorFacturacion(int[] facturas, int longitudVectorFacturacion, Scanner teclado){
        for (int i = 0; i < longitudVectorFacturacion; i++) {
            System.out.print("Ingrese un numero entero[" + i + "] = ");
            facturas[i] = teclado.nextInt();            
        }
    }  
    // *** Cálcula y muestra varias estadisticas sobre la facturación mensual. ***
    public static void imprimirVectorFacturacion(int[] facturas, int longituVectorFacturacion){        
        float suma = 0;        
        System.out.println("\n*.- Resultados del Vector Facturación -.*");
        
        // *** Recorrer vector ***
        for(int i=0; i<facturas.length; i++){
            suma += facturas[i];
        }        
        System.out.println("\nTotal de facturación durante los últimos 6 meses: $" + suma);        
        
        // *** Cálculo del mayor ***
        int mayor = facturas[0];
        for(int f:facturas) if(f>mayor) mayor=f;
        System.out.println("La máxima facturación: $" + mayor);
        
        // *** Cálculo del menor ***
        int menor = facturas[0];
        for(int f:facturas) if(f<menor) menor=f;
        System.out.println("La facturación mas baja: $" + menor);
        
        // *** Calcular promedio ***
        float promedio = suma / facturas.length;
        System.out.println("El promedio de facturación: $" + promedio);               
    }
    
    // *** Ejercicio 3 Funciones y Procedimientos ***
    
    // *** Esta función simplemente imprime un encabezado para el ejercicio 3. ***
    public static void imprimirEncabezadoEjercicio3(){
        System.out.println("\n*.- Ejercicio 3 -.*");
        System.out.println("\n*** Introducir valores a un vector - JAVA ***");    
    } 
    // *** Solicita al usuario que ingrese la longitud del vector y devuelve ese valor como int. ***
    public static int solicitarLongitudVector(Scanner teclado){
        System.out.print("*.- Ingrese el largo/longitud del vector: ");
        return teclado.nextInt();    
    }  
    // *** Crea un nuevo vector de enteros con la longitud especificada por el usuario. ***
    public static int[] crearVector(int valorLongitudVector){        
        return new int[valorLongitudVector];
    }    
    // *** Lee valores del usuario y los asigna al vector creado. ***
    public static void ingresarValoresVector(int[] enteros, Scanner teclado){
        for (int i = 0; i < enteros.length; i++){
            System.out.print("Ingrese un numero entero[" + i + "] = ");
            enteros[i] = teclado.nextInt();            
        }    
    }  
    // *** Imprime los valores del vector y realiza varios cálculos sobre esos números. ***
    public static void imprimirValoresVector(int[] enteros, int valorLongitudVector){        
        int sumarNumeros = 0;
        int mayorNumero = 0;
        int menorNumero = 0;
        int promedioSumatoria = 0;
        int contadorPares = 0;
        int contadorImpares = 0;        
        
        System.out.println("\n*.- Impresión del Vector -.*");
        for (int i = 0; i < valorLongitudVector; i++){
            System.out.println("Enteros[" + i + "] = " + enteros[i]);
            sumarNumeros += enteros[i];
            if(enteros[i] % 2 != 0){
                contadorImpares++;                
            }else contadorPares++;
            // *** Cálculo del mayor ***
            mayorNumero = enteros[0];
            for(int e:enteros) if(e>mayorNumero) mayorNumero=e;
            // *** Cálculo del menor ***
            menorNumero = enteros[0];
            for(int e:enteros) if(e<menorNumero) menorNumero=e;
            // *** Calcular promedio ***
            promedioSumatoria = sumarNumeros / enteros.length;
        }
        
        System.out.println("\nCantidad de números ingresados: " + valorLongitudVector);
        System.out.println("La Sumatoria de todos los números ingresados en el vector es: " + sumarNumeros );
        System.out.println("Mayor número ingresado: " + mayorNumero);
        System.out.println("Menor número ingresado: " + menorNumero);
        System.out.println("El promedio de los números ingresados es: " + promedioSumatoria);
        System.out.println("Cantidad de números pares encontrados: " + contadorPares);
        System.out.println("Cantidad de números impares encontrados: " + contadorImpares);                
    }    

} // Cierre de la Clase

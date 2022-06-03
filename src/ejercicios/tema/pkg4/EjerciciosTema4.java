/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.tema.pkg4;

/**
 *
 * @author Nicoaimar
 */
public class EjerciciosTema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
            // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        
                var numeroIf = 0;

                if(numeroIf > 0 ){
                    System.out.println("El número " + numeroIf + " es positivo");
                } else if (numeroIf < 0) {
                    System.out.println("El número " + numeroIf + " es negativo");
                } else {
                    System.out.println("El número es igual a " + numeroIf);
                }

        // 2- Crea un bucle While, este bucle tendrá que tener como condición que la variable 
        //    numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        
        //         a- Incrementar el valor de la variable en uno cada vez que se ejecute.
        //         b- Mostrarlo por pantalla cada vez que se ejecute.

                var numeroWhile = 2;

                while(numeroWhile < 3) {


                    System.out.println("Número While: " + numeroWhile);
                    numeroWhile++;
                }
        
        // 3- Para el bucle Do While, deberás crear la misma estructura que en el While, 
        //    pero solo se debe ejecutar una vez.
        
                var numeroDoWhile = 3;
        
                do {
                    
                    numeroDoWhile++;
                    System.out.println("Número DoWhile: " + numeroDoWhile);
                    
                } while (numeroDoWhile < 3);
                
        // 4- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
        //    y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor 
        //    cada vez que se ejecute y deberá mostrarse por pantalla.
                
                for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                    System.out.println("Número For: " + numeroFor);
                }
        
        // 5- Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
        //    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
        //    También habrá que poner un default para cuando el valor de la variable no sea una estación.       
        
                var estacion = "Invierno";
                
                switch(estacion) {
                    case "Verano":
                        System.out.println("Estamos en Verano.");
                        break;
                    case "Otoño": 
                        System.out.println("Estamos en Otoño.");
                        break;
                    case "Invierno": 
                        System.out.println("Estamos en Invierno.");
                        break;
                    case "Primavera": 
                        System.out.println("Estamos en Primavera.");
                        break;
                    default:
                        System.out.println("El dato proporcionado no corresponde a una estación.");
                }   
                
               
    }
    
}

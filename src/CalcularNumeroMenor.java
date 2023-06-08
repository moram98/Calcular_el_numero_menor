import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeros[];
        int cantNumeros;

        System.out.println("Cuantos numeros va ingresar: ");
        cantNumeros = sc.nextInt();
        numeros = new int[cantNumeros];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        int  menor;
        menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros [i] < menor){
             menor = numeros[i];
            }
        }
        System.out.println("el numero menor es: "  + menor);
        if ( menor < 10 ){
            System.out.println( " el numero es menor que 10 ");
        }else{
            System.out.println("el numero menor  es igual o mayor que 10");
        }
    }
}

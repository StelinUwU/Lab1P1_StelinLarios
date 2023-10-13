import java.util.Scanner;


public class Lab1P1_StelinLarios {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numero = 1;
        char caracter = 'a';
        double doble = 1.25;
        boolean VoF = true;

        System.out.println("Elija el ejercicio: ");
        numero = sc.nextInt();


        if(numero == 1){

            int num1 = 15;
            int num2 = 30;

            int resultado;

            resultado = 15 * 30;

            System.out.print("Resultado: ");
            System.out.println(resultado);


        }else if(numero == 2){

            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario = sc.nextInt();

            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario2 = sc.nextInt();

            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario3 = sc.nextInt();

            double promedio = (numeroUsuario + numeroUsuario2 + numeroUsuario3) / 3;
            System.out.print("El promedio es: " + promedio);


        }else{
            System.out.println("Salio del programa");
        }



    }

}
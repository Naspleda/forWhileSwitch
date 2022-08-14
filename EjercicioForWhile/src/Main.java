import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Integer numeroIf = sc.nextInt();

        if (numeroIf > 0){
            System.out.println("positivo");
        }
        else if(numeroIf < 0){
            System.out.println("negativo");
        }
        else{
            System.out.println("0");
        }

        System.out.println("------------");


        System.out.println("Ingrese un numeroWhile: ");
        Integer numeroWhile = sc.nextInt();
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("-----------");

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println("--------------");

        int numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("--------------");

        System.out.println("Ingrese estacion: ");
        String estacion = sc.nextLine();
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otono":
                System.out.println("Es otono");
                break;
            default:
                System.out.println("invalido");
            }



    }
}
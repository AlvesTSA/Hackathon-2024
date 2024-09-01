package application;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import util.Pares;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Pares p = new Pares();
        int[] numeros = new int[6];
        
        for(int i = 0; i < numeros.length; i++){
            
            System.out.print("Informe o " + (i + 1) + "° numero: ");
            numeros[i] = sc.nextInt();
        }

        List<int[]> result = p.encontrarPares(numeros);
         
        System.out.println("Pares com menor deferença absoluta: ");

        for (int[] par : result) {
            System.out.println(Arrays.toString(par));
        }
        
        sc.close();
    }
}

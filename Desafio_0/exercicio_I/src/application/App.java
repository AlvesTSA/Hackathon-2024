package application;

import java.util.Scanner;
import util.Asterisco;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Asterisco as = new Asterisco();
        System.out.print("Informe quantas strings deseja obter na lista: ");
        int n = sc.nextInt();
        List<String> lista = as.geradorAsterisco(n);
        System.out.println("Lista de strings: " + lista);
        sc.close();
    }
}

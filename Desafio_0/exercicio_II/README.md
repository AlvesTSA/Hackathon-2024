
<h1>Exercício II</h1>
    <p>
        Dado um array de números inteiros, escreva uma função que retorne o par de números com a menor diferença absoluta. Se houver mais de um par com a mesma diferença, retorne todos eles em uma lista.
    </p>
    <h2>Código:</h2>
<pre>
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
            
            System.out.println("Pares com menor diferença absoluta: ");
            for (int[] par : result) {
                System.out.println(Arrays.toString(par));
            }
            sc.close();
        }
    }
</pre>

<pre>
    package util;

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;

    public class Pares {

        public List<int[]> encontrarPares(int[] numeros){
            List<int[]> paresMenorDiferenca = new ArrayList<>();
            Arrays.sort(numeros);
            int menorDiferenca = Integer.MAX_VALUE;

            for(int i = 0; i < numeros.length - 1; i++){
                int diferenca = numeros[i + 1] - numeros[i];
                if (diferenca < menorDiferenca) {
                    menorDiferenca = diferenca;
                    paresMenorDiferenca.clear();
                    paresMenorDiferenca.add(new int[]{numeros[i], numeros[i + 1]});
                }
                else if (diferenca == menorDiferenca) {
                    paresMenorDiferenca.add(new int[]{numeros[i], numeros[i + 1]});
                }
            }
            return paresMenorDiferenca;
        }
    }
</pre>

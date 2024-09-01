
<h1>Exercício I</h1>
    <p>
        Escreva uma função que, dado um número inteiro <strong>n</strong>, retorne uma lista de <strong>n</strong> strings de tal forma que a string <strong>i</strong> contém <strong>i</strong> asteriscos. Por exemplo, para <strong>n=5</strong>, a lista retornada seria <strong>["*", "**", "***", "****", "*****"]</strong>.
    </p>
    <h2>Código:</h2>
<pre>
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
</pre>

<pre>
    package util;

    import java.util.List;
    import java.util.ArrayList;

    public class Asterisco {
        
        public List<String> geradorAsterisco(int n){
            List<String> result = new ArrayList<>();
            for(int i = 0; i < n; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j <= i; j++){
                    sb.append("*");
                }
                result.add(sb.toString());
            }
            return result;
        }
    }
</pre>

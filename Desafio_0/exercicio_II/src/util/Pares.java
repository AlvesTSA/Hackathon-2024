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
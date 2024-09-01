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

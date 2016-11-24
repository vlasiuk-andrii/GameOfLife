import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

public class Life {

    public String nextGeneration(String input) {
        char[][] arr = makeArr(input);

        try{
            int counter = 0;
            for (int k = arr.length - 2; k >= 0; k--){
                for (int i = arr[k].length - 1; i >= 0; i--){
                    if (arr[k][i] == '.'){
                        if (arr[k][i-1] == '*')
                            counter++;
                        if (arr[k][i+1] == '*')
                            counter++;
                        if (arr[k-1][i-1] == '*')
                            counter++;
                        if (arr[k-1][i] == '*')
                            counter++;
                        if (arr[k-1][i+1] == '*')
                            counter++;
                        if (arr[k+1][i-1] == '*')
                            counter++;
                        if (arr[k+1][i] == '*')
                            counter++;
                        if (arr[k+1][i+1] == '*')
                            counter++;
                        if (counter == 3)
                            arr[k][i] = '*';
                    }
                }
            }
        }
        catch(Exception e ){
            System.out.println("we have error");
        }

        String output = makeOutputString(arr);
        return output;
    }

    private String makeOutputString(char[][] arr) {
        String outputLocal = "";
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                outputLocal += arr[i][j];
            }
            if(i != arr.length - 1)
                outputLocal += "\n";
        }
        return outputLocal;
    }


    private char[][] makeArr(String input) {
        int a = 0;
        int b = 0;
        a = input.split("\n").length;
        if (a != 0)
            b = input.split("\n")[0].length();
        char[][] arr = new char[a][b];
        for (int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr[i][j] = input.split("\n")[i].toString().charAt(j);
            }
        }
        return arr;
    }
}

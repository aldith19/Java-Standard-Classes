package Java.Classes;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        String name= "Agus Dwicipto Kusuma";

        StringTokenizer stringTokenizer = new StringTokenizer(name," ");

        while (stringTokenizer.hasMoreTokens()){
            String result = stringTokenizer.nextToken();
            System.out.println(result);
        }

    }
}

package Java.Classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {

        String query = "Belajar Bahasa Java";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String result = new String(bytes);
        System.out.println(result);
    }
}

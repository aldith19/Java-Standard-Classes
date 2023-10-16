package Java.Classes;

import java.util.StringJoiner;

public class StringJoinerApp {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ","[","]");

        joiner.add("Lenovo");
        joiner.add("Acer");
        joiner.add("Asus");

        String value = joiner.toString();
        System.out.println(value);
    }
}

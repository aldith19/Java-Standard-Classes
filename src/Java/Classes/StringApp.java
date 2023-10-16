package Java.Classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Malik Malih";
        String lowercase = name.toLowerCase();
        String uppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Malik"));
        System.out.println(name.endsWith("Malih"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }
        char chars = name.charAt(3);
        System.out.println(chars);



    }
}

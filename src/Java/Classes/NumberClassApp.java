package Java.Classes;

public class NumberClassApp {

    public static void main(String[] args) {

        Integer intvalue = 20;

        Long longvalue = intvalue.longValue();
        Double doublevalue = intvalue.doubleValue();
        Short shortvalue = doublevalue.shortValue();

        System.out.println(longvalue);
        System.out.println(doublevalue);
        System.out.println(shortvalue);

        String example = "10000";

        Integer Intexample = Integer.valueOf(example);
        System.out.println(example);
    }
}

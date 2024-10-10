package main;

import java.util.stream.IntStream;

public class Main {
    private static int amount;

    public static void main(String[] args) {
        String text = "Hello world!";

        int length = text.length();
        char[] chars = text.toCharArray();

        IntStream.range(0, length).forEach(i ->
                IntStream.range(0, length).forEach(j -> {
                    if (i != j) {
                        char[] copyArray = chars.clone();
                        char temp = copyArray[i];

                        copyArray[i] = copyArray[j];
                        copyArray[j] = temp;

                        amount++;

                        System.out.println(new String(copyArray));
                    }
                })
        );

        System.out.println("Changed " + amount);
    }
}
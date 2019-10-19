package main.java.chernoskutov;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrRandom {
    public static void main(String[] args) {
        int SZ = 40;
        System.out.println("All matches:");
        Double[] arr = Stream.generate(Math::random).limit(SZ).sorted().peek(System.out::println).toArray(Double[]::new);
        System.out.println("========");
        System.out.println("min: " + Arrays.stream(arr).min(Double::compareTo).get().toString());
        System.out.println("max: " + Arrays.stream(arr).max(Double::compareTo).get().toString());
        System.out.println("avg: " + Arrays.stream(arr).reduce(Double::sum).get() / arr.length );
    }
}

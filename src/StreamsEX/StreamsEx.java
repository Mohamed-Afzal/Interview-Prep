package StreamsEX;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StreamsEx {
    public static void main(String[] args) {
        streamMethod();
        functionalInterface();
    }

    private static void streamMethod() {
        // Stream can be created with 2 ways stream() and of()
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        System.out.println(stream);
        stream = Stream.of("a", "b", "c");
        System.out.println(stream);

        //multi threading using stream
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 5,6);
        list.parallelStream().forEach(element -> dowork(element));

        long count = list.stream().distinct().count();
        System.out.println("count "+count);

        System.out.println("reverse order with unique value "+list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //filter and collector
        ArrayList<String> filterList = new ArrayList<>();
        filterList.add("One");
        filterList.add("OneAndOnly");
        filterList.add("Derek");
        filterList.add("Change");
        filterList.add("factory");
        filterList.add("justBefore");
        filterList.add("Italy");
        filterList.add("Italy");
        filterList.add("Thursday");
        filterList.add("");
        filterList.add("");

        List<String> streamList = filterList.stream().filter(element -> element.contains("d"))
                .collect(Collectors.toList());
        System.out.println("streamlist "+ streamList);

        //Maps
        List<String> uris = new ArrayList<>();
        uris.add("C:\\My.txt");
        Stream<Path> streamMap = uris.stream().map(uri -> Paths.get(uri));
        streamMap.forEach(System.out::println);

        //FlatMaps
        List<Detail> details = new ArrayList<>();
        // Add details with parts
        details.add(new Detail(Arrays.asList("Part1", "Part2", "Part3")));
        details.add(new Detail(Arrays.asList("Part4", "Part5")));
        details.add(new Detail(Arrays.asList("Part6")));

        Stream<String> streamFlatMap
                = details.stream().flatMap(detail -> detail.getParts().stream());
        // Print the parts from the stream
        streamFlatMap.forEach(System.out::println);

        //Matching
        boolean isValid = filterList.stream().anyMatch(element -> element.contains("h")); // true
        boolean isValidOne = filterList.stream().allMatch(element -> element.contains("h")); // false
        boolean isValidTwo = filterList.stream().noneMatch(element -> element.contains("h")); // false
        System.out.println("is Valid "+ isValid+ " is Valid One "+ isValidOne+ " isValid two "+isValidTwo);

        //Reduction
        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);
        System.out.println("reduction "+reduced);
    }

    private static void dowork(Integer element){
        System.out.println(element);
    }

    private static void functionalInterface(){
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        System.out.println(value);

//        Function<T, R>: Takes an input of type T and returns a result of type R.
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Hello")); // Output: 5

//        Consumer<T>: Takes an input of type T and performs an operation, but doesn’t return anything.
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello, Consumer!"); // Output: Hello, Consumer!

//        Supplier<T>: Does not take any input but supplies a value of type T.
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // Output: Random number

//        Predicate<T>: Takes an input of type T and returns a boolean result (used for conditions).
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true

//        BiFunction<T, U, R>: Takes two inputs of types T and U, and produces a result of type R.
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 3)); // Output: 5


        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer<Integer> integerParityAsserter = i -> {
            if (i % 2 == 0) {
                System.out.println(i + " is not even");
//                Assert.assertTrue(i + " is not even", i % 2 == 0);
            } else {
                System.out.println(i + " is not odd");
//                Assert.assertTrue(i + " is not odd", i % 2 != 0);
            }
        };

        ints.stream()
                .forEach(integerParityAsserter);

    }
}

class Detail {
    private List<String> parts;

    public Detail(List<String> parts) {
        this.parts = parts;
    }

    public List<String> getParts() {
        return parts;
    }
}
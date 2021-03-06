import java.util.ArrayList;

public class ArrayListGenericsDemo {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Helluva");
        strings.add("Engineer!");
        Integer BULL_DOG = Integer.MIN_VALUE;
        // Since strings is a typed collection, Java type checks
        // insertions and retrievals
        strings.add(BULL_DOG.toString()); // Won't compile
        System.out.println(strings);

        // Notice that we don't need to repeat the type parameter in the 
        // creation expression, becuase Java infers the type from
        // the declaration
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(new Integer(42));
        ints.add(new Integer(66));
        // As before, Java will auto-box a primitive int in an Integer
        ints.add(99);
        System.out.println(ints);
        
        // And since we have a typed collection, Java will also autobox
        // when we retrieve elements form the collection
        int num = ints.get(0);
    }

}

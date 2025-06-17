import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        Box<String> stringBox = new Box<>();

        stringBox.setValue("Hello");
        System.out.println(stringBox.getValue());

        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println(intBox.getValue());

        // generic collections
        ArrayList<String> names = new ArrayList<>();

        names.add("Farid");
        names.add("Babak");
        names.addLast("Last");

        for (String name : names)
        {
            System.out.println(name);
        }

        // challenge 
        Box<Integer> b1 = new Box<>();
        Box<Integer> b2 = new Box<>();
        Box<Integer> b3 = new Box<>();
        Box<Integer> b4 = new Box<>();
        Box<Integer> b5 = new Box<>();

        b1.setValue(10);
        b2.setValue(20);
        b3.setValue(30);
        b4.setValue(40);
        b5.setValue(50);

        ArrayList<Box<Integer>> numbers = new ArrayList<>();
        numbers.add(b1);
        numbers.add(b2);
        numbers.add(b3);
        numbers.add(b4);
        numbers.add(b5);

        int sum = 0;
        for (Box<Integer> num : numbers)
        {
            System.out.println(num.getValue());
            sum+=num.getValue();
        }
        System.out.println("Sum of all numbers in the boxes " + sum);

        System.out.println("Using Iterator...");

        Iterator<Box<Integer>> iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            Box<Integer> num = iterator.next();
            System.out.println(num.getValue());   
        }
    }
}
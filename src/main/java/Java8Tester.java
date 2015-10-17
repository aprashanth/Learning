import java.util.*;

/**
 * Created by vadulasp on 10/10/15.
 */
public class Java8Tester {
    public static void main(String args[]) {
        List<String> names1  = new ArrayList<String>();
        names1.add("Mahesh");
        names1.add("Suresh");
        names1.add("Ramesh");
        names1.add("Naresh");
        names1.add("Kalpesh");

        List<String> names2  = new ArrayList<String>();
        names2.add("Mahesh");
        names2.add("Suresh");
        names2.add("Ramesh");
        names2.add("Naresh");
        names2.add("Kalpesh");

        Java8Tester java8Tester = new Java8Tester();
        System.out.println("Sort using Java 7");


        java8Tester.sortUsingJava7(names1);
//        System.out.println(names1);
        names1.forEach(System.out::println);
        System.out.println("Sort using Java 8");
        java8Tester.sortUsingJava8(names2);
//        System.out.println(names2);
        names2.forEach(System.out::println);

    }

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

    }

    private void sortUsingJava7(List<String> names) {

        Collections.sort(names, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
}

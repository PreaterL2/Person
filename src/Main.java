import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Person, Integer> scoreMap = new HashMap<>();

        Person marcin = new Person("marcin", 50);
        Person marcin2 = new Person("marcin", 50);
        Person bob = new Person("bob", 10);

        Person.Phone phone = new Person.Phone(911);

        scoreMap.put(marcin, 100);
        scoreMap.put(marcin2, 200);
        scoreMap.put(bob, 1000);

        marcin2.setName("abc");
        Integer s = scoreMap.get((new Person("marcin", 50)));
        System.out.println(scoreMap);
        System.out.println();
        System.out.println(s);

        System.out.println(marcin.equals(marcin2));
        System.out.println(marcin.hashCode() == marcin2.hashCode());


    }
}
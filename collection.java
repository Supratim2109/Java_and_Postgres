import java.util.*;

public class collection{
    public static void main(String[] args){
    ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("bmw");
        cars.add("ford");
        cars.add("volvo");

        cars.remove(2);
        System.out.println(cars.size());
    }
        ArrayList<Integer> myNum= new ArrayList<Integer>();
        myNum.add(20);
        myNum.add(10);
        myNum.add(30);
        Collections.sort(myNum);
        for(int i: myNum){
            System.out.println(i);
        
        Hash Set

        Set<String> cars= new HashSet<>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Tata");

        // System.out.println(cars.contains("Tata"));
        // cars.remove("Volvo");
        cars.clear();
        System.out.println(cars.size());

        Tree Set
        Set<String> cars= new TreeSet<>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Tata");
        cars.add("BMW");

        System.out.println(cars);

        HashMap
        Map<String,String> capitalCities = new HashMap<>();
        capitalCities.put("England","London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria","Wien");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");

        // System.out.println(capitalCities);
        capitalCities.remove("England");
        System.out.println(capitalCities.keySet());

    }
}
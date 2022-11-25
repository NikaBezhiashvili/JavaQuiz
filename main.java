import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(1);
        Circle circle3 = new Circle(6);
        Circle circle4 = new Circle(3);
        ArrayList<Double> array_list = new ArrayList<Double>();
        array_list.add(circle1.radius);
        array_list.add(circle2.radius);
        array_list.add(circle3.radius);
        array_list.add(circle4.radius);

        Collections.sort(array_list);
        System.out.println(array_list);

        Product product1 = new Product(1, 13);
        Product product2 = new Product(2, 19);
        Product product3 = new Product(3, 3);
        Product product4 = new Product(4, 5);

        ArrayList<Object> object_list = new ArrayList<Object>();
        object_list.add(product1);
        object_list.add(product2);
        object_list.add(product3);
        object_list.add(product4);

        Map map= new HashMap();
        map.put(product1.id, product1.quantity );
        map.put(product2.id, product2.quantity );
        map.put(product3.id, product3.quantity );
        map.put(product4.id, product4.quantity );

        int sum = 0;

        for (int i = 0; i < map.values().size(); i++) {
        }
    }
}
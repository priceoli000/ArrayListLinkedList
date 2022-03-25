
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<Double>();


        list.add(9.22);
        list.add(12.96);
        list.add(3.8);
        list.add(1.23);
        list.add(4.28);


        list.add(17.89);


        list.remove(17.89);


        list.add(18, 12.86);

        System.out.println(list);
        System.out.println(list.indexOf(12.86));

    }

}



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
public class Main {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList();
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(3);
        list.add(17);
        System.out.println(list);

    System.out.println(getReversed(list));

    }
    public static List<Integer> getReversed(LinkedList<Integer> list){
        List <Integer> list1 = new ArrayList<>();
        Iterator<Integer> iterator = list.descendingIterator();
        while   (iterator.hasNext()){
            list1.add(iterator.next());

        }
        return list1;
    }
}

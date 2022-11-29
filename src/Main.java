import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static Queue<String> queue1 = new LinkedList<>();
    static Queue<String> queue2 = new LinkedList<>();

    public static void main(String[] args) {


    }

    public static void addPerson(String person){
        if (queue1 == queue2 && queue1.size() == 5){
            System.out.println("Открытие 3 очереди");
            return;
        }
        if (queue1.size() <= queue2.size()){
            queue1.add(person);
        }else {
            queue2.add(person);
        }
    }

    public static void deleteRandomPerson(){
        if ((int) (Math.random() * 2) == 1){
            queue1.poll();
        }else {
            queue2.poll();
        }
    }

}
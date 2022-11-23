import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInMarket{
    private Queue<String> queue = new ArrayDeque<>(5);


    public void addPerson(String person){
        queue.offer(person);
    }

    public void serveAllBuyers(){
        String person = queue.poll();
        if (person != null){
            System.out.println("Покупатель " + person + " совершил покупку и покинул магазин");
            serveAllBuyers();
        }
    }

    public void serveOneBuyer(){
        String person = queue.poll();
        if (person != null){
            System.out.println("Покупатель " + person + " совершил покупку и покинул магазин");
        }
    }



    public Queue<String> getQueue() {
        return queue;
    }
}

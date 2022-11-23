public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Market market = new Market();
        market.getInLine("Никита");
        market.getInLine("Никита");
        market.getInLine("Никита");
        market.firstQueue.addPerson("Маша");
        market.firstQueue.addPerson("Маша");
        market.firstQueue.addPerson("Маша");
        System.out.println(market.firstQueue.getQueue().size());
        System.out.println(market.firstQueue.getQueue().size());
        market.getInLine("Никита");
        market.getInLine("Никита");
        market.getInLine("Никита");
        market.getInLine("Никита");
        market.getInLine("Никита");
        System.out.println("\n\n\n\n");
        market.servePersonInRandomQueue();
        market.servePersonInRandomQueue();
        market.servePersonInRandomQueue();



    }
}
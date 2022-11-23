public class Market  {
    QueueInMarket firstQueue = new QueueInMarket();
    QueueInMarket secondQueue = new QueueInMarket();
    QueueInMarket thirdQueue = new QueueInMarket();


    public void getInLine(String name){
        if (firstQueue.getQueue().size() == 5 && secondQueue.getQueue().size() == 5){
            if (thirdQueue.getQueue().size()==0){
                System.out.println("3 касса открылась");
            }
            thirdQueue.addPerson(name);
            System.out.println("Покупатель " + name + " встал в очередь 3");
            return;
        }
        if ((firstQueue.getQueue().size() <= secondQueue.getQueue().size()) && (firstQueue.getQueue().size() != 5)) {
            firstQueue.addPerson(name);
            System.out.println("Покупатель " + name + " встал в очередь 1");
        } else if (((firstQueue.getQueue().size() >= secondQueue.getQueue().size()) && (secondQueue.getQueue().size() != 5))){
            secondQueue.addPerson(name);
            System.out.println("Покупатель " + name + " встал в очередь 2");
        }
    }

    public void serveAllBuyers(){
        firstQueue.serveAllBuyers();
        secondQueue.serveAllBuyers();
        thirdQueue.serveAllBuyers();
    }

    public void servePersonInRandomQueue(){
        int n = (int) (Math.random() * 3);
        if (n == 0){
            firstQueue.serveOneBuyer();
        }
        if (n==1){
            secondQueue.serveOneBuyer();
        }
        if (n == 2){
            thirdQueue.serveOneBuyer();
        }

    }
}

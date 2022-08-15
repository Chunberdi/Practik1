import java.util.*;

public class Main  {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //FIFO - дегенде Queue ни колдонобуз
        //LIFO - дегенде Deque ни колдонобуз

        Map<Integer, String> map = new HashMap<>(); // HashMap та put елементи иштейт
        map.put(5, "Aida");
        map.put(3, "Asia");
        map.put(2, "Ajar");
        map.put(4, "Nursulu");
        map.put(1, "Erlan");

        for (Map.Entry elem: map.entrySet()){
            System.out.println(elem.getKey() + " " + elem.getValue()); //сортровка кылат
        }


        //map.replace(2,"Elnura"); //replace > ордун алмаштырып кой дегенди тушундурот
       // map.put(null, "Esen");

      //  System.out.println(map.get(3));
       // System.out.println(map.get(2));

       /*  for (Map.Entry elem: map.entrySet()) { // Entry менен
             System.out.println(elem.getKey() + " " + elem.getValue());
         }
       for (Integer a: map.keySet()){// Integer менен
            System.out.println(a + " " + map.get(a));
        }




        Deque<String> deque = new ArrayDeque<>();
        deque.add("Izat");
        deque.addLast("Azamat");
        deque.addFirst("Talas");
        deque.offerFirst("Seans");
        deque.offerLast("Kreml");

        int a = deque.size();  // for менен
        for (int i = 0; i < a; i++) {
            System.out.println(deque.poll());

       // }
       // for (String s:deque){
        //    System.out.println(s);
        }

        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.poll());


(
         Queue<String> queue = new PriorityQueue<>((o1, o2) -> o1.length() - o2.length());


        queue.add("Aidana");
        queue.add("Bekbolot");
        queue.add("Syimuk");
        queue.add("Daniel");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


       // input first (< output > консолго чыгат дегенди билдирет)
        Queue<String> queue = new LinkedList<>();
        queue.add("Salam");
        queue.add("array");
       // queue.add("Sai");
       // queue.add("krk");
       // queue.add("oae");
       // queue.offer("Nuraly");

      //  queue.remove("Salam"); //очурот
       // System.out.println(queue.element());
        System.out.println(queue.peek());




       // System.out.println(queue.poll());// биринчи методту кансолго  алып чыгат
        // System.out.println(queue.element());*/



    }

    }


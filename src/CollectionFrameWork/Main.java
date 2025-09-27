package CollectionFrameWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>();


        ArrayList<String> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        Stack<Integer> stack=new Stack<>();


        list.add("sli");
        set.add(1);
        linkedList.add(1);
        priorityQueue.add(1);
        stack.add(1);

        list.size();
        set.size();
        linkedList.size();
        priorityQueue.size();
        stack.size();

        list.isEmpty();
        set.isEmpty();
        linkedList.isEmpty();
        priorityQueue.isEmpty();
        stack.isEmpty();

        list.get(0);
        linkedList.get(0);


        list.remove(1);
        set.remove(1);




        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // ya fir is trah bhi kar sakte hai ham



    }
}

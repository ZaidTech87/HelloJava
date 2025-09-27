import java.util.LinkedList;
import java.util.Queue;

public class FirstNonOccurance {
    public static void findChartann(Queue<Character>q){

        Queue<Character> q2= new LinkedList<>();
        char ch = q.poll();
        while(!q.isEmpty()) {
            if (ch != q.peek()) {
                q2.add(q.poll());
            }
            else if(ch=='n'){
                ch=q2.peek();
            }
            else {
                while (!q2.isEmpty() &&  !q.isEmpty()) {
                    ch = q2.poll();
                    q.poll();
                }
            }
            q.poll();
            ch='n';
        }
        System.out.println(ch);

    }
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>();
        q.add('a');
        q.add('e');
        q.add('c');
        q.add('a');
        q.add('b');
        q.add('d');
        findChartann(q);
    }
}

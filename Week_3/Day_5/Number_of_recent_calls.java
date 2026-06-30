import java.util.LinkedList;
import java.util.Queue;

public class Number_of_recent_calls {
    public static void main(String[] args) {

        String[] operations = {
            "RecentCounter",
            "ping",
            "ping",
            "ping",
            "ping"
        };

        int[][] input = {
            {},
            {1},
            {100},
            {3001},
            {3002}
        };

        RecentCounter obj = null;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("RecentCounter")) {
                obj = new RecentCounter();
                System.out.print("null ");
            } else {
                System.out.print(obj.ping(input[i][0]) + " ");
            }
        }
    }
}
    
class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
     queue = new LinkedList();   
    }
    
    public int ping(int t) {
        queue.add(t);
        while(!queue.isEmpty() && t - 3000 > queue.peek()){
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

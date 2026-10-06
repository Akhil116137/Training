import java.util.*;

public class prirority
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();

        for (int x : new int[]{40, 50, 60, 70})
        {
            minPq.add(x);
        }

        System.out.print("Poll order: ");
        while (!minPq.isEmpty())
            System.out.print(minPq.poll() + " ");

        System.out.println();

        PriorityQueue<Integer> maxPq =
            new PriorityQueue<>(Comparator.reverseOrder());

        maxPq.addAll(List.of(40, 50, 60, 70));

        System.out.println("Max-heap peek: " + maxPq.peek());
    }
}
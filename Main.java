import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Node> processesList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of processes: \t");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Node process = new Node(i + 1);
            processesList.add(process);
        }

        // Creating the ring
        for (int i = 0; i < n - 1; i++) {
            processesList.get(i).setNext(processesList.get(i + 1));
        }
        processesList.get(n - 1).setNext(processesList.get(0)); // connecting the last node with the 0th process

        processesList.get(0).setToken(true);

        br.close();
    }
}

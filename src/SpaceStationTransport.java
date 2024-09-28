import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SpaceStationTransport {

    public static void main(String[] args) {
        // Array of file paths
        String[] filePaths = {
                "src/data_run1.txt",
                "src/data_run2.txt",
                "data/data_run3.txt"
        };

        for (String filePath : filePaths) {
            System.out.println("Processing file: " + filePath);
            processFile(filePath);
        }
    }

    private static void processFile(String filePath) {
        // Initialize stacks for containers and a queue for the corridor
        Stack<String> container1 = new Stack<>();
        Stack<String> container2 = new Stack<>();
        Queue<String> corridor = new LinkedList<>();

        // Initialize bays
        ArrayList<String> bay1 = new ArrayList<>(); // Technology Bay
        ArrayList<String> bay2 = new ArrayList<>(); // Personal Bay
        ArrayList<String> bay3 = new ArrayList<>(); // Food Bay

        // Load containers from file
        try {
            File inputFile = new File(filePath);
            Scanner scanner = new Scanner(inputFile);
            loadContainersFromFile(scanner, container1, container2);
            scanner.close(); // Close scanner after use

        } catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + filePath);
            return;
        }

        // Unload and process Container 1
        unloadContainer(container1, corridor);
        processCorridor(corridor, bay1, bay2, bay3);
        printBayContents(bay1, bay2, bay3);

        // Clear the corridor for the next container
        corridor.clear();

        // Unload and process Container 2 (if not empty)
        unloadContainer(container2, corridor);
        processCorridor(corridor, bay1, bay2, bay3);
        printBayContents(bay1, bay2, bay3);
    }

    private static void loadContainersFromFile(Scanner scanner, Stack<String> container1, Stack<String> container2)
    {
        int totalPods = 0; // Total number of pods across both containers

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty())
            {
                String[] pods = line.split(", ");
                for (String pod : pods)
                {
                    if (totalPods >= 18)
                    {
                        System.out.println("Mission aborted: Too many pods (more than 18).");
                        return; // Abort if total pods exceed 18
                    }

                    if (container1.size() < 9) {
                        container1.push(pod);
                    } else if (container2.size() < 9) {
                        container2.push(pod);
                    } totalPods++; // Increment the total pods count
                }
            }

        }

        System.out.println("Container 1 loaded: " + container1);
        System.out.println("Container 2 loaded: " + container2);
    }

    private static void unloadContainer(Stack<String> container, Queue<String> corridor) {
        System.out.println("Unloading Container...");
        while (!container.isEmpty()) {
            corridor.add(container.pop());
        }
        System.out.println("Corridor contents: " + corridor);
    }

    private static void processCorridor(Queue<String> corridor, ArrayList<String> bay1, ArrayList<String> bay2, ArrayList<String> bay3) {
        while (!corridor.isEmpty()) {
            String pod = corridor.remove();
            addPodToBay(pod, bay1, bay2, bay3);
        }
    }

    private static void addPodToBay(String pod, ArrayList<String> bay1, ArrayList<String> bay2, ArrayList<String> bay3) {
        char type = pod.charAt(0); // First character of the pod ID determines type
        switch (type) {
            case 'T':
                bay1.add(pod); // Technology Bay
                break;
            case 'P':
                bay2.add(pod); // Personal Bay
                break;
            case 'F':
                bay3.add(pod); // Food Bay
                break;
            default:
                System.out.println("Error: Pod " + pod + " is invalid and cannot be added to any bay.");
                break;
        }
    }

    private static void printBayContents(ArrayList<String> bay1, ArrayList<String> bay2, ArrayList<String> bay3) {
        System.out.println("Bay 1 (Technology): " + bay1.size() + " items stored.");
        System.out.println("Bay 2 (Personal): " + bay2.size() + " items stored.");
        System.out.println("Bay 3 (Food): " + bay3.size() + " items stored.");
    }
}

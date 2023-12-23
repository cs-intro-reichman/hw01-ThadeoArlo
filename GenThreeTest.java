import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GenThreeTest {
    public static void main(String[] args) {
        String min = args[0];
        String max = args[1];
        testGenThree(min, max);
    }

    public static void testGenThree(String min, String max) {
        int count = 0;

        while (count < 5) {

            // Create a ByteArrayOutputStream to capture the output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            // Redirect the standard output to the ByteArrayOutputStream
            PrintStream originalOut = System.out;
            System.setOut(printStream);
            String[] range = {min, max};
            GenThree.main(range); // Run the InOrder program

            // Reset the standard output
            System.setOut(originalOut);

            // Get the captured output as a string
            String capturedOutput = outputStream.toString();
            // Check if the program prints the minimal number that was generated
            if (!isValid(capturedOutput, min, max)) {
                System.out.println("Test failed: Minimal number was not printed or not in range");
                return;
            }

            count++;
        }

        System.out.println("All tests passed!");
    }

    public static boolean isValid(String output, String a, String b) {
        String[] lines = output.split("\\r?\\n");
        int[] intArray = new int[3];
        for (int i = 0; i < 3; i++) {
            intArray[i] = Integer.parseInt(lines[i]);
        }
        int lowerBound = Integer.parseInt(a);
        int upperBound = Integer.parseInt(b);
        
        // Check if each element in intArray is within the range
        for (int number : intArray) {
            if (number < lowerBound || number >= upperBound) {
                return false;
            }
            
        }
        int minimal = Math.min(intArray[0], Math.min(intArray[1], intArray[2]));
        return  minimal == extractMinimalNumber(output);
    }

    public static int extractMinimalNumber(String output) {
        // Split the captured output into lines
        int extracted = 0;
        String[] lines = output.split("\\r?\\n");
    
        for (String line : lines) {
            // Check if the line contains the minimal number pattern
            if (line.contains("The")) {
                // Extract the minimal number from the line
                String[] parts = line.split(" ");
                // Parse and return the last word as an integer (the minimal number)
                extracted = Integer.parseInt(parts[parts.length - 1]);
                }
        }
        return extracted;
    }
}
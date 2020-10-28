import java.util.Collections;
import java.util.List;

public class Maximum<T extends Comparable<T>> {

    List<T> inputList;

    // Parameterized Constructor
    public Maximum(List<T> inputList) {
        this.inputList = inputList;
        
    }

    // Method to internally call max() and return the value
    public T testMaximum() {
        return max(inputList);
    }

    // Generic Method to find the Max from the given inputs
    private static <T extends Comparable<T>> T max(List<T> inputList) {
    	Collections.sort(inputList);
        return inputList.get(inputList.size() - 1);
    }
}


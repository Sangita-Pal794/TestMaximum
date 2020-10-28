import java.util.Collections;
import java.util.List;

public class Maximum<T extends Comparable<T>> {

    private List<T> inputList;

    // Parameterized Constructor
    public Maximum(List<T> inputList) {
        this.inputList = inputList;
        
    }

    // Method to internally call max() and return the value
    public T testMaximum() {
    	printMax(max(inputList));
    	return max(inputList);
    }

    // Generic Method to find the Max from the given inputs
    private static <T extends Comparable<T>> T max(List<T> inputList) {
    	Collections.sort(inputList);
        return inputList.get(inputList.size() - 1);
    }
    
    private void printMax(Z maxValue) {
        System.out.println("Max of " + inputList + " : " + maxValue);
    }
}


public class Maximum<T extends Comparable<T>> {

    T in1, in2, in3;

    // Parameterized Constructor
    public Maximum(T in1, T in2, T in3) {
        this.in1 = in1;
        this.in2 = in2;
        this.in3 = in3;
    }

    // Method to internally call max() and return the value
    public Z testMaximum() {
        return max(in1, in2, in3);
    }

    // Generic Method to find the Max from the given inputs
    private static <T extends Comparable<T>> T max(T in1, T in2, T in3) {
        T max;
        if (in1.compareTo(in2) > 0 && in1.compareTo(in3) > 0) max = in1;
        else if (in2.compareTo(in1) > 0 && in2.compareTo(in3) > 0) max = in2;
        else max = in3;
        return max;
    }
}


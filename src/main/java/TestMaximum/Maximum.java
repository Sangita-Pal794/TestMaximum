package TestMaximum;

public class Maximum {
	
	// Method to find the Max Integer
	public Integer maxInteger(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(num1) > 0) max = num2;
        if (num3.compareTo(num2) > 0) max = num3;
        return max;
    }

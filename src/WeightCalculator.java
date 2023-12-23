public class WeightCalculator {

    public static double calculateWeight(int age, String gender) {
        double baseWeight;

        // Define base weights based on gender
        if (gender.equalsIgnoreCase("male")) {
            baseWeight = 50.0;
        } else if (gender.equalsIgnoreCase("female")) {
            baseWeight = 45.0;
        } else {
            System.out.println("Invalid gender");
            return -1.0; // Return a negative value to indicate an error
        }

        // Adjust weight based on age
        if (age < 17) {
            baseWeight -= 2.0;
        } else if (age >= 60) {
            baseWeight += 3.0;
        }

        return baseWeight;
    }

    public static void main(String[] args) {
        // Example usage
        int age = 25;
        String gender = "male";
        double calculatedWeight = calculateWeight(age, gender);

        if (calculatedWeight >= 0) {
            System.out.println("Calculated weight for a " + age + "-year-old " + gender + ": " + calculatedWeight + " kg");
        } else {
            System.out.println("Error calculating weight");
        }
    }
}

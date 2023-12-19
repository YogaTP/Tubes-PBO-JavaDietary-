package JavaDietary;

public interface DietaryCalculations {
    double calculateBMI(double height, double weight);
    String getStatusBMI(double bmi, String gender, int usia);
}
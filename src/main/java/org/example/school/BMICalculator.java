package org.example.school;

//Zaimplementuj kalkulator indeksu masy ciała (BMI), który przyjmuje wagę
//i wzrost osoby i zwraca ich BMI.
//Napisz testy, aby zweryfikować poprawność obliczeń BMI.



public class BMICalculator {
    public double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight must be greater than 0");
        }
        return weight / Math.pow(height, 2);
    }

    public String classifyBMI(double bmi) {
        if (bmi <= 0) return "Invalid BMI";
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obesity";
    }
}

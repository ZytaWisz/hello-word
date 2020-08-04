package interfejsy;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calcObject = new Calculator();
        Computation computation;

        if (calcObject.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

      // double argument1 = calcObject.getArgument();
     //   double argument2 = calcObject.getArgument();
        Double argument1 = null;
        Double argument2 = null;

        try {
            double result = computation.compute(argument1, argument2);
            System.out.println("Wynik: " + result);
        }
        catch (NullPointerException e) {
            System.out.println("Chyba cos nie bangla");
        }
        //throw new RuntimeException();
    }

    private boolean shouldMultiply() {
        System.out.println("a-mnożysz,b-dodajesz");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.equals("a")){
            return true;
        }
        if (s.equals("b")){
            return false;
        }
        return false; // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        Scanner in = new Scanner(System.in);
        double s = in.nextDouble();

        return s; // tutaj pobierz liczbę od użytkownika
    }
}


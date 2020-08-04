package tablice;

import java.util.Scanner;

public class Temperatury {
    public static void main(String[] args) {
        double[] pogodynka =new double[7];
        Scanner inputScanner = new Scanner(System.in);

        for (int dzientygodnia=0; dzientygodnia<pogodynka.length;dzientygodnia++){
            pogodynka[dzientygodnia]=inputScanner.nextDouble();
        }
double suma=0;
        for (double stopnie:pogodynka){
            suma=suma+stopnie;

        }
        double srednia=suma/pogodynka.length;
        System.out.println(srednia);
    }
}

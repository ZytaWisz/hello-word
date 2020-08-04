package petle;

public class Petle {
    public static void main(String[] args) {
        //petlaWhile();
        //nieparzyste();
        nieparzyste2();
    }

    private static void nieparzyste(){
        for (int number=-10; number<=40; number++ ){
           if (number%2!=0) System.out.println(number);
        }
    }
    private static void nieparzyste2(){
        int number=-10;
        while (number<=40){
            if (number%2!=0) System.out.println(number);
            number++;
        }
    }
    private static void petlaWhile() {
        int number = 10;
        while (number <= 20) {
            System.out.println(number);
            number++;
        }
    }
}



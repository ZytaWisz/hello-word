package tablice;

public class DniTygodnia {
    public static void main(String[] args) {
//        String[] daysOfWeek = new String[7];
//        daysOfWeek[0] = "poniedziałek";
//        daysOfWeek[1] = "wtorek";
//        daysOfWeek[2] = "środa";
//        daysOfWeek[3] = "czwartek";
//        daysOfWeek[4] = "piątek";
//        daysOfWeek[5] = "sobota";
//        daysOfWeek[6] = "niedziela";
//        DniTygodnia cycki = new DniTygodnia();
//        System.out.println(cycki.dupa(new int[]{2, 2}));
//        System.out.println(cycki.dzialanie(new int[]{20, 3, 4}));
       // System.out.println(dodawacz(new int[]{0,1,2,3}));
        System.out.println(dodawacz2(new int[][]{{1,2},{4,7}}));

    }


    int dupa(int[] dupa2) {
        return dupa2[0] + dupa2[1];

    }

    int dzialanie(int[] tablica) {
        int najwieksza;
        if (tablica[0] > tablica[1]) najwieksza = tablica[0];
        else najwieksza = tablica[1];

        if (najwieksza > tablica[2]) najwieksza = tablica[0];
        else najwieksza = tablica[2];

        return najwieksza;
    }

    public int biggest(int[] numbers) {
        int biggest = numbers[0];
        if (numbers[1] > biggest) {
            biggest = numbers[1];
        }
        if (numbers[2] > biggest) {
            biggest = numbers[2];
        }
        return biggest;
    }

    public static int dodawacz(int[] tablicazytolindy) {
        int suma = 0;
        for (int dupa : tablicazytolindy) {
            suma = suma + dupa;
        }
        return suma;
    }
    public static int dodawacz2(int[][] tablicazytolindy2) {
        int suma = 0;
        for (int[]wiersz:tablicazytolindy2){
            for (int dupa : wiersz) {
                suma = suma + dupa;
            }
        }

        return suma;
    }
}


package nauka;

import javax.swing.*;

public class Podstawy {
    public static void main(String[] args) {
        int lukasz=10;
        double war=2.5;
        double dzialanie= lukasz*war;
        int korekt=(int) dzialanie;

        System.out.println(" JEGO DŁUGOŚĆ TO "+dzialanie);
        System.out.println(korekt);
        char litera='a';
        System.out.println(litera);
        String alfabet = String.valueOf(litera);
        System.out.println(litera+alfabet);
        double minus = korekt-dzialanie;
        System.out.println(minus);
        System.out.println(lukasz*dzialanie);
        String name="łukasz";
        String cecha="spaniały";
        System.out.println(name+" jest "+cecha);
        cecha="boski";
        System.out.println(name+" jest "+cecha);
        System.out.println(cecha+" jest fajna");
        System.out.println("Zyta jest git ;)");


    }

}

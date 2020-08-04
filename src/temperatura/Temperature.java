package temperatura;

public class Temperature {
    public static void main(String[] args) {
        Temperature temperature=new Temperature();
        System.out.println(temperature.isPositive(1));
        System.out.println(temperature.isPositive(-2));

        System.out.println(Temperature.isPositive1(4));

    }
    public static String isPositive1(int temperature){
        if (temperature>0)
        {
            return "dodatnia";
        }
        return "inna";
    }
    public String isPositive(int temperature){
        if (temperature>0)
        {
            return "dodatnia";
        }
        return "inna";
    }
}

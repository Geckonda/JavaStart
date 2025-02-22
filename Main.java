import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите количество минут:");
       int n = in.nextInt();
       System.out.println("Количество стали равно " + howManySteel(n));

       
       System.out.println("Введите количество стали:");
       n = in.nextInt();
       System.out.println("Количество минут равно " + howManyMinutes(n));

    }

    public static int howManySteel(int minutes)
    {
        if(minutes <= 45)
        {
            return minutes / 5 << 1;
        }
        else if(minutes > 45 && minutes <= 90)
        {
            return (9 << 1) + ((minutes - 45) / 5 * 3);
        }
        else
        {
            return ((9 << 1) + (9 * 3)) + ((minutes - 90) / 5 << 2);
        }
    }
    
    public static int howManyMinutes(int n)
    {
        int steel = 0;
        int minutes = 0;

        while (steel < n) {
            minutes += 5;
            if(minutes <= 45)
                steel += 2;
            else if(minutes <= 90 )
                steel += 3;
            else
                steel += 4;
        }
        return minutes;
    }
}
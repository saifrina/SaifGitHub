package Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class learnJavaMath {
    public  void learnRandomize(){
        Random rand = new Random();
        //Generate random numbers in range from 0 to 999
        int rand_num1 = rand. nextInt(1000);
        int rand_num2 = rand.nextInt(1000);
        System.out.println("Random numbers: "+rand_num1);
        System.out.println("Random numbers:"+rand_num2);

        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();

        System.out.println("Random Decimals:" + rand_dub1);
        System.out.println("Random Decimals:" +rand_dub2);

        float float_flo1 = rand.nextFloat();
        float float_flo2 = rand.nextFloat();

        System.out.println("Random float:" +float_flo1);
        System.out.println("Random float:" +float_flo2);

    }
    public  void learnRound() {
        double num1 = 74.44;
        System.out.println(Math.round(num1));
    }
    public void learnMax(){
        System.out.println(Math.max(12,15));
        System.out.println(Math.max(12.123,12.456));
    }
    public void captureDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/DD HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}

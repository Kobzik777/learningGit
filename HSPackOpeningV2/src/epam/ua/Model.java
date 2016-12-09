package epam.ua;

import java.util.Random;

/**
 * Created by Кобзарь on 08/12/2016.
 */
public class Model {
    private int bluecount = 0;
    private int whitecount = 0;
    private int lilacount = 0;
    private int orangecount = 0;
    private double min = 1;
    private double max = 100;

    public void openPacks(int packCount) throws InterruptedException {
        for (int i = 0; i < packCount; i++) {
            Random rnd1 = new Random(System.currentTimeMillis());
            Thread.sleep(1000);
            double number1 = min - 1 + (23 - min) * rnd1.nextDouble();
            number1 = Math.round(number1 * 100.0) / 100.0;

            if (number1 <= 1)
                orangecount++;
            if (number1 > 1 && number1 <= 4)
                lilacount++;
            if (number1 > 4 && number1 <= 22)
                bluecount++;
            System.out.println(number1);
            for (int j = 0; j < 4; j++) {
                Random rnd = new Random(System.currentTimeMillis());
                Thread.sleep(1000);

                double number = min - 1 + (max - min) * rnd.nextDouble();
                number = Math.round(number * 100.0) / 100.0;

                if (number <= 0.8)
                    orangecount++;
                if (number > 0.8 && number <= 3)
                    lilacount++;
                if (number > 3 && number <= 15)
                    bluecount++;
                if (number > 15)
                    whitecount++;
    //            System.out.println(number);
            }
        }
    }

    public int getBluecount() {
        return bluecount;
    }

    public int getWhitecount() {
        return whitecount;
    }

    public int getLilacount() {
        return lilacount;
    }

    public int getOrangecount() {
        return orangecount;
    }
}

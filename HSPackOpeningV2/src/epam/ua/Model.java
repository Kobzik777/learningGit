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
    private int min = 1;
    private int max = 100;

    public void openPacks(int packCount) throws InterruptedException {
        for (int i = 0; i < packCount; i++) {
            Random rnd1 = new Random(System.currentTimeMillis());
            Thread.sleep(10);
            int number1 = min  + rnd1.nextInt(27 - min + 1);
            if (number1 <= 1)
                orangecount++;
            if (number1 > 1 && number1 <= 5)
                lilacount++;
            if (number1 > 5 && number1 <= 27)
                bluecount++;
            System.out.println(number1);
            for (int j = 0; j < 4; j++) {
                Random rnd = new Random(System.currentTimeMillis());
                Thread.sleep(10);
                int number = min + rnd.nextInt(max - min + 1);
                if (number <= 1)
                    orangecount++;
                if (number > 1 && number <= 3)
                    lilacount++;
                if (number > 3 && number <= 20)
                    bluecount++;
                if (number > 20)
                    whitecount++;
               System.out.println(number);
            }
        }
    }

    /* Lets make some changes
    First cherryb commit
    2ns cherryb commit
    3rd cherryb commit
    4th cherryb commit
    */


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

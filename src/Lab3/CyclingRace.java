package Lab3;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogManager;

public class CyclingRace {

    private static final Logger LOGGER = Logger.getLogger(CyclingRace.class.getName());

    public CyclingRace(){
    }

    static void threadMessage(String message) {
        String threadName =
                Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                threadName,
                message);
    }

    private static class Cyclist implements Runnable {
        private int distanceTravelled = 0;
        private int time = 0;
        private String name = "";

        private static int place = 1;

        Cyclist(String cyclistName) {
            name = cyclistName;
        }

        public void run() {
            try {
                //gate.await();
                while (distanceTravelled < 3250) {
                    // Pause for 4 seconds
                    Thread.sleep(1000);
                    distanceTravelled += this.ride();
                    time += 25;
                    // Print a message
                    if (distanceTravelled < 3250) {
                        threadMessage(name + " przejechał " + distanceTravelled + " meterów");
                        LOGGER.log(Level.INFO, (name + " przejechał " + distanceTravelled + " meterów"));
                    } else {
                        threadMessage(name + " dojechał na miejscu " + place + " w czasie " + time + "sekund");
                        LOGGER.log(Level.INFO, (name + " dojechał na miejscu " + place + " w czasie " + time + "sekund"));
                        place++;
                    }
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }

        private int ride() {
            Random rand = new Random();
            int upperBound = 13 * 25;
            int lowerBound = 11 * 25;
            return rand.nextInt(upperBound - lowerBound) + lowerBound;
        }

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean append = true;
        FileHandler handler = new FileHandler("default.log", append);
        LOGGER.info("Logger Name: "+LOGGER.getName());
        LOGGER.addHandler(handler);
        pliczek plik = new pliczek();
        Cyclist cyclist[] = new Cyclist[15];

        for (int i = 0; i < 15; i++) {
            cyclist[i] = new Cyclist(plik.nazwosko().get(0));
        }

        Thread[] threads = new Thread[cyclist.length];
        for (int i = 0; i < cyclist.length; i++) {
            threads[i] = new Thread(cyclist[i]);
            threads[i].start();
        }
        for (int i = 0; i < cyclist.length; i++) {
            while (threads[i].isAlive()) {
                threads[i].join(1000);
            }
        }
    }
}


package Lab4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Sortowanie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\jwisn\\Desktop\\ZPO\\src\\Lab4\\pracownicy.txt"));
        ArrayList<Worker> workerRecords = new ArrayList<Worker>();

        String currentLine = reader.readLine();

        while (currentLine != null) {
            String[] workerDetail = currentLine.split(" ");

            String name = workerDetail[0];
            String surname = workerDetail[1];
            String nation = workerDetail[2];
            int salary = Integer.valueOf(workerDetail[3]);

            workerRecords.add(new Worker(name, surname, nation, salary));

            currentLine = reader.readLine();
        }

        Collections.sort(workerRecords, new compareSalary());

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\jwisn\\Desktop\\ZPO\\src\\Lab4\\output.txt"));

        for (Worker worker : workerRecords) {
            writer.write(worker.name);
            writer.write(" " + worker.surname);
            writer.write(" " + worker.nation);
            writer.write(" " + worker.salary);
            writer.newLine();
        }

        reader.close();

        writer.close();

//        BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\jwisn\\Desktop\\ZPO\\src\\Lab4\\output.txt"));
//
//        String currentLine2 = reader2.readLine();
//        int counter = 0;
//
//        while (currentLine2 != null && counter < 2 ) {
//            String[] workerDetail = currentLine2.split(" ");
//
//            String name = workerDetail[0];
//            String surname = workerDetail[1];
//            if (workerDetail[1] == "PL") {
//                counter ++;
//            }
//            String nation = workerDetail[2];
//            int salary = Integer.valueOf(workerDetail[3]);
//
//            workerRecords.add(new Worker(name, surname, nation, salary));
//
//            currentLine2 = reader2.readLine();
//        }
//        System.out.println(workerRecords);
//
//        reader2.close();
    }
}

package Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class pliczek {

    public List<String> nazwosko() throws IOException {
        ArrayList<String> nazwiskaLista = new ArrayList<String>();

        URL nazwiska = new URL("http://szgrabowski.kis.p.lodz.pl/zpo18/nazwiska.txt");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(nazwiska.openStream()));
        List<String> zawodnik;
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            nazwiskaLista.add(inputLine);
        in.close();
        zawodnik = getRandomElement(nazwiskaLista, 15);
        return zawodnik;
    }

    public List<String> getRandomElement(List<String> nazwiskaLista, int totalItems) {
        Random rand = new Random();

        List<String> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {

            int randomIndex = rand.nextInt(nazwiskaLista.size());

            newList.add(nazwiskaLista.get(randomIndex));
        }
        return newList;
    }

}


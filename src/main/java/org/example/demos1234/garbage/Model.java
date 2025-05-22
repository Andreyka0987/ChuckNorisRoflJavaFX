package org.example.demos1234.garbage;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Random;

public class Model implements IModel{

    Map<Integer, String> map = Map.of(
            1,"https://24tv.ua/resources/photos/news/202503/2772411_17206222.jpg?v=1741630378000",
            2,"https://24tv.ua/resources/photos/news/202503/2772411_17206223.jpg?v=1741630378000",
            3,"https://24tv.ua/resources/photos/news/202503/2772411_17206226.jpg?v=1741630378000",
            4,"https://24tv.ua/resources/photos/news/202503/2772411_17206252.jpg?v=1741631936000",
            5,"https://24tv.ua/resources/photos/news/202503/2772411_17206257.jpg?v=1741631936000"
    );

    @Override
    public String getRandomChuckJoke() {
        String apiUrl = "https://api.chucknorris.io/jokes/random";
        String jsonTemp = "";
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            in.close();
            JSONObject json1 = new JSONObject(response.toString());
            int a = getRandom();
            if (a % 2 == 0){
                jsonTemp = json1.getString("value");
            }
            return jsonTemp;
        } catch (Exception e) {
            e.printStackTrace();
            return "Помилка отримання жарту.";
        }
    }

    @Override
    public String getRandomChuckPic() {
        Random random = new Random();
        int b = random.nextInt(4)+1;
        int a = getRandom();
        String rezult;
        System.out.println(b);
        System.out.println(a);
        if (a % 2 !=0){
            rezult = map.get(b);
        }
        else {
            rezult = "https://upload.wikimedia.org/wikipedia/ru/9/99/%D0%91%D0%B5%D0%BB%D1%8B%D0%B9_%D0%BA%D0%B2%D0%B0%D0%B4%D1%80%D0%B0%D1%82.jpg?20171224123329";
        }
        return rezult;
    }

    @Override
    public void sentMessage(String text) {
    }


    int a;
    public int getRandom(){
        Random random = new Random();
        a = random.nextInt(5);
        return a;
    }

}



/**
 * @author Makarenko Viktoria
 * @version 01/11/2022
 */
package lesson6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;
import java.util.Objects;

public class Weather {
    public static void main(String[] args) {

        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()

                .url("https://dataservice.accuweather.com/forecasts/v1/daily/5day/TlrvijfetHugETpqrvdmWpyYSU2A3Vfc")
                .build();

        try {

            Response response = okHttpClient.newCall(request).execute();

            System.out.println(Objects.requireNonNull(response.body()).string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
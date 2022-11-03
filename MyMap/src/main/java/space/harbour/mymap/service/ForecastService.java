package space.harbour.mymap.service;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import space.harbour.mymap.domain.Forecast;
import space.harbour.mymap.util.Constants;

import java.io.IOException;
import java.util.List;

public class ForecastService {

    private ForecastApiService api;

    public ForecastService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public List<Forecast> getLocationForecast(String latitude, String longitude) {
        Call<List<Forecast>> forecastsCall = api.getLocationForecast();
        try {
            Response<List<Forecast>> response = forecastsCall.execute();
            return response.body();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return null;
    }
}

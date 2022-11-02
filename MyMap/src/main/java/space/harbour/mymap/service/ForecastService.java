package space.harbour.mymap.service;

import space.harbour.mymap.domain.Forecast;
import space.harbour.mymap.util.Constants;

public class ForecastService {

    private ForecastApiService api;

    public ForecastService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public List<Forecast> get
}

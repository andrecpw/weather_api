package space.harbour.mymap.service;

//https://api.open-meteo.com/v1/forecast?latitude=40.4167&longitude=-3.7033&hourly=temperature_2m,precipitation,windspeed_10m,winddirection_10m,windgusts_10m&windspeed_unit=kn&timeformat=unixtime

import space.harbour.mymap.domain.Forecast;

import java.util.List;

public interface ForecastApiService {

    @GET("v1/forecast?latitude={latitude}&longitude={longitude}&hourly=temperature_2m,precipitation,windspeed_10m,winddirection_10m,windgusts_10m&windspeed_unit=kn&timeformat=unixtime")
    Call<List<Forecast>> getLocation(@Path("latitude", "longitude") String latitude, String longitude);
    //TODO fix path call with 2 variables

}

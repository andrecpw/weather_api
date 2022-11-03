package space.harbour.mymap.task;

import javafx.concurrent.Task;
import space.harbour.mymap.domain.Forecast;
import space.harbour.mymap.service.ForecastService;

import java.util.List;

public class DataTask extends Task<List<Forecast>> {
    private String latitude;
    private String longitude;

    public DataTask() {}

    public DataTask(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    protected List<Forecast> call() throws Exception {
        ForecastService forecastService = new ForecastService();
        if ((latitude != null) && (longitude != null)) {
            return forecastService.getLocationForecast(latitude, longitude);
        }
    }

}

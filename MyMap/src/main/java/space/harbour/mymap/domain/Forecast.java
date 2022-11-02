package space.harbour.mymap.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Forecast {
    private Hourly hourly;
    private List<double> precipitation;
    private List<double> windspeed_10m;
    private List<int> winddirection_10m;
    private List<double> windgusts_10m;



}

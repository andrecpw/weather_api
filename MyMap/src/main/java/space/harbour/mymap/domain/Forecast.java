package space.harbour.mymap.domain;

import lombok.Data;
import lombok.ToString;
import space.harbour.mymap.util.DateUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@ToString
public class Forecast {
    private Hourly hourly;
    private List<Double> precipitation;
    private List<Double> windspeed_10m;
    private List<Integer> winddirection_10m;
    private List<Double> windgusts_10m;

    public List<LocalDateTime> getHourly() {
        List<Long> timestampList = hourly.getTime();
        List<LocalDateTime> hourlyList = timestampList.stream()
                .map(DateUtils::getDateTimeFromTimestamp)
                .collect(Collectors.toList());
        return hourlyList;
    }

}

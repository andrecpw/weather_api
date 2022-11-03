package space.harbour.mymap.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Hourly {

    private List<Long> time;
}

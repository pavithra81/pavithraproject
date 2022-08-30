package com.projectbypp.tarinmanagementms.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Route {
    @Id
    private int routeId;
    private String stationName;
    private String timeOfArrival;
    private String timeOfDeparture;
    private double totalDistance;
}


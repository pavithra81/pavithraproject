package com.projectbypp.tarinmanagementms.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "TrainData")
public class trainModel {
    @Id
    private int trainId;
    private String trainName;
    private String source;
    private String destination;
    private double pricePerKms;
    private List<Route> route;
    private String[] daysOfRunning;
    private int totalNumOfSeats;
    private List<TrainClass> trainClasses;


}

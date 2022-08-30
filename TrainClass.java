package com.projectbypp.tarinmanagementms.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrainClass {
   private String className;
   private double price;
   private int numOfSeats;

}

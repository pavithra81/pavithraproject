package com.projectbypp.tarinmanagementms.service;

import com.projectbypp.tarinmanagementms.model.trainModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrainService {
    public trainModel saveTrain(trainModel TrainModel);
    public List<trainModel> getTrains();
    public void deleteTrain(int trainId);
    public trainModel updateTrain(int trainId,trainModel TrainModel);
}

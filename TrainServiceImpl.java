package com.projectbypp.tarinmanagementms.service;

import com.projectbypp.tarinmanagementms.model.trainModel;
import com.projectbypp.tarinmanagementms.repository.trainrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private trainrepository TrainRepository;
    @Override
    public trainModel saveTrain(trainModel TrainModel) {
        return TrainRepository.save(TrainModel);
    }
    @Override
    public List<trainModel>getTrains()
    {
        return TrainRepository.findAll();
    }
    @Override
    public void deleteTrain(int trainId)
    {
        TrainRepository.deleteById(trainId);
    }

    @Override
    public trainModel updateTrain(int id, trainModel train) {
        Optional<trainModel> findById = TrainRepository.findById(id);
        if(findById.isPresent()){
            trainModel trainUpdate=findById.get();
            if(train.getTrainName()!=null && !train.getTrainName().isEmpty())
                trainUpdate.setTrainName(train.getTrainName());
            if(train.getSource()!=null && !train.getSource().isEmpty())
                trainUpdate.setSource(train.getSource());
            if(train.getDestination()!=null && !train.getDestination().isEmpty())
                trainUpdate.setDestination(train.getDestination());
            if(train.getPricePerKms()!=0)
                trainUpdate.setPricePerKms(train.getPricePerKms());
            if(train.getDaysOfRunning()!=null)
                trainUpdate.setDaysOfRunning(train.getDaysOfRunning());
            if(train.getTotalNumOfSeats()!=0)
                trainUpdate.setTotalNumOfSeats(train.getTotalNumOfSeats());
            if(train.getTrainClasses()!=null)
                trainUpdate.setTrainClasses(train.getTrainClasses());
            if(train.getRoute()!=null)
                trainUpdate.setRoute(train.getRoute());
            return TrainRepository.save(trainUpdate);
        }
        return null;
    }
}

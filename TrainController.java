package com.projectbypp.tarinmanagementms.controller;


import com.projectbypp.tarinmanagementms.model.trainModel;
import com.projectbypp.tarinmanagementms.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {
    @Autowired
     TrainService trainService;

    @PostMapping("/save")
    public trainModel saveTrain(@RequestBody trainModel TrainModel){
     return trainService.saveTrain(TrainModel);
    }

    @GetMapping("/list")
    public List<trainModel> getTrains()
    {
        return trainService.getTrains();
    }


    @PutMapping("/update/{trainId}")
    public trainModel updateTrain(@RequestBody trainModel TrainModel,@PathVariable("trainId")int trainId)
    {return  trainService.updateTrain(trainId,TrainModel);
    }


    @DeleteMapping("/delete/{trainId}")

    public String deleteTrain(@PathVariable("trainId")int trainId)
    {
        trainService.deleteTrain(trainId);
        return "delete successfully";
    }


}

package com.f1.f1list.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.f1.f1list.models.ResultRaceModel;
import com.f1.f1list.repositories.IResultRace;

@Service
public class ResultRaceService {
  
    public IResultRace resultRace;
    @Autowired
    public ResultRaceService(IResultRace resultRace){
        this.resultRace = resultRace;
    }

    public List<ResultRaceModel> getResults(){
        System.out.println(resultRace.findAll());
        return resultRace.findAll();
    }
}

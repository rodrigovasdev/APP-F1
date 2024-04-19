package com.f1.f1list.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.f1.f1list.models.ResultRaceModel;
import com.f1.f1list.services.ResultRaceService;


@RestController
@RequestMapping("/api/results")
public class ResultRaceController {

   public ResultRaceService results;

   @Autowired
   public ResultRaceController(ResultRaceService resultados){
    this.results = resultados;
   }

   @GetMapping
   public List<ResultRaceModel> getResults(){
    return results.getResults();
   }

}

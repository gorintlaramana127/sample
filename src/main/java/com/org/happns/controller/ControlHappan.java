package com.org.happns.controller;

import com.org.happns.model.HappenModel;
import com.org.happns.repositary.HappensRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/happens")
public class ControlHappan {

    @Autowired
    private HappensRepositary happensRepositary;

    @PostMapping("/createhpns")
    public void createhp(@RequestBody HappenModel happenModel)
    {
        happensRepositary.save(happenModel);
    }
    @GetMapping("Retreve")
    public List<HappenModel> happenDetails() {
        List<HappenModel> all = happensRepositary.findAll();
        return all;
    }
    @PutMapping("/update")
    public void updateHappenRecord(@RequestBody HappenModel happenModel)
    {
        happensRepositary.save(happenModel);
    }
    @DeleteMapping
    public void deleteById(@PathVariable("happenId")int happenId)

    {
        this.happensRepositary.deleteById(happenId);
    }
}

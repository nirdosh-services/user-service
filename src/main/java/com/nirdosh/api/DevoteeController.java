package com.nirdosh.api;

import com.nirdosh.domain.model.devotee.Devotee;
import com.nirdosh.infrastructure.persistence.DevoteeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DevoteeController {

    @Autowired
    private DevoteeRepo devoteeRepo;

    @RequestMapping("/devotee/{id}")
    @ResponseBody
    public Devotee getDevotee(@PathVariable String id) {
        return devoteeRepo.findOne(id);
    }

    @RequestMapping(name = "/devotee", method = RequestMethod.POST)
    public void addDevotee() {
        devoteeRepo.save(new Devotee());
    }

    @RequestMapping("/devotee")
    public List<Devotee> getAllDevotee() {
        return devoteeRepo.findAll();
    }

    @RequestMapping(value = "/devotee", method = RequestMethod.DELETE)
    public void deleteDevotee(@PathVariable String id){
        devoteeRepo.delete(id);
    }
}

package com.nirdosh.application;

import com.nirdosh.domain.model.devotee.Devotee;
import com.nirdosh.infrastructure.persistence.DevoteeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DevoteeController {

    @Autowired
    private DevoteeRepo devoteeRepo;

    @RequestMapping("/devotee/id")
    @ResponseBody
    public Devotee getDevotee() {
        return new Devotee("nirdosh");
    }

    @RequestMapping(name = "/devotee", method = RequestMethod.POST)
    public void addDevotee() {
        devoteeRepo.save(new Devotee("nirdosh"));
    }

    @RequestMapping("/devotee")
    public List<Devotee> getAllDevotee() {
        return devoteeRepo.findAll();
    }
}

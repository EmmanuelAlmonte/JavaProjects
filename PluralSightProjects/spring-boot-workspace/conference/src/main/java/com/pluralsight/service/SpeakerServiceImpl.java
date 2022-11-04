package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRespositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRespositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();

    }
}

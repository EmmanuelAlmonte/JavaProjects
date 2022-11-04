package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRespositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImple no Args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImple repository constructor");
        this.repository = speakerRepository;
    }



    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImple setter");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();

    }
}

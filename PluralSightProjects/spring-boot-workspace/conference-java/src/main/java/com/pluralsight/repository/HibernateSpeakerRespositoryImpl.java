package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Speaker;

@Repository("speakerRepository")
public class HibernateSpeakerRespositoryImpl implements SpeakerRepository {
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<Speaker>();

    Speaker speaker = new Speaker();

    speaker.setFirstName("Bryan");
    speaker.setLastName("Hansen");

    speakers.add(speaker);

    return speakers;
  }
}

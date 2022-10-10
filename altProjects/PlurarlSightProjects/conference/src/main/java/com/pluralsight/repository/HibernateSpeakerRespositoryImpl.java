package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRespositoryImpl {
  public List<Speaker> findAll() {
    List<Speaker> speakers = new ArrayList<Speaker>();

    Speaker speaker = new Speaker();

    speaker.getFirstName("Bryan");
    speaker.setLastName("Hansen");

    speakers.add(speaker);

    return speakers;
  }
}

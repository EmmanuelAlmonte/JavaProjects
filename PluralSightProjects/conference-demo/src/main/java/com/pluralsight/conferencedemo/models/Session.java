package com.pluralsight.conferencedemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "sessions")
public class Session {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long session_id;
  private Long session_name;
  private Long session_description;
  private Long session_length;

  public Long getSession_id() {
    return session_id;
  }

  public void setSession_id(Long session_id) {
    this.session_id = session_id;
  }

  public Long getSession_name() {
    return session_name;
  }

  public void setSession_name(Long session_name) {
    this.session_name = session_name;
  }

  public Long getSession_description() {
    return session_description;
  }

  public void setSession_description(Long session_description) {
    this.session_description = session_description;
  }

  public Long getSession_length() {
    return session_length;
  }

  public void setSession_length(Long session_length) {
    this.session_length = session_length;
  }

  public Session() {

  }
}

package se.joud.meetingsum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Meeting {
    @Id @GeneratedValue
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDate date;
    private String title;

    public Meeting(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public Long getId(){
        return id;
    }
}

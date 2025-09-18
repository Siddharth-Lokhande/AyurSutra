package com.ayursutra.panchakarma.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {
    @Id
    private int AptId;
    private String AptName;
    private int price;
    private boolean istherapy;
    private boolean isonline;
    private int duration;
    private int days;
    private String time;
    private String description;

    public Appointment() {
    }

    public Appointment(int aptId, String aptName, int price, boolean istherapy, boolean isonline, int duration, int days, String time, String description) {
        this.AptId = aptId;
        this.AptName = aptName;
        this.price = price;
        this.istherapy = istherapy;
        this.isonline = isonline;
        this.duration = duration;
        this.days = days;
        this.time = time;
        this.description = description;
    }

    public int getAptId() {
        return AptId;
    }

    public void setAptId(int aptId) {
        AptId = aptId;
    }

    public String getAptName() {
        return AptName;
    }

    public void setAptName(String aptName) {
        AptName = aptName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIstherapy() {
        return istherapy;
    }

    public void setIstherapy(boolean istherapy) {
        this.istherapy = istherapy;
    }

    public boolean isIsonline() {
        return isonline;
    }

    public void setIsonline(boolean isonline) {
        this.isonline = isonline;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "AptId=" + AptId +
                ", AptName='" + AptName + '\'' +
                ", price=" + price +
                ", istherapy=" + istherapy +
                ", isonline=" + isonline +
                ", duration=" + duration +
                ", days=" + days +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
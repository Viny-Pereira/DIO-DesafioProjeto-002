package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{title=" + getTitle() + ", description=" + getDescription() + ", date=" + date + "}";
    }

    @Override
    public double calculate() {
        return XP_DEFAULT + 20d;
    }
}

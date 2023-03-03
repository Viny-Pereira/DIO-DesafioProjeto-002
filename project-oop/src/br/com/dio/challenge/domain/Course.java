package br.com.dio.challenge.domain;

public class Course extends Content {
    private int courseLoad;

    public Course() {

    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return "{title=" + getTitle() + ", description=" + getDescription() + ", courseLoad=" + courseLoad + "}";
    }

    @Override
    public double calculate() {
        return XP_DEFAULT * courseLoad;
    }
}

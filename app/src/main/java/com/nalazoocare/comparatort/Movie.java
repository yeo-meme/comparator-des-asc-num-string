package com.nalazoocare.comparatort;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-03-30
 */
public class Movie implements Comparable<Movie> {
    private String title;
    private String category;
    private String grade;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Movie(String title, String category, String grade) {
        this.title = title;
        this.category = category;
        this.grade = grade;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.title.compareTo(movie.title);
    }
}

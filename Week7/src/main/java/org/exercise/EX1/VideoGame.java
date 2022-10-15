package org.exercise.EX1;

public class VideoGame {
    private String title;
    private String genre;
    private Integer publishedYear;
    private Long unitSold;

    public VideoGame(String title, String genre, Integer publishedYear, Long unitSold) {
        this.title = title;
        this.genre = genre;
        this.publishedYear = publishedYear;
        this.unitSold = unitSold;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public Long getUnitSold() {
        return unitSold;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setUnitSold(Long unitSold) {
        this.unitSold = unitSold;
    }

    @Override
    public String toString() {
        return "ComputerGame{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", publishedYear=" + publishedYear +
                ", unitSold=" + unitSold +
                '}';
    }
}

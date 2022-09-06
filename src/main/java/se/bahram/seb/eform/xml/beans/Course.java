package se.bahram.seb.eform.xml.beans;

public class Course {

    private String title;

    private int level;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", level=" + level +
                '}';
    }
}

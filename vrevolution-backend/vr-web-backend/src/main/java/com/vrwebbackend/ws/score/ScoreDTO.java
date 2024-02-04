package com.vrwebbackend.ws.score;

public class ScoreDTO
{
    private String grade;

    private String testNumber;

    private Integer score;

    public ScoreDTO(String grade, String testNumber, Integer score)
    {
        this.grade = grade;
        this.testNumber = testNumber;
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

package com.example.thiti.ict_88510159;
import android.os.Parcel;
import android.os.Parcelable;

public class Question implements Parcelable {
    public static final String DIFFICULTY_lesson1= "Lesson1";
    public static final String DIFFICULTY_Lesson2 = "Lesson2";
    public static final String DIFFICULTY_Lesson3 = "Lesson3";
    public static final String DIFFICULTY_Lesson4 = "Lesson4";
    public static final String DIFFICULTY_Lesson5 = "Lesson5";
    public static final String DIFFICULTY_Lesson6 = "Lesson6";
    public static final String DIFFICULTY_Lesson7= "Lesson7";
    public static final String DIFFICULTY_Lesson8= "Lesson8";
    public static final String DIFFICULTY_Lesson9= "Lesson9";
    public static final String DIFFICULTY_Lesson10= "Lesson10";


    private String question;
    private String option1;
    private String option2;
    private int answerNr;
    private String difficulty;


    public Question(){

    }

    public Question(String question, String option1, String option2, int answerNr, String difficulty) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answerNr = answerNr;
        this.difficulty = difficulty;
    }

    protected Question(Parcel in) {
        question = in.readString();
        option1 = in.readString();
        option2 = in.readString();
        answerNr = in.readInt();
        difficulty = in.readString();

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(option1);
        dest.writeString(option2);
        dest.writeInt(answerNr);
        dest.writeString(difficulty);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }


    public int getAnswerNr() {
        return answerNr;
    }

    public void setAnswerNr(int answerNr) {
        this.answerNr = answerNr;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public static String[] getAllDifficultyLevels() {
        return new String[]{
                DIFFICULTY_lesson1,
                DIFFICULTY_Lesson2,
                DIFFICULTY_Lesson3,
                DIFFICULTY_Lesson4,
                DIFFICULTY_Lesson5,
                DIFFICULTY_Lesson6,
                DIFFICULTY_Lesson7,
                DIFFICULTY_Lesson8,
                DIFFICULTY_Lesson9,
                DIFFICULTY_Lesson10,
        };
    }




}
package com.londonappbrewery.quizzler.models;

public class TrueFalse {

    private int mQuestionID;
    private boolean mAnswerID;

    public TrueFalse(int questionID, boolean answerID) {
        mQuestionID = questionID;
        mAnswerID = answerID;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public boolean isAnswerID() {
        return mAnswerID;
    }
}
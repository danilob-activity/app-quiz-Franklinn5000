package com.londonappbrewery.quizzler.models;

import android.app.Application;
import android.test.ApplicationTestCase;


public class TrueFalse {

    private int mQuestionID;
    private boolean mAnswerID;

    public TrueFalse(int mQuestionID, boolean mAnswerID) {
        this.mQuestionID = mQuestionID;
        this.mAnswerID = mAnswerID;
    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean ismAnswerID() {
        return mAnswerID;
    }

    public void setmAnswerID(boolean mAnswerID) {
        this.mAnswerID = mAnswerID;
    }
}


    


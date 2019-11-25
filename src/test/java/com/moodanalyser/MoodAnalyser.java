package com.moodanalyser;

import org.junit.Test;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood(String message) {
        if (message .contains("Happy"))
            return "Happy";
        else
                return "SAD";
    }

    public String analyseMood() {
        try{
        if (this.message.contains("sad"))

            return "Happy";
        else
            return "SAD";
    }
        catch (NullPointerException e) {
            return "Happy";
        }
    }
}

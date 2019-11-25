package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMesage_WhenSad_ShouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMesage_WhenHappy_ShouldReturnSad()
    {
        MoodAnalyser AnalysedMood = new MoodAnalyser("happy");
        String mood = AnalysedMood.analyseMood("This is a Happy message");
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenNull_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }
}

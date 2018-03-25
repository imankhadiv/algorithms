package com.irast.algorithms.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReversionTest {

    StringReversion app;

    @Before
    public void setUp() throws Exception {
        app = new StringReversion();
    }

    @Test
    public void reverse() {
        String expected = "123456789";
        Assert.assertEquals(expected, app.reverse("987654321"));
    }

    @Test
    public void reverseOrderOfWords() {
        String input = "hello world!";
        String expected = "world! hello";

        Assert.assertEquals(expected, app.reverseOrderOfWords(input));
    }

    @Test
    public void reverseOrderOfWordsWhenThereIsWhiteSpaces() {
        String input = " hello world!  ";
        String expected = "  world! hello ";

        Assert.assertEquals(expected, app.reverseOrderOfWords(input));
    }


    @Test
    public void reverseOrderOfWordsWhenThereIsWhiteSpacesAtEnd() {
        String input = "hello world!  ";
        String expected = "  world! hello";

        Assert.assertEquals(expected, app.reverseOrderOfWords(input));
    }
    @Test
    public void reverseOrderOfWordsWhenThereIsWhiteSpacesAtEnd2() {
        String input = "ab";
        String expected = "ab";

        Assert.assertEquals(expected, app.reverseOrderOfWords(input));
    }
    @Test
    public void reverseOrderOfWordsWhenThereIsWhiteSpacesAtEnd3() {
        String input = "ab ";
        String expected = " ab";

        Assert.assertEquals(expected, app.reverseOrderOfWords(input));
    }
    @Test
    public void reverseOrderOfWordsWhenThereIsWhiteSpacesAtEnd4() {
        String input = " ab";
        String expected = "ab ";

        Assert.assertEquals(expected, app.reverseOrderOfWords(input));
    }
    @Test
    public void reverseOrderOfWordsWhenThereIsWhiteSpacesAtEnd5() {
        String input = "  ab";
        String expected = "ab  ";

        Assert.assertEquals(expected, app.reverseOrderOfWords(input));
    }

}
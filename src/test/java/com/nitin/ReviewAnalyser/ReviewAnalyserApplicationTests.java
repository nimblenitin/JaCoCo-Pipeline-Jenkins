package com.nitin.ReviewAnalyser;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTestclass ReviewAnalyserApplicationTests {
    private ReviewAnalyserApplication analyser = new ReviewAnalyserApplication();
    @Test public void testWordCount() {
        assertEquals(7, analyser.getWordCount("Train to win in the digital economy"));
    }
}

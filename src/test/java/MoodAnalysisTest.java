import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {
    MoodAnalysis moodAnalysis=new MoodAnalysis();
    @Test
    public void getMood_whenProper_returnHappy(){

        String result= moodAnalysis.moodAnalysisCompute("Happy");
        Assert.assertEquals("Happy",result);
    }

    @Test
    public void getMood_whenNotProper_returnSad(){
        String result= moodAnalysis.moodAnalysisCompute("Sad");
        Assert.assertEquals("Sad",result);
    }
}

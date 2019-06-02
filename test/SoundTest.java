
import Core.SoundEffect;
import java.io.File;
import org.junit.Before;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guydu
 */
public class SoundTest {
    
    private static String workingDir = System.getProperty("user.dir");
    
    private SoundEffect se;
    private ExampleListener lis;
    
    @Before
    public void setup(){
        File soundFile = new File(workingDir + "/lib/Music.au");
        se = new SoundEffect(soundFile);
        lis = new ExampleListener();
        se.setListener(lis);
        System.out.println("setup complete");
    }
    
    
    @Test
    public void listenerTest(){
        setup();
        assert lis!=null;
        assert lis.timesStarted == 0;
        se.start();
        assert lis.timesStarted == 1;
        
        assert lis.timesSetLooping == 0;
        se.setLooping(true);
        assert lis.timesSetLooping == 1;
        se.setLooping(false);
        assert lis.timesSetLooping== 2;
        
        assert lis.timesSetVolume == 0;
        se.setVolume(.5f);
        assert lis.timesSetVolume == 1;
        
        assert lis.timesPaused ==0;
        se.pause();
        assert lis.timesPaused == 1;
        
        assert lis.timesResumed == 0;
        se.resume();
        assert lis.timesResumed == 1;
        
        assert lis.timesRestarted == 0;
        se.restart();
        assert lis.timesRestarted == 1;
        
        assert lis.timesCopied==0;
        se.createCopy();
        assert lis.timesCopied==1;
        
        assert lis.timesDisabled == 0;
        se.disable();
        assert lis.timesDisabled == 1;
        
        
    }    
    
}

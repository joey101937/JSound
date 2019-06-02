
import Core.SoundEffect;
import Core.SoundEffectListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author guydu
 */
public class ExampleListener implements SoundEffectListener{
    
    public volatile Integer timesStarted=0, timesPaused=0, timesResumed=0, 
            timesSetLooping=0, timesDisabled=0, timesRestarted=0,
            timesSetVolume=0,timesEnded=0,timesCopied=0;
    
    @Override
    public void onStart() {
        timesStarted++;
    }

    @Override
    public void onPause() {
        timesPaused++;
    }

    @Override
    public void onResume() {
        timesResumed++;
    }

    @Override
    public void onSetLooping(boolean isLooping) {
        timesSetLooping++;
    }

    @Override
    public void onDisable() {
        timesDisabled++;
    }

    @Override
    public void onRestart() {
       timesRestarted++;
    }

    @Override
    public void onSetVolume(float percentage) {
        timesSetVolume++;
    }

    @Override
    public void onEnd() {
        timesEnded++;
    }

    @Override
    public void onCopy(SoundEffect copy) {
        timesCopied++;
    }
    
}

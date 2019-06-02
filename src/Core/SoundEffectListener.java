/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 * A class with this interface may be applied to a SoundEffect object using the 
 * setListener method in the SoundEffect class. This interface allows you to
 * detect happenings in the sound effect and respond to them if need be.
 * @author Joseph
 */
public interface SoundEffectListener {
    /**
     * runs when linked sound is started
     */
    public void onStart();
    /**
     * runs when linked sound is paused
     */
    public void onPause();
    /**
     * runs when linked sound is resumed
     */
    public void onResume();
    /**
     * runs when linked sound loop setting is set
     * @param isLooping new loop setting
     */
    public void onSetLooping(boolean isLooping);
    /**
     * runs when linked sound is manually disabled
     */
    public void onDisable();
    /**
     * runs when linked sound is restarted
     */
    public void onRestart();
    /**
     * runs when linked sound has its volume set
     * @param percentage percentage the volume was set to
     */
    public void onSetVolume(float percentage);
    /**
     * runs when linked sound comes to a natural end and is not looping
     */
    public void onEnd();
    
    /**
     * runs whenever a copy of the linked sound is generated
     * @param copy SoundEffect object created
     */
    public void onCopy(SoundEffect copy);
}

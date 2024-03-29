package Command.Music.command;

import Command.Music.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
     @Override
    public void play() {
        musicPlayer.playNextTrack();
    }

}

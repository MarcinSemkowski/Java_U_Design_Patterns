package Command.Music.command;

import Command.Music.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
     @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }

}
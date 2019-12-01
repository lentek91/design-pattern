package pl.lentek.domain.command;

import pl.lentek.domain.MusicPlayer;
import pl.lentek.domain.MusicPlayerCommand;

public class PlayRandomTrack implements MusicPlayerCommand {

  private MusicPlayer musicPlayer;

  public PlayRandomTrack(MusicPlayer musicPlayer) {
    this.musicPlayer = musicPlayer;
  }

  @Override
  public void play() {
    musicPlayer.playRandomTrack();
  }
}

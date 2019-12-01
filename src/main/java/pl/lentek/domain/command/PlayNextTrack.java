package pl.lentek.domain.command;

import pl.lentek.domain.MusicPlayer;
import pl.lentek.domain.MusicPlayerCommand;

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

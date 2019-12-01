package pl.lentek.domain.command;

import pl.lentek.domain.MusicPlayer;
import pl.lentek.domain.MusicPlayerCommand;

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

package pl.lentek.domain;

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

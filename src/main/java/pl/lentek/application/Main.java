package pl.lentek.application;

import pl.lentek.domain.MusicPlayer;
import pl.lentek.domain.MusicPlayerRemote;
import pl.lentek.domain.PlayFirstTrack;
import pl.lentek.domain.PlayNextTrack;
import pl.lentek.domain.PlayRandomTrack;

public class Main {

  public static void main(String[] args) {
    MusicPlayer musicPlayer = new MusicPlayer();
    MusicPlayerRemote remote = new MusicPlayerRemote();
    remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
    remote.pressButton();
    remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
    remote.pressButton();
    remote.pressButton();
    remote.pressButton();
    remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
    remote.pressButton();
    remote.pressButton();
  }
}

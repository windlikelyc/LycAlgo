package testDesignPattern.designRookie.Adapter;

public class Run {

  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("mp3","dadada");
    audioPlayer.play("mp4","hoho");
    audioPlayer.play("vlc","gagag");
    audioPlayer.play("avi","mu ra");
  }

}

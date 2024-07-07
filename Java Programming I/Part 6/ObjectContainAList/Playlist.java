import java.util.ArrayList;

public class Playlist {
  private ArrayList<String> songs;

  public Playlist() {
    this.songs = new ArrayList<>();
  }

  public void addSong(String song) {
    this.songs.add(song);
  }

  public void removeSing(String song) {
    this.songs.remove(song);
  }

  public void printSong() {
    for (String song: songs) {
      System.out.println(song);
    }
  }
}

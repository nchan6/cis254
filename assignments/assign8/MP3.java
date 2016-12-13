// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// mp3
// File Description
// Assignment #8
// 12/6/16
public class MP3
{
   //instance variables
   private String artist;
   private String song;
   private String album;
   private int trackLength;
   
   //constructor
   public MP3(String artis, String son, String albu, int trackLengt){
       artist = artis;
       song = son;
       album = albu;
       trackLength = trackLengt;
   }
   
   //setter
   public void setArtist(String artist1){
       artist = artist1;
   }
   
   //setter
   public void setSong(String song1){
       song = song1; 
   }
   
   //setter
   public void setAlbum(String album1){
       album = album1;
   }
   
   //setter
   public void setTrackLength(int trackLength1){
       if (trackLength1 <= 0){
           trackLength = 60;
        } else { 
            trackLength = trackLength1;
        }
   }
   
   //getter
   public String getArtist(){
       return artist;
   }
   
   //getter
   public String getSong(){
       return song;
   }
   
   //getter
   public String getAlbum(){
       return album;
   }
   
   //getter
   public int getTrackLength(){
       return trackLength;
   }
   
   //tostring
   public String toString(){
       int min = trackLength / 60;
       int sec = trackLength % 60;
       return String.format("%nartist: %s song: %s album: %s track length:%d:%d", artist, song, album, min, sec);
   }
   
}

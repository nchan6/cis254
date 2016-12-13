// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// mp3
// File Description
// Assignment #8
// 12/6/16

import java.util.ArrayList;

public class MP3Collection
{
    //instance variables
    private int count;
    private ArrayList<MP3> MP3Collection;
    
    public MP3Collection(){
        MP3Collection = new ArrayList<MP3>();
        count = 0;
    }
    
    //creates mp3 objects and places it in the mp3 collection
    public void addMP3(String MP3Artist, String MP3Song, String MP3Title, int MP3TrackLength){
        MP3 newMP3 = new MP3(MP3Artist, MP3Song, MP3Title, MP3TrackLength);
        
        //adds new array
        MP3Collection.add(newMP3);
        
        //indicates the number of songs
        count++;
    }
    
    //getter
    public int getCount(){
        return count;
    }
    
    //to string
    public String toString(){
        String line = "******************************************";
        String data = line +"\nMy MP3's\n " + line +"\n";
        for(MP3 newMP3: MP3Collection){
            data += newMP3.toString() + "\n";
        }
        return data;
    }
}

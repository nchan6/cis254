// norris chan
// norrischan@my.smccd.edu
// CIS 254 OL
// mp3
// File Description
// Assignment #8
// 12/6/16

import javax.swing.*;

public class MP3CollectionTest
{
    public static void main(String[] args){

        MP3Collection newCollection = new MP3Collection();
        
        //songs to send to mp3 class
        newCollection.addMP3("kanye west", "all falls down", "the college dropout", 223);
        newCollection.addMP3("justin timberlake", "cry me a river", "justified", 290);
        newCollection.addMP3("taylor swift", "shake it off", "1989",255);
        newCollection.addMP3("drake","hot line bling","view",295);
        newCollection.addMP3("one republic", "counting stars","native",283);
        
        //output
        JOptionPane.showMessageDialog(null,"Programmed by norris chan\n" + newCollection.toString() + "\nMP3 count: " + newCollection.getCount());
        
    }
}

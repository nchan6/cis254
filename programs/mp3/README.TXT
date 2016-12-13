UML class diagrams for the MP3 class and the MP3Collection class

Norris Chan

MP3 class
____________
-artist : String
-song : String
-album : String
-trackLength : int
____________
<<constructor>> MP3(artist : String, song : String, album : String, trackLength : int)
+ setArtist(artist1 : String)
+ setSong(song1 : String)
+ setAlbum( album1 : String)
+ setTrackLength(trackLength1 : int)
+ getArtist() :String
+ getSong() : String
+ getAlbum() : String
+ getTrackLength() : int
+ toString() : String



MP3Collection class
____________
-count : int
-MP3Collection : ArrayList<MP3>
____________
<<constructor>> addMP3(artist : String, song : String, album : String, trackLength : int)
+ getCount() : int
+ toString() : String
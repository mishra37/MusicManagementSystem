//import java.util.LinkedList;
//import java.util.NoSuchElementException;
//
//// --== CS400 File Header Information ==--
//// Name: Sneha Tripathi
//// Email: stripathi3@wisc.edu
//// Team: LB
//// Role: Back End Developer 1
//// TA: Divyanshu Saxena
//// Lecturer: Florian Heimerl
//// Notes to Grader:
///**
// * This class extends the function of HashTable for our application
// * @author sneha
// *
// */
//public class MusicFinder extends HashTableMap<Song, Song> {
//
//    /**
//     * Does matching by the song, uniquely identifies the song by its hashcode and
//     * then returns the song name if found
//     * 
//     * @param song - object passed by user
//     * @return Song object found by hash function get
//     */
//    public Song getSong(Song song) {
//        Song temp = null;
//        try {
//            temp = get(song);
//            return (temp);
//        } catch (NoSuchElementException e) {
//            throw new NoSuchElementException("The song entered is not available");
//        }
//    }
//
//    /**
//     * does matching by the artist name providing list of all songs produced by
//     * artist
//     * 
//     * @param artistName String entered by the user
//     * @return an array of song with same artist name
//     */
//    public Song[] getArtist(String artistName) {
//        LinkedList<Song> list = new LinkedList<Song>();
//        for (LinkedList<Node> subList : hashTable) {
//            if (subList != null) {
//                for (Node nd : subList) {
//                    Song temp = (Song) nd.getValue();
//                    if (temp.getSongArtist().equals(artistName)) {
//                        list.add(temp);
//                    }
//                }
//            }
//
//        }
//        Song[] toReturn = (Song[]) list.toArray();
//        return toReturn;
//    }
//
//}

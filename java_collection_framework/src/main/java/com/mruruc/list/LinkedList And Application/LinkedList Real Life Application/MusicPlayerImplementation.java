package Java_Collections;

import java.util.Scanner;

public class MusicPlayerImplementation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MusicPlayer musicPlayer = new MusicPlayer();

        System.out.println("Welcome to the Music Player!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add music");
            System.out.println("2. Add music to the beginning of the playlist");
            System.out.println("3. Add music to the end of the playlist");
            System.out.println("4. Search for a song");
            System.out.println("5. Remove first song from playlist");
            System.out.println("6. Remove last song from playlist");
            System.out.println("7. Play next song");
            System.out.println("8. Shuffle playlist");
            System.out.println("9. List songs in playlist");
            System.out.println("10. Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the artist name: ");
                    String artist = input.nextLine();

                    System.out.print("Enter the song name: ");
                    String song = input.nextLine();

                    System.out.print("Enter the duration of the song in seconds: ");
                    int duration = input.nextInt();
                    input.nextLine();

                    musicPlayer.addMusic(new MusicPlayer.Song(artist, song, duration));
                    System.out.println("The song has been added to the playlist");
                    break;
                case 2:
                    System.out.print("Enter the artist name: ");
                    artist = input.nextLine();

                    System.out.print("Enter the song name: ");
                    song = input.nextLine();

                    System.out.print("Enter the duration of the song in seconds: ");
                    duration = input.nextInt();
                    input.nextLine();

                    musicPlayer.addMusicToFirst(new MusicPlayer.Song(artist, song, duration));
                    System.out.println("The song has been added to the beginning of the playlist");
                    break;
                case 3:
                    System.out.print("Enter the artist name: ");
                    artist = input.nextLine();

                    System.out.print("Enter the song name: ");
                    song = input.nextLine();

                    System.out.print("Enter the duration of the song in seconds: ");
                    duration = input.nextInt();
                    input.nextLine();

                    musicPlayer.addMusicToLast(new MusicPlayer.Song(artist, song, duration));
                    System.out.println("The song has been added to the end of the playlist");
                    break;
                case 4:
                    System.out.print("Enter the song name: ");
                    song = input.nextLine();

                    try {
                        MusicPlayer.Song song1= musicPlayer.searchSong(song);

                        System.out.println(song1.getArtist()+"\n"+song1.getSong()+"\n"+song1.getDuration());
                        MusicPlayer.SongNotFoundException exception=new MusicPlayer.SongNotFoundException("No such song !");
                    }
                    catch(MusicPlayer.SongNotFoundException ee){
                        System.out.println(ee.getMessage());
                    }
                    break;

                case 5:
                    MusicPlayer.Song first=musicPlayer.removeFirst();
                    System.out.println("Your first song removed: "+first.getSong());
                    break;
                case 6:
                    MusicPlayer.Song lastSong=musicPlayer.removeLast();
                    System.out.println("Your last song removed: "+lastSong.getSong());
                    break;
                case 7:
                    MusicPlayer.Song songnext=musicPlayer.playNext();
                    System.out.println("Next song"+songnext.getSong());
                    break;
                case 8:
                    if(musicPlayer.shufflePlayList()){
                        System.out.println("Successful");
                    }
                    else {
                        System.out.println("Unsuccessful");
                    }
                    break;
                case 9:
                    System.out.println("Here is you play list: ");
                    musicPlayer.listOfSongs();
                    break;

                case 10:
                    System.out.println("Good bye :)");
                    input.close();
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid choice !");
                    exit=true;
            }
        }
    }
}
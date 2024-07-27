import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        MediaAdapter mediaAdapter = null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter audio type (mp3/mp4/vlc): ");
        String audioType = scanner.nextLine();

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        if (audioType.equalsIgnoreCase("mp3")) {
            audioPlayer.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

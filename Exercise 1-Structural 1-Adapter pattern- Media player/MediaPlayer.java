interface MediaPlayer {
    void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

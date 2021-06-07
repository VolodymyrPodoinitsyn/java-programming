package day24_loops;

public class YouTubeCatVideo {

    public static void main(String[] args) throws InterruptedException {

        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("Watching YouTube video \uD83D\uDC08 : second: - " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching Cat video, lets start another one");
    }

}

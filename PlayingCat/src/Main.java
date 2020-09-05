public class Main {
    public static void main(String[] args) {
        boolean getOutput;
        getOutput = PlayingCat.isCatPlaying(true,10);
        System.out.println(getOutput);
        getOutput = PlayingCat.isCatPlaying(false,36);
        System.out.println(getOutput);
        getOutput = PlayingCat.isCatPlaying(false,35);
        System.out.println(getOutput);

    }
}

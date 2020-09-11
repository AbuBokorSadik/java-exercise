public class EnhancedPlayer {
    private String name;
    private int heatPoint = 100;
    private String weapon;

    public EnhancedPlayer(String name, int heatPoint, String weapon) {
        this.name = name;
        if (heatPoint > 0 && heatPoint <= 100){
            this.heatPoint = heatPoint;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int health){
        this.heatPoint -= health;
        if (this.heatPoint <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHeatPoint() {
        return heatPoint;
    }
}

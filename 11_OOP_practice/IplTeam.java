import java.util.Arrays;

public class IplTeam {
    private String name;
    private double totalBudget;
    private double remainingBudget;
    private Player[] players = new Player[11];
    private int totalPlayers = 0;

    public IplTeam(String teamname, double finalBudget){
        name = teamname;
        totalBudget = finalBudget;
        remainingBudget = finalBudget;
    }

    public void addPlayerToTeam(Player p){

        if((totalPlayers<11) && (remainingBudget >= p.getProfile().getBidPrice()) && (p.getProfile().isSold()==false)){
            // add player
            remainingBudget = remainingBudget - p.getProfile().getBidPrice();
            p.getProfile().setSold(true);
            p.getProfile().setSoldtoTeam(name);
            players[totalPlayers] = p;
            totalPlayers++;
        } else {
            // team is full
            System.out.println(name +" already has 11 players or budget issue and thus can not buy "+p.getName()+", whose price #"+p.getProfile().getBidPrice());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public double getRemainingBudget() {
        return remainingBudget;
    }

    public void setRemainingBudget(double remainingBudget) {
        this.remainingBudget = remainingBudget;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "IplTeam [name=" + name + ", totalBudget=" + totalBudget + ", remainingBudget=" + remainingBudget
                + ", players=" + Arrays.toString(players) + ", totalPlayers=" + totalPlayers + "]";
    }

    
}

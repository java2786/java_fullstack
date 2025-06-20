public class IplAuction {
    public static void main(String[] args) {
        IplTeam team1 = new IplTeam("Sher-e-Punjab", 1000);
        IplTeam team2 = new IplTeam("Dili-k-Diler", 600);

        Player p1 = new Player("Brane Lara", "Batsman", new AuctionProfile(160), new PlayerStats(476, 12000, 34));
        Player p2 = new Player("Jacques Kallis", "AllRounter", new AuctionProfile(230), new PlayerStats(539, 11880, 679));
        Player p3 = new Player("ABD", "AllRounter", new AuctionProfile(250), new PlayerStats(539, 11880, 679));

        // System.out.println(p1);

        team2.addPlayerToTeam(p1);
        team2.addPlayerToTeam(p2);
        team2.addPlayerToTeam(p3);

        System.out.println(team2);
        // System.out.println(team2);
    }
}

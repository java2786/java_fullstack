public class Player{
    private String name;
    private String role; // batsman, bowler, all-rounder, keeper
    private AuctionProfile profile;
    private PlayerStats stats;
    public Player() {
    }
    public Player(String name, String role, AuctionProfile profile, PlayerStats stats) {
        this.name = name;
        this.role = role;
        this.profile = profile;
        this.stats = stats;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public AuctionProfile getProfile() {
        return profile;
    }
    public void setProfile(AuctionProfile profile) {
        this.profile = profile;
    }
    public PlayerStats getStats() {
        return stats;
    }
    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }
    @Override
    public String toString() {
        return "Player [name=" + name + ", role=" + role + ", profile=" + profile + ", stats=" + stats + "]";
    }

    
}
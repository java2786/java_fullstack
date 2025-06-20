public class PlayerStats {
    private int matches;
    private int runs;
    private int wickets;

    
    public PlayerStats() {
    }
    public PlayerStats(int matches, int runs, int wickets) {
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
    }
    public int getMatches() {
        return matches;
    }
    public void setMatches(int matches) {
        this.matches = matches;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    public int getWickets() {
        return wickets;
    }
    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
    @Override
    public String toString() {
        return "PlayerStats [matches=" + matches + ", runs=" + runs + ", wickets=" + wickets + "]";
    }


    
}

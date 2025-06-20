public class AuctionProfile {
    private String soldtoTeam = null;
    private double bidPrice = 0.0;  // 0 cr
    private boolean isSold = false;
    
    public AuctionProfile(double p) {  
            bidPrice = p;
    }
    public String getSoldtoTeam() {
        return soldtoTeam;
    }
    public void setSoldtoTeam(String soldtoTeam) {
        this.soldtoTeam = soldtoTeam;
    }
    public double getBidPrice() {
        return bidPrice;
    }
    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }
    public boolean isSold() {
        return isSold;
    }
    public void setSold(boolean isSold) {
        this.isSold = isSold;
    }
    @Override
    public String toString() {
        return "AuctionProfile [soldtoTeam=" + soldtoTeam + ", bidPrice=" + bidPrice + ", isSold=" + isSold + "]";
    }

    
}

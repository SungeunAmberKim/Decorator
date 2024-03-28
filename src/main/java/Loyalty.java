public class Loyalty {
    private String status;
    private int pts;
    public Loyalty() {
        this.status = "bronze";
        this.pts = 0;
    }
    public double discountRate() {
        if (status.equals("bronze")) {
            return 0;
        } else if (status.equals("silver")) {
            return 0.05;
        } else if (status.equals("gold")) {
            return 0.10;
        }
        return 0;
    }
    public void updateStatus() {
        if(this.pts > 10 && this.pts < 20) {
            this.status = "silver";
        }
        if(this.pts >= 20) {
            this.status = "gold";
        }
    }
    public void addPts() {
        this.pts += 1;
        updateStatus();
    }



}

class Bulldog extends Dog{
    private int earnlen;

    public Bulldog(int weight, int height, int db, int earnlen) {
        super(weight, height, db);
        this.earnlen = earnlen;
    }

    public int getEarnlen() {
        return earnlen;
    }

    public void setEarnlen(int earnlen) {
        this.earnlen = earnlen;
    }

    public void sleep(){
        System.out.println("Bulldog is sleeping!");
    }
}

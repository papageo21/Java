class Horse extends Animal{
    private String color;
    private int oura;

    public Horse(int weight, int height, String color, int oura) {
        super(weight, height);
        this.color = color;
        this.oura = oura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOura() {
        return oura;
    }

    public void setOura(int oura) {
        this.oura = oura;
    }
}

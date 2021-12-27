class Dog extends Animal{
    private int db;

    public Dog(int weight, int height, int db) {
        super(weight, height);
        this.db = db;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public void bark(){
        System.out.println("woof woof");
    }
}

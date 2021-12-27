class Main {

    public static void main(String[] args) {

         Horse newton = new Horse(100,200,"black",40);
         Doperman migel = new Doperman(50,100,8);
         Bulldog  zizel = new Bulldog(60,60,9,20);

     System.out.println(newton.getColor());
     migel.bark();
     migel.run();
     migel.bark();
     zizel.bark();
     zizel.sleep();
     zizel.sleep();
    }
}

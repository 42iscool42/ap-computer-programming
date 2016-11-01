public class BoxCar {
    public static void main(String[] joshShermanSuccsEggs) {
        int boxCars = 0;
        PairOfDice pair = new PairOfDice();
        for (int i = 0; i < 100; i ++) {
            pair.roll();
            if (pair.sum() == 12) boxCars++;
        }
        System.out.println("Number of boxcars: " + boxCars);
    }
}
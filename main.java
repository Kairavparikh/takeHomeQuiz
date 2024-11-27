public class Main {
    @FunctionalInterface
    interface Number {
        void printNum(Integer answer);

        static int resultMethod(Integer min, Integer max) {
            int count = 0;
            for (int i = min; i <= max; i++) {
                count += i;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Number number = (answer) -> System.out.println("The sum between the min and the max is " + answer);

        int result = Number.resultMethod(2, 5);
        number.printNum(result);
    }
}

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

    @FunctionalInterface
    interface addingLamdaExpression {
        int addInBetweenNums(int start, int end);  
    }

    public static void main(String[] args) {
        Number number = (answer) -> System.out.println("The sum between the min and the max is " + answer);

        addingLamdaExpression adds = (start, end) -> {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        };

        int result = Number.resultMethod(2, 5);
        int result2 = adds.addInBetweenNums(2, 6);
        number.printNum(result);
        number.printNum(result2);

    }
}

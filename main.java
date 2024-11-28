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
        if (args.length < 4) {
            return;
        }

            int min = Integer.parseInt(args[0]);
            int max = Integer.parseInt(args[1]);

            int min1 = Integer.parseInt(args[2]);

            int max1 = Integer.parseInt(args[3]);

            Number number = (answer) -> System.out.println("The sum between the min and the max is " + answer);
            AddingLambdaExpression adds = (s, e) -> {
                int sum = 0;
                for (int i = s; i <= e; i++) {
                    sum += i;
                }
                return sum;
            };

            int result = Number.resultMethod(min, max);
            int result2 = adds.addInBetweenNums(min1, max1);
            number.printNum(result);
            number.printNum(result2);

    }
}
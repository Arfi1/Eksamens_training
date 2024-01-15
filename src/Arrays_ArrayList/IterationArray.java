package Arrays_ArrayList;

public class IterationArray {
    public static void main(String[] args) {

        // Opret et array af heltal
        int[] numbers = {1, 2, 3, 4, 5};

        // Iteration ved hjælp af en for-løkke
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        //opret et Array af et hel tal
        int[] number1 = {1,2,6,8,9};

        // iteration ved hjælp af en for-each løkke
        for (int numb : number1) {
            System.out.println(numb);
        }


    }
}

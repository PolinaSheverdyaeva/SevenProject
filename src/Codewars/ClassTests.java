package Codewars;

public class ClassTests {

//    There was a test in your class and you passed it. Congratulations!
//But you're an ambitious person. You want to know if you're better
// than the average student in your class.
//You receive an array with your peers' test scores.
// Now calculate the average and compare your score!
//Return True if you're better, else False!

    public static void main(String[] args) {

       System.out.println(betterThanAverage(new int[]{10, 9, 2, 8, 10, 5, 8, 7, 6, 9}, 10));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {


        int sum = yourPoints;
        for (int score : classPoints) {
            sum += score;
        }

        int avg = sum / (classPoints.length + 1);
        System.out.println(avg);

        return yourPoints > avg;

    }

}

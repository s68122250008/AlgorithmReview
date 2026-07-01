
public class ArrayCaseStudy {
    public static void main(String[] args) {
        int[] scores = { 6, 8, 4, 9, 7, 5, 10, 3, 8, 2 };

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        System.out.println("1. คะแนนรวม = " + sum);

        double average = sum / scores.length;
        System.out.println("2. คะแนนเฉลี่ย = " + average);

        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("3. คะแนนสูงสุด = " + max);

        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.println("4. คะแนนต่ำสุด = " + min);

        int count = 0;
        for (int score : scores) {
            if (score >= 7) {
                count++;
            }
        }
        System.out.println("5. จำนวนนักศึกษาที่ได้ >= 7 คะแนน = " + count);

        System.out.print("6. นักศึกษาที่ควรทบทวน: ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.print("คนที่ " + (i + 1) + " ได้ " + scores[i] + " คะแนน ");
            }
        }
    }
}
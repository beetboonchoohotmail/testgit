import java.util.Scanner;

class  Student {
    private int id;
    private int score[];

    public void setId(int id) {
        this.id = id;
    }
    public void setScore(int[] score) {
        this.score = score;
    }
    public void inputScore() {
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i < score.length; i++) {
            System.out.print("จำนวนคะแนนคนที่:" + (i + 1) + " >> ");
            score[i] = scan.nextInt();
            System.out.print(" คน");
        }
    }
    public Double calculateAvg() {
        int sum = 0;
        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return (double) sum/score.length;
    }
}

public class Run54 {
    public static void main(String[] args) {
        Student it = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("จำนวนนักเรียน(คน): ");
        int result = sc.nextInt();
        it.setScore(new int[result]);
        it.inputScore();
        System.out.println("สรุปค่าเฉลี่ยของนักเรียนจำนวน: " + result + " คน ได้ค่าเฉลี่ย: " + it.calculateAvg() + " %");
    }
}

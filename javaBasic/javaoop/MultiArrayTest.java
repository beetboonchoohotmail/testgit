class MultiArray {
     int[][] table = {{28,84,47},
                      {76,69,26},
                      {91,40,28},
                      {13,26,57}};

    public void print() {
        for(int column = 0; column < table[row].length; column++) {
            System.out.print(table[row][column]);
            System.out.println("**************printssss**************");
        }
    }

    public int sumColumn(int column) {
        int sum = 0;
        for(int row = 0; row < table.length; row++) {
            if(column < table[row][column]) {
                sum += table[row][column];
            }
        }
        return sum;
    }
}

class MultiArrayTest {
    public static void main(String[] args) {
        MultiArray chart = new MultiArray();
        chart.print();

        System.out.println("*******mainmainmain*******");
        for(int column = 0; column < 4; column++) {
            System.out.println("Sum of column " + column + " : " + chart.sumColumn(column));
        }
    }
}

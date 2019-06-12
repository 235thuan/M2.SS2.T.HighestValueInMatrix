import java.util.Scanner;

public class HighestIndexValueInMatrix {
    public static void main(String[] args) {
        int numberRows, numberColumn,exitLoop;
        int indexRow = 0;
        int indexColumn = 0;
        int[][] matrixA;
        int approximate = 9;
        int aboveZero = 1;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Enter number of rows:");
            numberRows = scanner.nextInt();
            System.out.println("Enter number of column:");
            numberColumn = scanner.nextInt();
            matrixA = new int[numberRows][numberColumn];
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    double randomNumberCal = Math.random() * approximate;
                    int randomNumber = (int) randomNumberCal + aboveZero;
                    matrixA[i][j] = randomNumber;
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
            int max = matrixA[0][0];
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    if (max < matrixA[i][j]) {
                        max = matrixA[i][j];
                        indexColumn = j + aboveZero;
                        indexRow = i + aboveZero;
                    }
                }
            }
            System.out.printf("%-13s%-10s%-10s", "Row", "Column", "Value\n");
            System.out.printf("%-13s%-10s%-10s", indexRow, indexColumn, max);
            System.out.println("\n Enter 0 exit, other number to run again");
            exitLoop=scanner.nextInt();
            if(exitLoop==0)
                System.exit(0);
        }
        while (exitLoop!=0);
    }
}

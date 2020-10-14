//import java.util.Scanner;

public class questionThirteenScouts {

  /*

  Instructions:
  4 Gduds (rows)  x  6 teams each (columns)
  Find the highest value team in each gdud (could be more than one)
  From the highest value of the gduds, print the gdud with the smallest value (again, could be more than one)

  Output example for following matrix (from book)

      1  2  3  4  5  6

  1   09 15 23 18 15 20
  2   21 20 19 17 34 22
  3   30 28 25 19 20 19
  4   14 16 23 22 21 23

  (Output):
  Team 3 gdud 1 (Value = 23)
  Team 3 gdud 4 (Value = 23)
  Team 6 gdud 4 (Value = 23)

   */

    public static void main(String[] args) {

        //  Scanner input = new Scanner(System.in);  // Create a Scanner object, used if matrix is by input
        int[][] scouts = { //example of matrix from book
                // Column  1   2   3   4   5   6
                {9,  15, 23, 18, 15, 20}, //row 1
                {21, 20, 19, 17, 34, 22}, //row 2
                {30, 28, 25, 19, 20, 19}, //row 3
                {14, 16, 23, 22, 21, 23} //row 4
        };

        findH(scouts);

        // ------------Matrix by input implementation: --------------

    /*

    int[][] matrix = new int[4][6];
    for (int row = 0; row < matrix.length; row++){
      for (int col = 0; col < matrix[row].length ; col++) {
            matrix[row][col] = input.nextInt();
      }
    }

    */

    }
  /*
  In order to find all minimum maximum in all rows we will:
  Find the maximum of each row, check if it is smaller than current minimum max value
  If it is -> switch
  Then we will go through the 2d array AGAIN and find the maximum value of each row, if it is = smallest maximum
  We will go through the row AGAIN and print all appearances of the smallest maximum
   */

    //טענת כניסה: הפעולה קולטת מערך דו ממדי שמייצג את את הקבוצות של כל גדוד
    //טענת יציאה: הפעולה מדפיסה כפלט את מספר הקבוצה ואת מספר הגדוד אליו היא משתייכת ואת ערך המספר המקסימלי המינימלי
    public static void findH(int[][] mat) {
      /*
      First we initialize smallMax with the MAX of the first row

      If we didn't do this stage, we'd have to set smallMax to a number that would necessarily be bigger than the
      biggest number (max) in the first row. We could set it to 1,000,000 but in EXTREME circumstances,
      this could fail to work. So I chose this way
      */
        int smallMax = -2; //There can't be less kids (negative number)
        for (int col = 0; col < mat[0].length; col++) {
            if (mat[0][col] > smallMax) { // if col in row 0 is bigger than max...
                smallMax = mat[0][col];
            }
        }
        //before going into this loop, we have smallMax which has the highest value from row = 0
        for (int row = 1; row < mat.length; row++) { //start from row = 1, because we already have been through row = 0
            int rowMax = -2;
            for(int col = 0; col < mat[row].length; col++) {
                if (mat[row][col]> rowMax){
                    rowMax = mat[row][col];
                }
            }
            if (rowMax<smallMax){ //if the maximum of this row, is smaller than the max from other row/s -> switch values...
                smallMax = rowMax;
            }
        }
    /*
    now - smallMax has the smallest maximum value from all rows.
    smallMax might appear more than once as the smallest maximum in a row.
    IMPORTANT(!):
    We ONLY print a cell, if it is maximum in said row and is = smallest Max
     */

        for (int row = 0; row < mat.length; row++) { //Find max value in row
            int rowMax = -2;
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] > rowMax) {
                    rowMax = mat[row][col];
                }
            }
            if (rowMax == smallMax) { // If max value in row is = smallest max
                for (int col = 0; col < mat[row].length; col++) { // We go through the row AGAIN (!) and find ALL instances of MAX
                    if (mat[row][col] == smallMax) {
                        System.out.println("Team " + (col + 1) + " gdud " + (row + 1) + " (Value = " + smallMax + ")");
                    }
                }
            }
        }
    }

}


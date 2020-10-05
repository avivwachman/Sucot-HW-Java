public class questionElevenLockers {
/*

- Every cupboard has 81 cells
- Every cell has an index ranging from 11-99 correspondingly to the row and collum of the cell
- Every cells has a secrete code
- Write a program that receives a matrix that contains the codes and an index of a cell
the program should return the secret code

 */

  public static void main(String[] args) {
    int[][] ourLockers = {
            {-1, -1,    -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1  },
            {-1, 1101,  2008, 2021, 1111, 2704, 2704, 2344, 1111, 1112},
            {-1, 2004,  1010, 2070, 2222, 1477, 2804, 2564, 2222, 2223},
            {-1, 4404,  6754, 3319, 7300, 9004, 2904, 2300, 3333, 3334},
            {-1, 3626,  4172, 1909, 2211, 1323, 2104, 4722, 4444, 4445},
            {-1, 5678,  2332, 1970, 7276, 4030, 2204, 9704, 5555, 5556},
            {-1, 6666,  2222, 4000, 2706, 9090, 3404, 8704, 6661, 6667},
            {-1, 1636,  2323, 4708, 6736, 9192, 5604, 9005, 7777, 7787},
            {-1, 1656,  3322, 4900, 2706, 9090, 8904, 6804, 8888, 8898},
            {-1, 7716,  4224, 4042, 2796, 9190, 1104, 3604, 9999, 9191}
    };
    int id = 94;
    System.out.println("Expected locker id : 94 " + "Expected outcome: 2796");
    int outcome = getCode(ourLockers, id);
    System.out.println("Id: " + id);
    System.out.println("Outcome: " + outcome);
    System.out.println(tester(id, outcome));
  }

  public static int getCode (int[][] room, int num){
    if (num<11 || num > 99){
      return -1;
    }
                      //example: num = 94
    int col = num%10; //col = 4
    int row = num/10; //row = 9
    return room[row][col];

  }

  public static String tester(int id, int outcome){
    if (id != 94){
      return "False: wrong id";
      }
    if (outcome != 2796){
      return "False: wrong outcome";
    }
    return "True";
  }
}

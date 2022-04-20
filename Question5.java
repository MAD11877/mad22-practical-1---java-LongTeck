import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    ArrayList<Integer> numList = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int temp = num;
    while (temp> 0){
      int number = in.nextInt();
      numList.add(number);
      temp--;
    }

    int highestoccnum = 0;
    int highestcount = 0;
    for (int i = 0; i < num; i++){
      int count = 0;
      int tempnum = numList.get(i);
      for(int a = 0; a < num; a++){
        if (tempnum == numList.get(a)){
           count++;
        }
      }
      if (count > highestcount){
        highestcount = count;
        highestoccnum = numList.get(i);
      }
    }
    System.out.println(highestoccnum);
    
  }
}

package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
    /*public static void main(String[] args){
        int numberToSkip=5,lastInRow=10;*/
        int number=0,skipped=0;
        if(numberToSkip>lastInRow)
            System.out.println("number to skip is bigger then the last");
        else if(lastInRow<0)
            System.out.println("last number in row is negative");
        else
        {    for(int i =1;i<=lastInRow;i++)
            {
                if(i<=numberToSkip)
                { skipped +=i;
                    continue;}
                number+=i;
            }
            System.out.println("skipped sum is " + skipped);
            System.out.println("counted sum is " + number);}

    }
}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        long low = 1;
        long high = (long)Math.sqrt(k);
        
        while(low<=high)
        {
        long mid = (low+high)/2;

        if(funk(mid)==k)
        {
            System.out.print(mid);
            return;
        }
        else if(funk(mid)>k)
        {
            high = mid-1;
        }
        else
        {
            low = mid+1;
        }
        }
        System.out.print(-1);


    }

    public static long funk(long x)
    {
        long k = x*x + 3*x;
        return k;
    }

}

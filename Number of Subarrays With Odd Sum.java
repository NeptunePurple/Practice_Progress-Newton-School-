import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int[] arr = new int[n];
            long[] sum = new long[n];
            long s=0;


            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }


            long bigcount = 0;
            int ecounter = 0;
            int ocounter = 0;
            

            for(int i=0;i<n;i++)
            {
                s+=arr[i];
                sum[i]=s;

                if(sum[i]%2==0)
                {
                    ecounter+=1;
                }
                else
                {
                    bigcount = bigcount+1+ecounter;
                }
            }

            for(int i=0;i<n;i++)
            {

                if(sum[i]%2==1)
                {
                    ocounter+=1;
                }
                else
                {
                    bigcount = bigcount+ocounter;
                }
            }

        System.out.print(bigcount);
          
    }
}

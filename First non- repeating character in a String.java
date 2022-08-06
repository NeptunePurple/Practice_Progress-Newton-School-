import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //String thread = br.readLine();
        String thread = sc.next();
        int n = thread.length();
        int ans = -1;

        Map<Character,Integer> threadcounter = new HashMap<Character,Integer>();

        for(int i=0;i<n;i++)
        {
            Character charati = thread.charAt(i);

            if(!threadcounter.containsKey(charati))
            {
                threadcounter.put(charati,1);
            }
            else
            {
                threadcounter.put(charati,threadcounter.get(charati)+1);
            }
        }

        for(int i=0;i<n;i++)
        {
            char chr = thread.charAt(i);
            if(threadcounter.get(chr)==1)
            {
                System.out.print(i);
                //System.out.print(chr);
                return;
            }
        }
        System.out.print(-1);
    }
}

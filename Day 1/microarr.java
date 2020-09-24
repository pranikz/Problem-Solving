// question url
//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update


import java.util.Scanner;

public class microarr {
    public static void main(final String[] args) {
        int t;
        final Scanner input=new Scanner(System.in);
        t=input.nextInt();
        for(int j=t;j>0;j--){
            int n,k;
            n=input.nextInt();
            k=input.nextInt();
            int ans=k;
            for(int i=1;i<=n;i++){
                int temp;
                
                temp=input.nextInt();
                ans=Math.min(ans,temp);
            }
            System.out.println(k-ans);

        }

    }
}

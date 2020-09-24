// question url:
// https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/bracket-sequence-1-40eab940/description/




import java.util.*;

class Bracket

{

  public static void main(final String[] args)

  {

      final Scanner sc = new Scanner(System.in);

      final String s = sc.next();

      final char ch[] = s.toCharArray();

      int flag, c = 0, i, j;
      final int n = ch.length;

    for(i=0;i<n;i++)

      {

        flag=0;

        if(ch[i]==')')

          continue;

        for(j=i;j<i+n;j++)

        {

          if(ch[(j%n)] == '(' )

            flag++;

          else

            flag--;

         if(flag<0)

           break;

       }

       if(flag==0)

         c++;

     }

     System.out.println(c);

  }

}
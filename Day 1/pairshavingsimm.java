//partially accepted solution
// link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pairs-having-similar-element-eed098aa/
import java.util.Scanner;

/**
 * pairshavingsimm
 */
public class pairshavingsimm {

    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);

        final int n = s.nextInt();

        final int[] A = new int[n];

        for (int i = 0; i < n; i++)

        {

            A[i] = s.nextInt();

        }
        int temp = 0;

        for (int i = 1; i < A.length; i++) {

            for (int j = 0; j < A.length - i; j++) {

                if (A[j] >= A[j + 1]) {

                    temp = A[j];

                    A[j] = A[j + 1]; //

                    A[j + 1] = temp;

                }

            }

        }

        long count = 0, ans = 0, same = 0;

        for (int i = 1; i < n; i++)

        {

            if (Math.abs(A[i] - A[i - 1]) == 1)

                count++;

            else if (A[i] == A[i - 1])

                same++;

            else

            {

                if (count != 0)

                {

                    count += same;

                    ans += (count * (count + 1)) / 2;

                }

                count = 0;

                same = 0;

            }

        }

        if (count != 0)

        {

            count += same;

            ans += (count * (count + 1)) / 2;

        }

        System.out.println(ans);

    }
}
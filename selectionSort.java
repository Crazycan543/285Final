public class SelectionSort {

         /* Selection Sort function */

    public static void sort( int arr[] ){

        int N = arr.length;

        int i = 0, j = 0, pos, temp;

        for (i = 0; i < N; i++)

        {

            pos = j;

            for (j = i; j < N-1; j++)

            {

                if (arr[j] < arr[pos])

                {

                    pos = j;

                }

            }

            /* Swap arr[i] and arr[pos] */

            temp = arr[i];

            arr[i] = arr[pos];

            arr[pos] = temp;

        }

      }

}

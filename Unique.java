import java.util.*;
import java.io.*;
class Unique
{
    static void printDistinct(int arr[], int n)
    {
        Arrays.sort(arr);
        for (int i=0;i<n;i++)
        {
            while (i<n - 1 && arr[i] == arr[i + 1])
            i++;
            System.out.print(arr[i] +" ");
        }
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }		
		printDistinct(arr, n);

	}
}
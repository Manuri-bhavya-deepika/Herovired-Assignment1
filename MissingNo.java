import java.util.*;
import java.util.Scanner;
import java.io.*;
class MissingNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int diff=arr[0]-0;
        for(int i=0;i<num;i++)
        {
            if(diff<(arr[i]-i))
            {
                while((arr[i]-i)!=diff)
                {
                    System.out.print((diff+i)+" ");
                    diff++;
                } 
            }           
        }   
        
    }
}

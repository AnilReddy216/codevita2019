
import java.util.*;
class Bottles
{
    public static void NumofBottle(int arr[],int n )
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        int bottles=0;
        for(int i=0;i<max+1;i++)
        {
            if (freq[i]>bottles)
            {
                bottles=freq[i];
            }
        }

        System.out.println("Bottles:"+bottles);
    }
}
class Bottlenecks
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total bottles:");
        int n=sc.nextInt();
        System.out.println("Enter the radius:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Bottles obj=new Bottles();
        obj.NumofBottle(arr,n);
        sc.close();
    }
    
}

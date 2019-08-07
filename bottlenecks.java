
import java.util.*;
class bottles
{
    public void bottle(int a[],int n )
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            freq[a[i]]++;
        }
        int f=0;
        for(int i=0;i<max+1;i++)
        {
            if (freq[i]>f)
            {
                f=freq[i];
            }
        }

        System.out.println(f);
    }
}
class geeks{
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
    int tc=sc.nextInt();
    while(tc-- >0)
    {
        System.out.println("enter the total bottles");
        int n=sc.nextInt();
        System.out.println("enter the radius:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        bottles b=new bottles();
        b.bottle(a,n);
    }
    }
}
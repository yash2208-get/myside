import java.util.*;
class pattan4{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        
            int n=a.nextInt();
            // int n1=n;
            for(int i=1; i<=n; i++ )
            {   
                for(int j=1; j<=n; j++)
                {
                    if(i==j || i+j==n+1)
                    {
                        System.out.print("*\t");           
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
             System.out.println();   
            }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlargest;
import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class Secondlargest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
            Scanner input=new Scanner(System.in);
            int t=input.nextInt();
            while(t>0)
            {    
             
                int A=input.nextInt();
                int B=input.nextInt();
                int C=input.nextInt();
                if(A>=B && A>=C)
                {
                    if(B>=C)
                    {
                        System.out.println(B);
                    }
                    else
                    {
                        System.out.println(C);
                    }
                }
                else if(B>=A && B>=C)
                {
                    if(A>=C)
                    {
                        System.out.println(A);
                    }
                    else
                    {
                        System.out.println(C);
                    }
                }
                else if(A>=B)
                {
                    System.out.println(A);
                }
                else
                {
                     System.out.println(B);

                }
            }
            t--;
    }
                 
                            
}
    


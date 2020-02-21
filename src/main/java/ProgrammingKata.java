import com.sun.tools.javac.code.Attribute;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammingKata
{
        public static void hello(String name)
        {
            System.out.println("Hello "+ name);
        }
        public static void even_Or_Odd(int num)
        {
            if((num/2)*2 == num)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
        }
        public static void square(int hush)
        {
            for(int i=1;i<=hush;i++)
            {
                for(int x=1;x<=hush;x++)
                {
                    System.out.print("#");
                }
                System.out.print("\n");
            }
        }
        public static void triangle(int hush)
        {
            for(int i=1;i<=hush;i++)
            {
                for(int x=1;x<=i;x++)
                {
                    System.out.printf("#");
                }
                System.out.println();
            }
        }
        public static void isosceles(int hushtr)
        {
            for(int i=0;i<hushtr;i++)
            {
                for(int j=hushtr-i;j>1;j--)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=i*2;j++)
                {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
        public static void longest(String[] lon)
        {
            int maxLength = 0;
            String longestString = "";
            for (String l : lon)
            {
                if (l.length() > maxLength)
                {
                    maxLength ++;
                    longestString = l;
                }
            }

            System.out.println(longestString);
        }
        public static void combine(int a[], int b[])
        {
            int aLen = a.length;
            int bLen = b.length;
            int[] result = new int[aLen + bLen];
            int i=0, j=0,k=0;

            while(i<aLen&&j<bLen)
            {
                result[k++]=a[i++];
                result[k++]=b[j++];
            }
            while (i<aLen)
            {
                result[k++]=a[i++];
            }
            while (j<bLen)
            {
                result[k++]=b[j++];
            }
            System.out.println(Arrays.toString(result));
        }
    public static void frame(String... fra)
    {
        ArrayList<String> list = new ArrayList<String>();
        int inside = 0;
        int topsize = 0;
        int longestlength = 0;
        for (String i : fra) {
            int length = i.length();
            if (length > longestlength)
            {                longestlength = length;
                list.clear();
            }
            if (length == longestlength)
            {
                list.add(i);
            }
        }
//          top stars
        for (String x : list)
        {
            topsize = x.length();
        }
        for(int j=0; j<topsize+4;j++)
        {
            System.out.print("*");
        }
        System.out.println();
//          middle of the frame
        for (String i : fra)
        {
            System.out.print("* " + i);
            inside = topsize+4-i.length()-3;
            for (int z=0;z<inside;z++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
//          bottom stars
        for(int j=0; j<topsize+4;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
        public static void main(String[] args)
        {
            int a[] = {11,22,33};
            int b[] = {1,2,3};

            hello("Tshepo");
            even_Or_Odd(3);
            square(2);
            triangle(4);
            isosceles(3);
            longest(new String[]{"the", "quick", "brown", "chickens", "fox", "ate", "my" });
            longest(new String[]{"once", "upon", "a", "time", "hi"});
            combine(a,b);
            frame("Write", "good", "code", "every", "day");
        }
}

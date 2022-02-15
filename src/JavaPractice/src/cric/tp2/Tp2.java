package cric.tp2;

public class Tp2
{
    public void testIf(boolean b)
    {
        var str = "hi";
        if (b)
        {
            System.out.println(str);
        }
        else
        {
            System.out.println(str + ",no!");
        }
    }

    public void testFor(int i)
    {
        for (var j = 0; j < i; j++)
        {
            System.out.println("index:" + j + "/" + i);
        }
    }

    public void testArray(int i)
    {
        int[] nums = new int[i];
        for (var j = 0; j < i; j++)
            System.out.println(j);
    }
}
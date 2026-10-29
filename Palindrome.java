import java.util.StringTokenizer;


public class Palindrome
{
    public Palindrome()
    {

    }
    public boolean isPalindrome(String sq)
    {
        String s = sq.toLowerCase();
        ArrayStack<String> stack = new ArrayStack<String>();
        StringTokenizer t = new StringTokenizer(s, ".,;:'? \t\n\r");
        ArrayQueue<String> queue = new ArrayQueue<String>();
        
        while (t.hasMoreTokens())
        {
            String str = t.nextToken();
            for(int i = 0; i < str.length(); i++)
            {
                String c = Character.toString(str.charAt(i));
                stack.push(c);
                queue.add(c);
            }
        }
        int size = queue.size();
        for(int i = 0; i < size; i++)
        {
            try
            {
                if(!(stack.pop().equals(queue.remove())))
                {
                    return false;
                }
            }
            catch(StackUnderflowException e)
            {
                return false;
            }
           
        }

        return true;
    }

    public String date(int year)
    {
        int lastDig = (year % 1000);
        int secondLastDig = (year % 100) / 10;
        String lastTwo = lastDig + ""+ secondLastDig;
        for(int i = 1; i <= 12; i++)
        {

        }
    }
}
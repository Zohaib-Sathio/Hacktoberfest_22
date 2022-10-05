import java.util.*;

public class UniqueCharacters
{

    int countunique(String str)
    {
        HashSet<Character> s = new HashSet<Character>();
        for(int i = 0; i < str.length(); i++)
        {
            s.add(str.charAt(i));//adding elements to a hashset(A hashset does not allow entry of duplicate elements)
        }
        return s.size();
    }
    public static void main(String args[])
    {
        UniqueCharacters ob = new UniqueCharacters();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String str= sc.nextLine();
        int ans=ob.countunique(str);
        System.out.println("Number of unique characters="+ans);
    }
}
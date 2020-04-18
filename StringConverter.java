public class StringConverter
{
    // Methods
    public static String reverse(String str)
    {
        String reverse = "";
        // iterate through the string and create a new string by printing from the last to the first char
        for (int i = str.length()-1, n = 0; i >= n; i--)
        {
            reverse += str.substring(i,i+1);
        }
        return reverse;
    }
    // removes all non letters
    public static String onlyAlphabet(String str)
    {
        return str.replaceAll(" ", "").replaceAll(":", "").replaceAll(",","").replaceAll("\\?", "").replaceAll("!", "");
    }

    public static boolean checkPalindrome(String str)
    {
        String reverse = "";
        // removes all characters that isn't in the alphabet from the string and changes all chars to lower case
        str = str.toLowerCase();
        str = onlyAlphabet(str);
        // reverse the string
        reverse = StringConverter.reverse(str);
        // check if the string and it's reverse is the same
        if (str.equals(reverse))
        {
            return true;
        }
        return false;
    }

    public static String pigLatinate(String str)
    {
        // variables for start and end
        String start = "";
        String end = "";
        // string of vowels to check with str
        String vowels = "aeiouAEIOU";
        str = onlyAlphabet(str);
        // if the word starts with a vowel
        if (vowels.indexOf(str.substring(0,1)) >= 0)
        {
            return str + "yay";
        }
        // check if str has a vowel in it
        for (int i = 1, n = str.length(); i < n; i++)
        {
            if ((vowels.indexOf(str.substring(i, i+1))) >= 0)
            {
                if (Character.isUpperCase(str.charAt(0)))
                {
                    start = str.substring(0, 1).toLowerCase() + str.substring(1, i);
                    end = str.substring(i, i+1).toUpperCase() + str.substring(i+1);
                }
                else
                {
                    start = str.substring(0, i);
                    end = str.substring(i);
                }
                return end + start + "ay";
            }
        }
        // str has no vowels in it
        return str + "ay";
    }

    public static String shorthand(String str)
    {
        // replace all vowels and key words with their replacements (i.e. and ---> &)
        str = str.replaceAll("U","").replaceAll(" and ", " & ").replaceAll(" to "," 2 ").replaceAll("for", "4").replaceAll("you","U").replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");

        return str;
    }
}
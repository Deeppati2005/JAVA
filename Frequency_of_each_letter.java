package practice;

public class Frequency_of_each_letter {

    public static void main(String[] args) {
        String s = "JAVA IS A HIGH LEVEL, OBJECT ORIENTED , DISTRIBUTIVE , ARCTITECTURE NEUTRAL , PLATFORM INDEPENDEMT PROGRAMMING LANGUAGE DESIGNED BY JAMES GOSLING";
        s = s.toUpperCase();
        int[] frequency = new int[256];
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                frequency[ch]++;
            }
        }
        char maxChar = ' ';
        int max = 0;
        for (int i = 0; i < frequency.length; i++)
        {
            if (frequency[i] > max) {
                max = frequency[i];
                maxChar = (char) i;
            }
        }
        System.out.println("Character with the highest frequency: " + maxChar + " (" + max + " times)");
    }
}

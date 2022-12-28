class first
{
    public static void main(String[] args)
    {
        String s1= "vineet bhardwaj";
        String s2= "THIS IS VINEET!";
        char c = s1.charAt(5);             //charArt() is pre-define method is use to index particular character in String
        
        String part1 = "Vineet";
        String part2 = "Bhardwaj";

        System.out.println(s1.toUpperCase());     //toUpperCase() pre-define method's
        System.out.println(s2.toLowerCase());     //toLowerCase() pre-define method's
        System.out.println(s1.length());          // length() pre-define method's
        System.out.println(s1.isBlank());         // isEmpty and isBlank method's are use to display the nature of a string using Boolean data-types 
        System.out.println(s1.isEmpty());

        System.out.println(c);
        System.out.println(s1.indexOf('b'));   //use to print the index of character in a String

        System.out.println(part1+" "+part2);      //Concatenate String

    }
}
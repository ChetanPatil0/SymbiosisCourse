//Strinf Methods
class Program17{
    public static void main( String args[])
    {

        String s1= "Bhagirath";
        int len = s1.length();
        System.out.println(len);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('a','z'));
        System.out.println(s1.indexOf('e'));
        System.out.println(s1.lastIndexOf('e'));
        String s2 = "ViewSonic";
        System.out.println(s1.trim()+ s2.trim());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.substring(5));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(5,8));
        System.out.println(s1.toString());
        int i=100;
        System.out.println(s1.valueOf(i).length());
        

    }
}
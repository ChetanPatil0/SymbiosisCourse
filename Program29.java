class Program29{
    public static void main(String args[])
    {
        String S1 = "hello hi";
        String S2 = "hello hi";

        boolean result = S1==S2;
        switch(result)
        {
            case true:
                System.out.print("OK");
                break;
            case false:
                    System.out.print("Fine");
                    break;
        }
    }
}
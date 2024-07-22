// <!-- 
// 1.30
// 2.i + j
// 3.hello10
// 4.hello1020
// 5.30hello
// 6.hello200
// error
// hello1020java -->
class Program26{
    public static void main(String args[])
    {
        String str1="hello",str2="java";
        int i=10,j=20;
        System.out.println(i + j);
        System.out.println("i + j");
        System.out.println(str1 + i);
        System.out.println(str1  + i + j);
        System.out.println(i + j + str1);
        System.out.println(str1 + i * j);
        // System.out.println(str1  + i - j);->error  //System.out.println(str1  + (i - j));-> hello-10
        System.out.println(str1 + i + j + str2);
    }
}

//calculate the profit and profit percentage
class Program4{
       public static void main(String args[])
       {
          float BuyPrice = 20.54f;
          float SellPrice = 30.50f;
 
         float profit = SellPrice - BuyPrice;
         float per = (profit / BuyPrice) * 100;
         System.out.println("PROFIT : " + profit);
         System.out.print("PROFIT % : " + per +"%");

       }

} 
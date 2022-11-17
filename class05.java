package Java09;

class Ccount                          // 定義類別Ccount
{
   private static int cnt=0;          // 宣告cnt為「類別變數」

   public Ccount()                    // Ccount()建構元
   {
      cnt ++;                         // 當此建構元被呼叫時，cnt便加1
   }
   public void show()
   {
      System.out.println("cnt="+cnt);
   }
   public static void setZero()       //(b)使用setZero()讓cnt歸零
   {
   cnt=0;
   }
   public static void setValue(int n) //(c)使用setValue()讓cnt=n
   {
   cnt=n;
   }
   public void show_count()   // show_count(),顯示目前物件建立的個數
   {
      System.out.println(cnt+" object(s) created");
   }
}
public class a_9_5 {


	public static void main(String[] args) {
	    Ccount cir1=new Ccount();      // 呼叫第7行的建構元
	    cir1.show();                   // 用cir1物件呼叫show_count() method
	    Ccount cir2=new Ccount();      // 呼叫第23行的建構元
	    cir1.show_count();             // (a)用cir1物件呼叫show_count() method
	    cir2.show_count();             // (a)改用cir2物件呼叫show_count() method
	    
	    cir1.setZero();                //cir1呼叫第15行cnt=0
	    System.out.println("using setZero()");
	    cir1.show();
	    
	    cir2.setValue(10);             //cir2呼叫第19行輸入數值(10)=n
	    System.out.println("using setValue(10)");
	    cir2.show();                   //輸出cnt=10
	}
}
//(d)用類別函數,因為能夠一次對類別做很多加工，比方說追蹤物件數，而且不需要透過物件呼叫。
//(e)兩個都可以寫

package Java09;
class CRectangle                   // 定義類別CRectangle
{
   private int width,heigth;

   public CRectangle()             // 沒有引數的建構元 //(b)小題
   {
      width=10;
      heigth=8;
   }
   /*public CRectangle()           // (c)小題所要的this寫法
   {
      this(10,8);      
   }*/
   public CRectangle(int w,int h)  // 有兩個引數的建構元 (a)小題的自動設置(w,h)
   {
	   width=w;
	   heigth=h;
   }
   public void show()
   {
       System.out.println("width="+width);
       System.out.println("heigth="+heigth);
   }
}
public class a_9_1
{
   public static void main(String args[])
   {
	  CRectangle r1=new CRectangle(); // 建立物件並呼叫沒有引數的建構元
      r1.show();
      CRectangle r2=new CRectangle(0,0); // 建立物件並呼叫有引數的建構元
      r2.show();
      
   }
}

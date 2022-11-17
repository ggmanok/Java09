package Java09;
class CRectangle                   // ﹚竡摸CRectangle
{
   private int width,heigth;

   public CRectangle()             // ⊿Τま计篶じ //(b)肈
   {
      width=10;
      heigth=8;
   }
   /*public CRectangle()           // (c)肈┮璶this糶猭
   {
      this(10,8);      
   }*/
   public CRectangle(int w,int h)  // Τㄢま计篶じ (a)肈笆砞竚(w,h)
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
	  CRectangle r1=new CRectangle(); // ミン㊣⊿Τま计篶じ
      r1.show();
      CRectangle r2=new CRectangle(0,0); // ミン㊣Τま计篶じ
      r2.show();
      
   }
}

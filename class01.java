package Java09;
class CRectangle                   // �w�q���OCRectangle
{
   private int width,heigth;

   public CRectangle()             // �S���޼ƪ��غc�� //(b)�p�D
   {
      width=10;
      heigth=8;
   }
   /*public CRectangle()           // (c)�p�D�ҭn��this�g�k
   {
      this(10,8);      
   }*/
   public CRectangle(int w,int h)  // ����Ӥ޼ƪ��غc�� (a)�p�D���۰ʳ]�m(w,h)
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
	  CRectangle r1=new CRectangle(); // �إߪ���éI�s�S���޼ƪ��غc��
      r1.show();
      CRectangle r2=new CRectangle(0,0); // �إߪ���éI�s���޼ƪ��غc��
      r2.show();
      
   }
}

package Java09;

class Ccount                          // �w�q���OCcount
{
   private static int cnt=0;          // �ŧicnt���u���O�ܼơv

   public Ccount()                    // Ccount()�غc��
   {
      cnt ++;                         // ���غc���Q�I�s�ɡAcnt�K�[1
   }
   public void show()
   {
      System.out.println("cnt="+cnt);
   }
   public static void setZero()       //(b)�ϥ�setZero()��cnt�k�s
   {
   cnt=0;
   }
   public static void setValue(int n) //(c)�ϥ�setValue()��cnt=n
   {
   cnt=n;
   }
   public void show_count()   // show_count(),��ܥثe����إߪ��Ӽ�
   {
      System.out.println(cnt+" object(s) created");
   }
}
public class a_9_5 {


	public static void main(String[] args) {
	    Ccount cir1=new Ccount();      // �I�s��7�檺�غc��
	    cir1.show();                   // ��cir1����I�sshow_count() method
	    Ccount cir2=new Ccount();      // �I�s��23�檺�غc��
	    cir1.show_count();             // (a)��cir1����I�sshow_count() method
	    cir2.show_count();             // (a)���cir2����I�sshow_count() method
	    
	    cir1.setZero();                //cir1�I�s��15��cnt=0
	    System.out.println("using setZero()");
	    cir1.show();
	    
	    cir2.setValue(10);             //cir2�I�s��19���J�ƭ�(10)=n
	    System.out.println("using setValue(10)");
	    cir2.show();                   //��Xcnt=10
	}
}
//(d)�����O���,�]������@�������O���ܦh�[�u�A��軡�l�ܪ���ơA�ӥB���ݭn�z�L����I�s�C
//(e)��ӳ��i�H�g

package Java09;
class Caaa{
/*public Caaa{*/             //(c)����ϥ�public�ŧi�A�]�����O��package�̪��ɮצW�����O�ϥΡC        
	private int value;
  /*public int value;*/      //(d)�令public�ä��|�ﵲ�G���v�T
	public Caaa() {      //�L�޼ƫغc��  
		value=10;    //(a)value�ȳ]��10
		System.out.println("value="+value); 
	}
	public Caaa(int i) {     //���޼ƫغc�� 
		value=i;
		System.out.println("value="+value);
		
	}
}
public class a_9_3 {

	public static void main(String[] args) {
		Caaa a=new Caaa();   //�I�s�Ĥ���غc��(b)
		Caaa b=new Caaa(12); //�I�s�ĤQ��غc��(b)

	}
}


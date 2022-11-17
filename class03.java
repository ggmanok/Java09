package Java09;
class Caaa{
/*public Caaa{*/             //(c)不能使用public宣告，因為它是供package裡的檔案名稱類別使用。        
	private int value;
  /*public int value;*/      //(d)改成public並不會對結果有影響
	public Caaa() {      //無引數建構元  
		value=10;    //(a)value值設為10
		System.out.println("value="+value); 
	}
	public Caaa(int i) {     //有引數建構元 
		value=i;
		System.out.println("value="+value);
		
	}
}
public class a_9_3 {

	public static void main(String[] args) {
		Caaa a=new Caaa();   //呼叫第六行建構元(b)
		Caaa b=new Caaa(12); //呼叫第十行建構元(b)

	}
}


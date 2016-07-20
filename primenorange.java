# Primenorange

public class Range {


	public static void main(String[] args) {
		int a=10;
		int b=23;
		int count=0;
		int d=0;
		while(a<=b){
			int flag=0;
		for(int i=2;i<=b/2;i++){
			
			if(a%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			
			count++;
		}
		a++;
			
		}
System.out.println(count);
	}

}

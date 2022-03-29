package exercicio4;

public class Fibonacci {

	public static void main(String[] args) {
		int i=0,j=1,l,x=0,quant=10;
		
		while(x<=quant) {
			l = i + j;
			System.out.println(l);
			x++;
			if(x==quant){
				break;
			}
			j = l + i;
			System.out.println(j);
			x++;
			if(x==quant){
				break;
			}
			i = l + j;
			System.out.println(i);
			x++;
			if(x==quant){
				break;
			}
		}

	}

}

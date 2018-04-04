
public class convertzigag {
	public static void convert(String input,int rows){
		int a  = input.length();
		if( a == 0 || a == 1){
			System.out.println("shit!"+input);
		}else{
			StringBuilder[] sb = new StringBuilder[rows];
			for(int b =0;b<=a;b++){
//				if(b%2 != 0){
//					sb.append(input.charAt(b));
//				}
//				if(b%2 == 0){
//					sb.append(input.charAt(b+rows));
//				}
				sb[b] = new StringBuilder("");
			}
			int incre = 1;
			int index = 0;
			for(int i=0;i<=a;i++){
				sb[index].append(input.charAt(i));
				if(index == 0)
					incre = 1;
				else{
					incre = -1;
				}
			}
			
		}
	}
	
	
	
	
	
	public static void main(String[] args){
		String string = "";
		convert(string,3);
	}
}


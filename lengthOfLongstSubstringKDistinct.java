
public class lengthOfLongstSubstringKDistinct {
	public static int LengthOfLongstSubstringKDistinct(String s ,int k){
		int[] count = new int[256];
		int num = 0,i=0,res=0;
		for(int j=0;j< s.length();j++){
			if(count[s.charAt(j)]++ == 0)
				num++;
			//System.out.println(count[s.charAt(j)]);
			if(num>k){
				while(--count[s.charAt(i++)]>0);
					num--;
			}
			res = Math.max(res, j-i+1);
		}	
		return res;
	}
	public static void main(String[] args){
		String s ="ecebur";
		int k = 2;
//		int[] cc = new int[256];
		System.out.println(LengthOfLongstSubstringKDistinct(s,k));
//		int a = 0;
//		System.out.println(a);
//		System.out.println(a++);
//		System.out.println(a);
	}
}

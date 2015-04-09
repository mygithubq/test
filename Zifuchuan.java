/**
 * 第三题
 * 单词颠倒顺序输出
 * @author 王倩倩
 *
 */
public class Zifuchuan {
	public static void main(String[] args) {
		String str="how are you";
		String[] strs=str.split(" ");
		for(int i=0;i<strs.length;i++){
			System.out.print(strs[i]+" ");
		}
		System.out.println();
		for(int i=strs.length-1;i>=0;i--){
			System.out.print(strs[i]+" ");
		}
	}
}

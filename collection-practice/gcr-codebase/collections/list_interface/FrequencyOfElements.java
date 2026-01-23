package list_interface;
import java.util.*;
public class FrequencyOfElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> list=new ArrayList<>();
		System.out.print("Enter size of list : ");
		int n=sc.nextInt();
		System.out.println("Enter elements of the list");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		Map<String,Integer> map=new HashMap<>();
		for(String str:list) {
			map.put(str,map.getOrDefault(str,0)+1);
		}
		System.out.println("Frequency of the elements are : ");
		for(String str:map.keySet()) {
			System.out.println(str+" : "+map.get(str));
		}
		
	}
}

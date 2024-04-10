package week1.homeassignment;

import java.util.Arrays;

public class FindMissingElementInArray {

	public static void main(String[] args) {
		int missingnumber=0;
		int input[] = {1,4,3,2,8,6,7};
		Arrays.sort(input);
for (int i = 0; i < input.length; i++) {
	if(input[i]!=i+1){
		missingnumber=i+1;
		break;
	}
	} 
System.out.println(missingnumber);
	}
}
		
	



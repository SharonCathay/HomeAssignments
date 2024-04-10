package week1.homeassignment;

public class PalindromeOfANumber {

	public static void main(String[] args) {
int input = 1221, output=0, rem;

for (int i = input; i > 0; i=i/10) {
	rem=i%10;
	output=(output*10)+rem;
	
}
if (output == input) {
	System.out.println(input + " is a palindrome");
} else {
    System.out.println(input + " is not a palindrome");
}
	}

}

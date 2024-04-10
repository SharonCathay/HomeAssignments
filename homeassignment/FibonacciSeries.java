package week1.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
  int firstnum=0,secondnum=1,nextnum,range=8;
  System.out.println(firstnum +"\n" + secondnum);
  for (int i = 1; i <= range; i++) {
	  nextnum=firstnum+secondnum;
	  firstnum=secondnum;
	  secondnum=nextnum;
	  System.out.println(nextnum);
	  
}
	}

}

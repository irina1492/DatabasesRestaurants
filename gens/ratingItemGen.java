  import java.util.Random;
  public class ratingItemGen {
  	public static void main(String[] args) {
  		Random rand = new Random();
  		int []USERID = {100001,100002,100003,100004,100005,100006,100007,100008,100009,100010,100011,100012,100013,100014,100015};
		String [] desc = {"meh","k","kms"};
		String out;

		for (int i=0;i<USERID.length ;i++ ) {
			out="INSERT INTO RATING_ITEM \nVALUES (";
			out=out+USERID[i]+", \'20"+(rand.nextInt(8)+10)+"-"+(rand.nextInt(12)+1)+"-"+(rand.nextInt(27)+1)+"\', 2000"+rand.nextInt(49)+", \'"+(rand.nextInt(5)+1)+rand.nextInt(10)+"\', \'"+ desc[rand.nextInt(desc.length)]+"\');";
			System.out.println(out);
		}
  	}
  }
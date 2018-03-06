import java.util.Random;

public class ratingsGen {
	public static void main(String[] args) {
		Random rand = new Random();
		int []USERID = {100001,100002,100003,100004,100005,100006,100007,100008,100009,100010,100011,100012,100013,100014,100015};
		String date ="";
		String [] comment = {"meh","k","kms"};
		String out = "";
		int []RESTID = {2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012};

		for (int i=0;i<RESTID.length;i++ ) {
			for (int j=0;j<8 ;j++ ) {
				out="INSERT INTO RATING \nVALUES (";
				out= out+USERID[rand.nextInt(14)]+", \'20"+(rand.nextInt(8)+10)+"-"+(rand.nextInt(12)+1)+"-"+(rand.nextInt(27)+1)+"\', "+(rand.nextInt(5)+1)+", "+(rand.nextInt(5)+1)+", "+(rand.nextInt(5)+1)+", "+(rand.nextInt(5)+1)+", \'"+comment[rand.nextInt(3)]+"\', "+RESTID[i]+");";
				System.out.println(out);
			}
		}
	}
}
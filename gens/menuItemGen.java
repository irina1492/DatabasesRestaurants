  import java.util.Random;
  public class menuItemGen {
  	public static void main(String[] args) {
  		Random rand = new Random();
		int id=200000;
		String [] name = {"name1","name2","nameR"};
		String [] type = {"M","S","D"};
		String [] cat = {"F","B"};
		String [] desc = {"meh","k","kms"};
		Double price =0.0;
		int []RESTID = {2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012};
		String out;

		for (int i=0;i<RESTID.length;i++ ) {
			for (int j=0;j<4 ;j++ ) {
				out="INSERT INTO MENU_ITEM \nVALUES (";
				out= out+(id+1)+", \'"+name[rand.nextInt(3)]+"\', \'"+type[rand.nextInt(3)]+"\', \'"+cat[rand.nextInt(2)]+"\', \'"+desc[rand.nextInt(3)]+"\', "+rand.nextInt(30)+"."+(rand.nextInt(89)+10)+", "+RESTID[rand.nextInt(11)]+");";
				id++;
				System.out.println(out);
			}
		}
  	}
  }
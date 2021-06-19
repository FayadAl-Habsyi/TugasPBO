package Menu;

public class Halaman2 extends Halaman1 {
	//atribut
		private int a;
		private int b;
		private String c;
		
		//2 method
		public void hobi() {
			String hobi="ngoding";
			System.out.println("Hobi  : "+super.getnama());
		}
		public void mainw() {
				
		}
		
		//membuat getter dan setter
		public int geta() {
			return a;
		}
		public void seta() {
			this.a = a;
		}
		
		public int getb() {
			return b;
		}
		public void setb() {
			this.b = b;
		}
		public String getc() {
			return c;
		}
		public void setc() {
			this.c = c;
		}
		
		public String nilai() {
			String grade="B";
			return grade;
		}
		public String grade() {
			String grade="C";
			return grade;
		}
}

package Menu;

public class Halaman1 {
	//membuat atribut
		private String nama;
		private String npm;
		private String umur;
		private String kelas;
		int nilai;
		String f;
		String g;
		String h;
		
		//membuat method
		public void tampilmenu() {
		System.out.println("Nama  : "+this.nama);
		System.out.println("NPM  : "+this.npm);
		System.out.println("Kelas  : "+this.kelas);
		System.out.println("Umur  : "+this.umur);
		System.out.println("Grade  : "+nilai());
		}
		public void tampil() {
			System.out.print("Nama  : "+this.nama);
			}
		public String nilai() {
			String grade="A";
			return grade;
		}
		public void enu() {
			
		}
		
		//mmebuat 3 contruktor
		public  Halaman1() {		
		}
		public Halaman1(String nama) {
			this.nama = nama;
			this.npm = npm;
		}
		public Halaman1(String nama, String npm, String kelas, String umur) {	
			this.nama = nama;
			this.npm = npm;
			this.kelas = kelas;
			this.umur = umur;
		}
		
		
		//membuat getter & Setter
		public String getnama() {
			return nama;
		}
		public void setnama(String nama) {
			this.nama = nama;
		}
		
		
		public String getnpm() {
			return npm;
		}
		public void setnpm(String npm) {
			this.npm = npm;
		}
		
		
		public String getumur() {
			return umur;
		}
		public void setumur(String umur) {
			this.umur = umur;
		}

		
		public String getkelas() {
			return kelas;
		}
		public void setkelas(String kelas) {
			this.kelas = kelas;
		}
}

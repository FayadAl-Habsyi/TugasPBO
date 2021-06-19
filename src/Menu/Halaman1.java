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
}

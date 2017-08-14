public class Sigma{
 public static void main(String[] args) {

	String soal="";
	int sigma = 0;
	for(int i=0; i<args.length; i++){
		soal = soal + args[i];
		int angka = Integer.parseInt(args[i]);
		sigma += angka;
	}
	 System.out.println(soal +"="+sigma);
 }
}
public class Array1 {
	public static void main(String args[]) { 

	int nilai[]=new int[3]; 
 	nilai[0]=70; 
	nilai[1]=80; 
	nilai[2]=65; 
	double ratarata=0.0; 

 	for(int i=0; i<nilai.length; i++)  
 		ratarata+=nilai[i]; 

 
 	ratarata/=nilai.length; 
 	System.out.println("Nilai rata-rata = " + ratarata); 
 
	} 
} 
/*
kode di atas akan menghasilkan output berupa rata2 dari array nilai
yaitu 70, 80, 65
dimana rata-ratanya adalah 71,6666666667 (bertipe double)
*/
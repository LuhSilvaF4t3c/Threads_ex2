package ex2;

public class Threads2 extends Thread{
	
	public int t;
	public int matrix[][] = new int [3][5];
	
	public Threads2(int t2, int[][] matrix2) {
		
	}
    public void run(){
somalina();
    }
   
    public void somalina() {
	int r = 0;
        while(t<3){
        System.out.println("\n ");
	for(int t = 0; t <= 2; t++){
	Thread Thread1 = new Threads2(t, matrix);
        
	Thread1.start();
	
    for(int i = 0; i < 5; i++){r += matrix[t][i];}
        System.out.println(" "+(t+1)+": "+r);
	}
        }
    }
}

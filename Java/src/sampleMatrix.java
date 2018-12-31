
public class sampleMatrix {

	static int array[][] = {
			{0,0,1,0},
		    {0,0,0,0},
		    {0,1,0,1},
		    {0,1,0,0}};
	static boolean depedency [] = new boolean [4]; 
	public static void main(String[] args) throws Throwable {
		Throwable t= new Throwable();
		
		iterate2X(0);
		throw new Throwable();
	}
	
	
	
	public static void iterate2X (int row){
		for (int i = 0 ; i < 4 ; i++){
			if (depedency [row] == false && array [row][i] == 1){
				iterate2X(i);
			}
		}
		if (!depedency[row])
			System.out.print(row+1);
		depedency[row] = true;
		
	}

}

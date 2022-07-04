package Assignment7;

public class Isaland {

	public static void main(String[] args) {
		int arr[][] = { //need to spit : use divide and conquire
				{ 1, 1, 0, 1, 0, 1, 0 },
				{ 1, 0, 1, 0, 1, 0, 1 }, 
				{ 0, 1, 0, 1, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 1 }, 
				{ 0, 1, 0, 1, 1, 0, 1 }, 
				{ 1, 0, 1, 1, 1, 0, 1 } };
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					
					if ((i - 1 < 0 || arr[i - 1][j] == 0) && 
						(j - 1 < 0 || arr[i][j - 1] == 0)) {
						
						count = count+1;
						

					}
				}
				
			}
			
		}
		System.out.println("Total island count is : "+ count);
	}

}

public class EffatA2{
	public static void main(String[]args){
		double arr[] = new double[]{25.45,50.23,30.31,20.31,40.31};
		int i=0; double largest=-1;
		
		for(i=0;i<5;i++){
			if(arr[i]>largest){largest=arr[i];}
		}
		System.out.println("The given array : ");
		for(i=0;i<5;i++){System.out.print(arr[i]+" ");}

		System.out.println("\nThe largest number of the Array is = "+largest);
	}
}
import java.awt.Point;
import java.util.ArrayList;

public class DrawClient {
	 public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	           
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	            drawArray(arr);
	            System.out.println("aa");
	        }  
	    }  
	static ArrayList<CustomPoint> points;
	
	static int[] arr={1,2,3,12,10,11,2,3,4,1,15,5,3,1};
	
	public static void drawArray(int[] arr){
		
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StdDraw.clear();
		
		double cnt=0;
		for(int t : arr){
			cnt = cnt+0.05;
			StdDraw.filledRectangle(cnt, 0.2,0.01, 0.01+t*0.010);
		
		}
		

	//	
	//	double rectHeight =  0.01+arr[0]*0.010;
	//	double rectHeight2 =  0.01+arr[1]*0.010;

		//double rectHeight3 = 0.01+arr[2]*0.010;
		//double rectHeight4 =  0.01+arr[3]*0.010;

		//StdDraw.filledRectangle(0.1, 0.0,0.01, rectHeight);
		//StdDraw.filledRectangle(0.2, 0.0,0.01, rectHeight2);

		//StdDraw.filledRectangle(0.3, 0.0,0.01, rectHeight3);
		//StdDraw.filledRectangle(0.4, 0.0,0.01, rectHeight4);

	}
	
	public static void main(String[] args){
		Point point = new Point();
		point.setLocation(2, 54);
		StdDraw.setPenColor(StdDraw.BOOK_RED);
		StdDraw.setPenRadius(0.010);
		drawArray(arr);
		selectionSort(arr);
	//	StdDraw.filledRectangle(2, 2, 1.01, rectHeight4);

	}
}

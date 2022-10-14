package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height) {
        //Draw a Rectangle
    for (int i= 0; i <width; i++) {
    	System.out.print("#");
    }
    System.out.println();
    for (int j=0; j < height-2; j++) {
    	System.out.print("#");
    	for (int i =0; i < width - 2; i++) {
    		System.out.print(" ");
    	}
    	if (width > 1) {
    		System.out.println("#");
    	} else {
    		System.out.println();
    	}
    }
        
    if (height> 1) {
    	for (int i = 0; i< width; i++) {
    		System.out.print("#");
    	}
    	System.out.println();
    }
    }
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        int i,j;
        for (i=1;i<=leg;i++)
        	{
        	for(j=i;j>=1;j--)
        	{
        		System.out.print("8");
        	}
        	System.out.println(" ");
        }
        
    }
}

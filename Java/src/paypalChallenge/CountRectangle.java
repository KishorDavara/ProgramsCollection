package paypalChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CountRectangle {
   static int N = 4; 
   static int []squareCount = new int[N];
    public static int getRectangleCount(List<Point> points) {
    	
    	for(int i = 2; i<=N;i++) {
    		for(int j = 0; j < points.size();j++) {
    		  //Point a = points.get(j);
    		  int x = points.get(j).getX();
    		  int y = points.get(j).getY();
    		  for(int k = 1 ; k < i*i ; k++) {
    			int a = x ;
    		  }
    		}
    	}
    	
    	
    	
    	return 0;
        
//        if(coOrdinates.length < 1 || coOrdinates.length > 100)
//            return -1;
//        
//        final int MIN_POINTS_TO_CREATE_RECTANGLE = 4;
//        
//        // can't make a rectangle with less than 4 points
//        if(coOrdinates.length < MIN_POINTS_TO_CREATE_RECTANGLE)
//            return 0;
//        
//        final Point []points = new Point[coOrdinates.length];
//        
//        for(int i = 0; i < coOrdinates.length; i++) {
//            if(coOrdinates[i].length > 2)
//                return -1;
//            points[i] = new Point(coOrdinates[i][0], coOrdinates[i][1]);
//        }
        
        //Arrays.sort(points);
          
//        int rectangleCount = 0;
//        for(int i = 0; i < points.length; i++) {
//            Point leftDown = points[i];
//            
//            for(int j = i+1; j < points.length; j++) {
//                Point leftUp = points[j];
//                
//                if(leftDown.getX() == leftUp.getX()) {
//                    
//                    for(int k = j+1; k < points.length; k++) {
//                        Point rightDown = points[k];
//                        
//                        if(leftDown.getY() == rightDown.getY()){
//                            Point probableRightUp = new Point(rightDown.getX(), leftUp.getY());
//                            
//                            if(probableRightUp.existsIn(points))
//                                rectangleCount++;
//                            
//                        }
//                        
//                    }
//                    
//                }
//                
//            }
//            
//        }
//        return rectangleCount;
    }
    
    public static void main(String []args) {
    	
    	int point[][] = {{0,0},{0,3},{1,1},{1,2},{1,3},{2,0},{2,1},{2,2},{2,3},{3,1},{3,2},{3,3} };
    	List<Point> points = new ArrayList<>();
    	points.add(new Point(0, 0));points.add(new Point(0, 3));points.add(new Point(1, 1));points.add(new Point(1, 2));
    	points.add(new Point(1, 3));points.add(new Point(2, 0));points.add(new Point(2, 1));points.add(new Point(2, 2));
    	points.add(new Point(2, 3));points.add(new Point(3, 1));points.add(new Point(3, 2));points.add(new Point(3, 3));
    	System.out.println(getRectangleCount(points));
    }
    
}
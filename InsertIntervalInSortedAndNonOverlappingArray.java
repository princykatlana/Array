package array;

import java.util.ArrayList;
import java.util.*;



//
//Input: Set : [1, 3], [6, 9]
//        New Interval : [2, 5] 
//Output: [1, 5], [6, 9]
//The correct position to insert new interval 
//[2, 5] is between the two given intervals. 
//The resulting set would have been 
//[1, 3], [2, 5], [6, 9], but the intervals 
//[1, 3], [2, 5] are overlapping. So, they are 
//merged together in one interval [1, 5].
public class InsertIntervalInSortedAndNonOverlappingArray {
	
	private static List<Interval> insertNewInterval(List<Interval> intervals, Interval newInterval) {
		
		Set<Interval> ans = new HashSet<Interval>();
		
		int left = 0;
		int right = 0;
		int startToRemove= 0;
		int endToRemove = 0;
		
		for (Interval interval : intervals) {

			//find left 
			if(interval.start < newInterval.start)
			{
				if(interval.end > newInterval.start) {
					startToRemove = interval.start;
					left = Math.min(interval.start, newInterval.start);
				}
			}

			//find right 
			if(interval.end > newInterval.end)
			{
				if(interval.start < newInterval.end) {
					endToRemove = interval.end;
					right = Math.max(interval.end, newInterval.end);
				}
			}
		}
		
		Interval intervalToinsert = new Interval(left,right);
		
		for (Interval interval : intervals) {
			
			if(interval.start == startToRemove || interval.end == endToRemove) {
				ans.add(intervalToinsert);
			}else {
				ans.add(interval);
			}
			
		}
		return new ArrayList<Interval>(ans);
	}
	
	
	 public static void main(String[] args)
	    {
	        List<Interval> intervals = new ArrayList<>();
	        
	        
	        intervals.add(new Interval(1, 2));
	        intervals.add(new Interval(3, 5));
	        intervals.add(new Interval(6, 7));
	        intervals.add(new Interval(8, 10));
	        intervals.add(new Interval(12, 16));
	        
	        Interval newInterval = new Interval(4, 9);
	 
	        List<Interval> ans  = insertNewInterval(intervals, newInterval);
	 
	        for (int i = 0; i < ans.size(); i++) {
	            System.out.println(ans.get(i).start + ", "
	                               + ans.get(i).end);
	        }
	    }

}

 // Contains Duplicate : Check if a value appears atleast twice
 /*
Example 1:
Input: nums = [1, 2, 3, 1]
Output: true.
Explanation: 1 appeared two times in the input array.

Example 2: 
Input: nums = [1, 2, 3, 4]
Output: false
Explanation: input array does not contain any duplicate number. 
 
 
 */
 
 
 import java.util.*;
 
 
 class ContainsDuplicateElement{
     

       //Approach 1 Bruteforce method :
      static boolean containsDuplicateApproach1(int[] nums){
		   
		  int n = nums.length;
		  
		  for(int i = 0; i< n;i++){
			  
			  for(int j = i+1 ; j< n ;j++){
				  
				  if(nums[i] == nums[j] ){
					  return true;
				  }
				  
			  }
		  }
		  
		  return false;
		  
	  }
      // Time complexity - O(n2) because we traversing whole array again and again for every integer
	  // Space Complexity - O(1)  Since , we are not using any extra space 
	  
	  
	  //Approach 2 : 
	   static boolean containsDuplicateApproach2(int[] nums){
		   
		   Arrays.sort(nums);
		   
		   for(int i = 0;i<nums.length-1;i++){
			       if(nums[i] == nums[i+1])
					   return true;
		   }
		  return false;
	  }
      // Time complexity - O(N logN) , Sorting takes N log N where N is length of the array 
	  // Space complexity - O(1) , Since we are not using any extra space if we are not extra space taken by sorting
       
	   
	   
	   // Approach 3 : 
	    static boolean containsDuplicateApproach3(int[] nums){
       		
			HashSet<Integer>  hs = new HashSet<Integer>();
			
			for(int i = 0 ; i< nums.length ; i++){
				hs.add(nums[i]);
			}
			
			if(hs.size() < nums.length){
				return true;
			}
			
			
		 return false;
	  }
	  
	  // Time Complexity:  O(N), where N is the length of the array. As searching hash_set takes O(1)
      // Space Complexity: O(N), Where N is the number of elements stored in the set
        

    public static void main(String[] arg){

       ContainsDuplicateElement  obj = new ContainsDuplicateElement();
	    
	    int nums[]= {1, 2, 3, 1};
	    
	    boolean res1 = obj.containsDuplicateApproach1(nums);
	    
	    System.out.println(res1);
		
		
		boolean res2 = obj.containsDuplicateApproach2(nums);
	    
	    System.out.println(res2);
		
		
		boolean res3 = obj.containsDuplicateApproach3(nums);
	    
	    System.out.println(res3);
   		
	 
 }
 
 
 }
 
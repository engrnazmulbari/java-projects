package com.com;

public class BinarySearch {

	public static void main(String[] args) {
		int sortedArray[] = {1,2,3,4,5,6,7,8,9,10,11,100};
		int findnumber = 100;
		int sizeOfArray = sortedArray.length;
		int index = new BinarySearch().findIndex(sortedArray,findnumber,sizeOfArray);
		System.out.println("Index : "+index);
	}
	
	public int findIndex(int sortedArray[],int findNumber, int sizeOfArray){
		int startIndex =0;
		int lastIndex = sizeOfArray -1;
		
		int midIndex = (startIndex+lastIndex)/2;
		
		while(startIndex<=lastIndex){
			if(sortedArray[midIndex]==findNumber){
				return midIndex;
			}else if(findNumber > sortedArray[midIndex]){
				startIndex = midIndex+1;
			}else{
				lastIndex = midIndex -1;
			}
			midIndex = (startIndex+lastIndex)/2;
		}
		return -1;
		
	}

}

package com.arrays.maxConsecutiveOnesZeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	if(nums.length>1) {
	        List<Integer> data1=new ArrayList<Integer>();
	        List<Integer> data2=new ArrayList<Integer>();
	       
	        for(int i=0;i<nums.length;i++){
	           if(nums[i]==1){
	               data1.add(i);
	           }else{
	               data2.add(i);
	           }            
	        }
	        
	        System.out.println("the data1 is"+data1);
	        System.out.println("the data2 is"+data2);
	       
	        int one=compare(data1);
	        
	        System.out.println("the ones are"+one);
	        
	        int zero=compare(data2);
	        
	        System.out.println("the zeros are"+zero);
	        
	        int max_occur=(one>zero)?one:zero;
	        System.out.println("the max repeated are"+max_occur);
	       
	        return max_occur;
    	}else {
    		return 0;
    	}
    }
    
    private int compare(List<Integer> data1){
        int occurance=0;
        List<Integer> maxoccur=new ArrayList<>();
        int max=0;
        int temp=-1;
        for(int a:data1){
            if(temp==-1){
                 temp=a;
            }else if(a==temp+1){
                occurance++;
                temp=a;
            }else{
                maxoccur.add(occurance);
                occurance=0;
                temp=a;
            }
        }
        maxoccur.add(occurance);
        Collections.sort(maxoccur);
        System.out.println("the max occur****"+maxoccur);
        
        return (maxoccur.get(maxoccur.size()-1))+1;
    }
}

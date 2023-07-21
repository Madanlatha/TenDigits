package tendigitSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Digit {
	public static boolean customIsLesser(int a, int b){
		        int aTens = (a/10);
		        int bTens = (b/10);
		        
		        if(aTens==bTens){
		            if(a<b){
		                return false;
		            }else{
		                return true;
		            }
		        }else if(aTens<bTens){
		            return true;
		        }else{
		            return false;
		        }
		    }
		    public static void main(String[] args) {
		    	Scanner sc=new Scanner(System.in);
		    	int n=sc.nextInt();
		        int[] array = new int[n];
		        for(int i=0;i<n;i++) {
		        	array[i]=sc.nextInt();
		        }
		        for (int i = 0; i < array.length-1; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		                int temp = 0;
		                if (customIsLesser(array[j],array[i])) {
		                    temp = array[i];
		                    array[i] = array[j];
		                    array[j] = temp;
		                }
		            }
		        }

		        
		            System.out.println(Arrays.toString(array));
		        

		    }
		}
	



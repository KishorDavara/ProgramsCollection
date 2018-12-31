package Arrays;
/**
 *
 * @author KK Davara
 */
public class FindTwoMissingNumbers {

public static int[] findTwoMissingNumber(int a[],int n)
{
    /*int []missing=new int[2];
    int total=(n+2)*(n+3)/2;
    int sum=0;
    for(int i=0;i<n;i++)
       sum+=a[i];
    int firstExpectedmiss=((total-sum)/2)+1;
    for(int i=firstExpectedmiss-2;i<n;i++)
    {
        if(a[i]==firstExpectedmiss)
        {
            firstExpectedmiss+=1;
        }
        else
        {
            break;
        }
    }
    missing[0]=(total-sum)-firstExpectedmiss;
    missing[1]=firstExpectedmiss;
    return missing;*/
	int []missing=new int[2];
	//step1   total sum from 1 to n
	int total = n*(n+1)/2;
	//step2 sum of the available numbers
	int sum = 0;
	for(int i=0;i<n-2;i++){
		sum+=a[i];
	}
	//step3 average of missing numbers
	int avg = (total - sum)/2;
	//step4  find the sum of numbers smaller than average and larger than average
	int smallerThanAverage = 0;
	int greaterThanAverage = 0;
	for(int i=0;i<n-2;i++){
		if(a[i]<=avg)
			smallerThanAverage += a[i];
		else
			greaterThanAverage += a[i];
	}
	//step5 first missing number (sum upto average - smallerThanAverage)
	missing[0] = (avg*(avg+1)/2) - smallerThanAverage;
	//step6 second missing number (sum from average+1 to n - greaterThanAverage)
	//missing[1] = (total - (avg*(avg+1)/2)) - greaterThanAverage;
	
	 // or step6 as we got the first missing number we can easily find 2nd from it
	 missing[1] = total - (sum+missing[0]);
	
	return missing;
 }
    public static void main(String[] args) {
        //int a[]={1,2,3,5,6,8};
        int a[]={1,2,3,4,5,6,7,8,9,11,12,13,14,15,16};
        int missing[]=findTwoMissingNumber(a,a.length+2);
        System.out.println("Missing numbers in the given array are "+missing[0]+" and "+missing[1]);
    }
 }

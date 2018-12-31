package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("CMPL00000056","CMPL00000057","CMPL00000057","CMPL00000060","CMPL00000023","CMPL00000008","CMPL00000016","CMPL00000020","CMPL00000009","CMPL00000065","CMPL00000001","CMPL00000048","CMPL00000050","CMPL00000051","00003801","CMPL00000017","CMPL00000004","00008260","CMPL00000278","00004140","CMPL00000019","CMPL00000039","CMPL00000015","00009340","CMPL00000011","CMPL00000542","CMPL00000021","CMPL00000052","CMPL00000053","CMPL00000041","CMPL00000026","CMPL00000042","CMPL00000031","CMPL00000055","CP1235000101_14","CMPL00000012","00011400","CMPL00000225","CMPL00000224","CMPL00000468","CMPL00000228","CMPL00000227","CMPL00000226","CMPL00000006","00005963","00004167","CMPL00000005","00005964","00004166","CMPL00000264","CMPL00000263","CMPL00000262","CMPL00000261","CMPL00000034","CMPL00000007","CMPL00000013","CMPL00000058","CMPL00000014","CMPL00000059","CMPL00000059","CMPL00000543","CMPL00000024","CMPL00000025","CMPL00000478","CMPL00000046","CMPL00000032"));
        System.out.println("ArrayList Size: "+arrayList.size());
		//System.out.println("Original ArrayList :\n");
//        for(String el:arrayList){
//        	System.out.println(el);
//        }
        
        LinkedHashSet<String> lh= new LinkedHashSet<String>();
        lh.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(lh);
        System.out.println("ArrayList Size: "+arrayList.size());
        System.out.println("Unique element ArrayList :\n");
        
       for(String el:arrayList){
      	System.out.println(el);
       }
        
	}

}

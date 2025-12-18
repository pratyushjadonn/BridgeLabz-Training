package coreJava;

public class CheckProfitLoss {

	public static void main(String[] args) {
	    double cp=129;    
	    System.out.print("The Cost Price is INR "+cp);
	    double sp=191;
	    System.out.print(" The Selling Price is INR "+sp);
	    System.out.println();
	    if(sp>cp) {
	    	double profit=sp-cp;
	    	double percent=(profit/cp)*100;
	    	System.out.println(" The Profit is INR "+profit+" The Profit Percentage is "+percent);
	    }
	    if(cp>sp) {
	    	double loss=cp-sp;
	    	double percent=(loss/cp)*100;
	    	System.out.println("The Loss is INR "+loss+" The Loss Percentage is "+percent);
	    }
	    if(sp==cp) {
	    	System.out.println("There is No Profit No Loss");
	    }
	}

}

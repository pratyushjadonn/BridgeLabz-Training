package coreJava;

public class VolumeOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=6378;
		double volume=(4.0/3)*Math.PI*Math.pow(r, 3);
		System.out.println("The volume of Earth is "+volume+" cubic Kilometer");
		System.out.println("The volume of Earth is "+(volume*0.239913)+" cubic miles");
	}
}

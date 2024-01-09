class Frequency1{
	public static void main(String[] nnn){
	int[] a={2,3,2,6,3,5};
	int maxE= a[0];
	for(int i=1;i<a.length;i++){
		if(a[i]>maxE){
			maxE=a[i];
		}
	}
		int[] frequencies=new int[maxE + 1];
		for(int i=1;i<a.length;i++){
			frequencies[a[i]]++;
		}
		
		for(int i=0;i<maxE;i++){
			if(frequencies[i]>0){
				System.out.println("Input:"+i);
				System.out.println("Output:"+frequencies[i]);
			}
		}
	}
}
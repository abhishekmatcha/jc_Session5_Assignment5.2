package mypack;
	
	class Main1 {
		public static void main(String args[]) {
			VariableStack mystack = new VariableStack(5);
			VariableStack mystack3 = new VariableStack(8);
	
	 for(int i=0; i<12; i++)
		 mystack.push(i);
	 for(int i=0; i<20; i++) 
		 mystack3.push(i);
	System.out.println("Stack in mystack:");
	for(int i=0; i<12; i++)
		System.out.println(mystack.pop());
	System.out.println("Stack in mystack2:");

}
}
	
	
	
	
	
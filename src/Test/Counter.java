package Test;

public class Counter {
	
		private Integer cnt1;
		private Integer cnt2;
		
		public Counter() {
		this.cnt1= 1;
		this.cnt2= 2;
		
		}
		
		public int getValue(int i) {
			
		
		if( i== 1){
			
		return cnt1++;
		} else if( i== 2 ){
		return cnt2++;
		}
		return-1;
		}

}

package ejerciciosIngenieriaDirecta;

import java.util.Collection;

public class Ej1 {

	public class A{
		private B b;
		private int a1;
		private float a2;
		
		public void af(int a, float b) {
			
		}
		public int ag() {
			return 0;
		}
	}
	
	public class B{
		private C c;
		public void bf(String a) {
			
		}
		
		protected void bg() {
			
		}
	}
	public class C{
		private Collection<B> bs;
				String c1;
				
		public void cf(int a) {
			
		}
	}
	
	public class D extends B{
		protected void bg() {
			
		}
		public int df() {
			return 0; 
		}
	}

}

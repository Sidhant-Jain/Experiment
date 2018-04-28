package declarationNdAccessModifier;

public abstract class AbstractClassTest {
	public abstract void m1();
	public abstract void m2();
}

abstract class SubTest extends AbstractClassTest{
	public void m1(){
		
	}
	
	public abstract void m2();
}

class SubSubTest extends SubTest{
	public void m2(){
		
	}
}


class Main{
		public static void main(String[] args){
//			AbstractClassTest act = new AbstractClassTest();
//			SubTest st = new SubTest();
			SubSubTest sst = new SubSubTest();
			
		}
}
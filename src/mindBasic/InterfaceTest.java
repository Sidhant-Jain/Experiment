package mindBasic;

public interface InterfaceTest {

}
interface I1{
	void m1(int x, int y);
}

interface I2{
	void m1(int x, int y);	
}

interface I3 extends I2, I1{
	void m1(int x, int y);
}
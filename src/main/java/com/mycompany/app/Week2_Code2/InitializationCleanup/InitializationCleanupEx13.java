package com.mycompany.app.Week2_Code2.InitializationCleanup;

class Cup {
    private void print(String string) {
    }
	Cup(int marker) {
		print("Cup(" + marker + ")");
	}
    void Hadd1(int marker) {
		print("Hadd1(" + marker + ")");
	}
}

class Cups {
    private void print(String string) {
    }
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		print("Cups()");
	} 
}

public class InitializationCleanupEx13 {
    private static void print(String string){
    }
	public static void main(String[] args) {
		print("Inside main()");
		Cups.cup1.Hadd1(99); // (1)		
	}
	static Cups cups1 = new Cups(); // (2)
	static Cups cups2 = new Cups(); // (2)
}
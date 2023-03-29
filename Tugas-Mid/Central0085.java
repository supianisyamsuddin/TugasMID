 /*	Nama   		: Supiani Syamsuddin
	NIM   		: 13020210085 */

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0085 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0085 obj = new Central0085();
        obj.aaa();
        System.out.println("main");
    }
}
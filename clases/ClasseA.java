public class ClasseA {

    private int a;
    private int b;

    public ClasseA() {
        a = 10;
        b = 5;
    }

    public ClasseA(int vp) {
        this(vp, 0);
    }

    public ClasseA(int vp, int vs) {
        a = vs;
        b = vp;
    }
}
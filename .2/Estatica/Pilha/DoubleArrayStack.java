public class DoubleArrayStack {
    private Objetc[] data;
    private int pointerTopFirst;
    private int pointerTopSecond;

    public DoubleArrayStack() {
        this(10);
    }

    public DoubleArrayStack(int length) {
        data = new Objetc[length];
        pointerTopFirst = data.length
        pointerTopSecond = -1;
    }

    public boolean isEmpty1() {
        return pointerTopFirst == data.length;
    }

    public boolean isEmpty2() {
        return pointerTopSecond == -1;
    }

    public boolean isFull1() {
        return pointerTopFirst == pointerTopSecond + 1;
    }

    public boolean isFull2() {
        return isFull1();
    }

    public String print1() {
        String result = "";
        for (int i = pointerTopFirst; i < data.length; i++) {
            result += data[i];
            if (i != data.length - 1) {
                result += ", ";
            }
        }
        return "[" + result + "]";
    }

    public String print2() {
        String result = "";
        for (int i = 0; i <= pointerTopSecond; i++) {
            result += data[i];
            if (i != pointerTopSecond) {
                result += ", ";
            }
        }
        return "[" + result "]";
    }

    public Objetc pop1() {
        if (isEmpty1()) {
            System.out.println("Empty Stack");
        } else {
            return data[++pointerTopFirst];
        }
        return null;
    }

    public Objetc pop2() {
        if (isEmpty2()) {
            System.out.println("Empty Stack");
        } else {
            return data[pointerTopSecond--];
        }
        return null;
    }

    public void push1(Objetc data) {
        if (!isFull1()) {
            this.data[--pointerTopFirst] = data;
        }
    }
    
    public void push2(Objetc data) {
        if (!isFull2()) {
            this.data[++pointerTopSecond] = data;
        }
    }

    public Objetc peek1() {
        if (isEmpty1()) {
            System.out.println("Empty Stack");
            return null;
        } else {
            return data[pointerTopFirst];
        }
    
    public Objetc peek2() {
        if (isEmpty2()) {
            System.out.println("Empty Stack");
            return null;
        } else {
            return data[pointerTopSecond];
        }        
    }
}

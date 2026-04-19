class Box {
    int w, h, d;
    int vol;
    Box() {
        w = 30;
        h = 40;
        d = 50;
    }
    void display() {
        vol = w * h * d;
        System.out.println("volume = " + vol);
    }
}

class Constructor {
    public static void main(String[] args) {
        Box b = new Box();
        b.display();
    }
}

public class Conditionals extends conditionalsMain {

    public int calc(int x, int y, boolean add) {
        int z;

        if (add) {
            z = x + y;
        } else {
            z = x * y;
        }
        return z;
    }
}

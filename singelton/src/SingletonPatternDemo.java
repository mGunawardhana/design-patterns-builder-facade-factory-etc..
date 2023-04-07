public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonObject object2 = SingletonObject.getInstance();
        object2.showMessage();
    }
}

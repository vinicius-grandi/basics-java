public class HelloWorld {
    int num;
    private void greetings() {
        for (int i = 0; i < 10; i += 1) {
            System.out.println("Hello world!");
        }
        this.num = 1 + 1;
    }
    // the main method will run first
    public static void main(String[] args) {
        // all lines of code should end with a semicolon
        HelloWorld hello = new HelloWorld();
        hello.greetings();
    }
}

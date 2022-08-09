public class test {
    public static void main(String[] args) {
        stopWatch test1 = new stopWatch();
        test1.start();
        test1.stop();
        System.out.println(test1.getElapsedTime());
    }
}

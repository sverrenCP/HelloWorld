public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello world");
        try { Thread.sleep(2000); } catch (Exception e) { e.printStackTrace(); }
        System.out.println("Bye world");
    }
    
}

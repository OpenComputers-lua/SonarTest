public class Main {
    public static void main(String[] args) {
        StrBuilder sb = new StrBuilder(StrBuilder.LETTERS, 5);
        for(int i = 0; i < 10000; i++) {
            sb.increment();
            System.out.println(sb.getReversed());
        }
        try {
            sb.set("ABOBA");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(sb.getReversed());
    }
}
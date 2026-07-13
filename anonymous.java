class food{
    void taste(){
        System.out.println("normal taste");
    }
}




public class anonymous {
    public static void main(String[] args) {
        food m = new food(){
            void taste(){
                System.out.println("extra spicy taste");
            }
        };
        m.taste();
    }
}

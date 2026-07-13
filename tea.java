class food{
    void taste(){
        System.out.println("normal tea");
    }
}


public class tea {
    public static void main(String[] args) {
        food t = new food(){
            void taste(){
                System.out.println("special tea with extra sugar");
            }
        };
        t.taste(); 
    }
    
}

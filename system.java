 class notification{
    void send(){
        System.out.println("notification coming");
    }


    
}
class email extends notification{
    void send(){
        System.out.println("mail");
    }
}
class sms extends  notification{
    void send(){
        System.out.println("sms");
    }
}
class whatsapp extends notification{
    void send(){
        System.out.println("whatsapp");
    }
}
public class system{
    public static void main(String[] args) {
        notification n ;
                n=new notification();

                 n.send();

        n=new email();
                n.send();

      n=new sms();
               n.send();

       n=new whatsapp();
         n.send();

        
        
    }
}

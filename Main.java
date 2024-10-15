public class Main {
   public   static  void main(String[]args){ 
       Flipkart f=new Flipkart();
        // i need object   to pass here 
         BlueDart b =new BlueDart();
       f.setCourier(b);
       f.deliver(11211);
   }
  
}

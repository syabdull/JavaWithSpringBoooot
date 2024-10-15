public class Flipkart {
   private Courier c;
  //making both constructor injection  and setter injection 
    Flipkart(){ // no argument constucotr

    }
    Flipkart(Courier c){ //paramaterized method 
       this.c=c;
    }
    //deliver method of flipkar 

    //using setter injection 
    public void setCourier(Courier c){
          this.c=c;
    }
     public void deliver(int pid){
         c.deliver(pid);
     }
      
}

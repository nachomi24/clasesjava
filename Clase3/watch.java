public class watch {
     String owner;
     int length;
     boolean isCharged;
    
     public watch (String owner, int length, boolean isCharged){
         this.owner = owner;
         this.length = length;
         this.isCharged = isCharged;
     }
 
     public void giveOwner(){
         System.out.println("The owner of the watch is: " + owner);
     }
    public void giveTime(){
        System.out.println("The time is: ");
        System.out.println(" ______________ ");
        System.out.println("|  _     _  _  |");
        System.out.println("| |_| o | | _| |");
        System.out.println("| |_| o |_| _| |");
        System.out.println("|______________|");
    }
    public void giveAlarm(){
        System.out.println("New notification: beeeeep ");
    }
     }
 
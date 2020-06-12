public class thirdclass {
    public static void main(String[] args) {
        int length = 18;
        watch watch1 = new watch ("Nahomi", length, true);
        watch1.giveTime();

        watch watch2 = new watch ("Steve Jobs", 24, false);
        watch2.giveOwner();

        watch watch3 = new watch ("Elon Musk", 20, true);
        watch3.giveAlarm();
    }

    

    }

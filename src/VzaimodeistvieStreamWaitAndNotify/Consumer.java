package VzaimodeistvieStreamWaitAndNotify;

public class Consumer implements Runnable {
    public Consumer(Parking parking) {
        this.parking = parking;
    }

    private Parking parking;

    public Consumer(MetodeWaitAndNotify.Parking parking) {
    }


    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            parking.out();
        }
    }

}

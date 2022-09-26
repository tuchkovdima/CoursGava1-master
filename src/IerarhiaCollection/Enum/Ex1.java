package IerarhiaCollection.Enum;

public class Ex1 {
    public static void main(String[] args) {
        WorkDay workDay = new WorkDay(Weekday.sunday);
        workDay.dataInfo();

    }
}

enum Weekday{
    Monday("bad"),
    Sanday("good"),
    Tuersday("good"),
    wednesday("good"),
    suturday("good"),
    sunday("good");

    private String mood;

   private Weekday(String mood) {
        this.mood = mood;
    }
    String getMood(){
       return mood;
    }
}

class WorkDay {
    public WorkDay(Weekday weekday) {
        this.weekday = weekday;
    }


    Weekday weekday;

    void dataInfo(){
        switch (weekday){
            case Monday :
            case sunday:
            case Tuersday:
            case wednesday:
                System.out.println("работать иди");
                break;
            case Sanday:
            case suturday:
                System.out.println("otdih");

        }
    }
}

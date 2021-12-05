package Practice;

enum Day {
    SAT,
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI;
}
public class LearnEnum {
    Day day;

    public LearnEnum(Day day){
        this.day = day;
    }
    public void dayIsLike(){
        switch (day){
            case MON:
                System.out.println("Monday are good for work");
                break;
            case FRI:
                System.out.println("Friday is for pray");
                break;
            case TUE:
                System.out.println("Tuesday is for Study");
                break;

        }
    }
}

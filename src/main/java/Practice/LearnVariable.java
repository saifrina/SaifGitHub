package Practice;

public class LearnVariable {

    public void intVariables(){
        int salary = 1000;
        String firstName = "Saiful";
        float hight = 5.6f;

        System.out.println("My salary is "+ salary);
        System.out.println("My first name is"+ firstName);
        System.out.println("My hight is" + hight);
    }
    public void LearnBoolean(){
        boolean RedIsStop = true;
        boolean GreenIsGo = true;
        boolean YellowIsPrep = true;
        boolean GreenIsStop = false;
        System.out.println("Green light is for Go -" + GreenIsGo);
        System.out.println(" Red light is for Stop -" + RedIsStop);
        System.out.println("Yellow is for preparetion -" +YellowIsPrep);
        System.out.println("Green light is for Stop -"+ GreenIsStop);
    }
    public int AddNumbers(int a, int b) {
        int sum = a + b;
        return sum;

    }
    public  int AddNumbers(){
    int a = 6;
    int b = 9;
    int sum = a + b;
    return sum;
    }


}

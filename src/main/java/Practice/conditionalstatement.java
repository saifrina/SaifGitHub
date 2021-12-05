package Practice;

public class conditionalstatement {
    public void Switchstatements(char grade){
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Normal");
                break;
            case 'C':
                System.out.println("mutamuti");
            case 'D':
                System.out.println("Ekebare kharap");
        }
        System.out.println("Your grade is :"+grade);


    }
    public void printGrades(char grade){
        if(grade == 'A'){System.out.println("Excelent");
    }else if (grade == 'B'){
            System.out.println("mutamuti");}
    else if (grade == 'C') {
        System.out.println("not good");
        }

        }
}

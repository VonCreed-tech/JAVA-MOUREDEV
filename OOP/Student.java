package OOP;

public class Student {
    int score;

    public Student(int score){
        this.score = score;
    }

    public void getApproved(){
        if (score >= 60){
            System.out.println("Approved");        
        }else{
            System.out.println("Rejected");
        }
    }
    
}

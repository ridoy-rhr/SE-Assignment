public class Teacher extends Person {
    
    String qualification;
    private static Teacher instance = new Teacher();

    private Teacher(){

    }

    public static Teacher getInstance(){
        return instance;
    }
                          
            void show2(){
                show1();
                System.out.println(qualification);
            }
           
}


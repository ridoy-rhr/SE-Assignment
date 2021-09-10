public class Teacher extends Person {
    
    String qualification;
    private static Teacher instance;

    private Teacher(){

    }

    public static Teacher getInstance(){
        
            if (instance == null){
                instance = new Teacher();
            }
            return instance;
        
        
    }
                          
            void show2(){
                show1();
                System.out.println(qualification);
                
            }
           
}


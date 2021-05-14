package Week_5;

public class homework_2 {
    static  class Student{
        String study;
        Student(String study){
            this.study=study;
        }
        void ShowInfo(){
            System.out.println(study);
        }
    }

    public static void main(String[] args) {
        class CSStudent extends Student {
            CSStudent(){
                super("study Coding");
            }
            public void ShowInfo(){
                System.out.println("CSStudent : "+study);
            }
        }
        class KorStudent extends Student {
            KorStudent(){
                super("study Korean");
            }
            public void ShowInfo(){
                System.out.println("KorStudent : "+study);
            }
        }
        class EngStudent extends Student {
            EngStudent(){
                super("study English");
            }
            public void ShowInfo(){
                System.out.println("EngStudent : "+study);
            }
        }
        class GraduateStudent extends Student {
            GraduateStudent(){
                super("get a job");
            }
            public void ShowInfo(){
                System.out.println("GraduateStudent : "+study);
            }
        }

        Student s1 = new CSStudent();
       Student s2 = new KorStudent();
       Student s3 = new EngStudent();
       Student s4 = new GraduateStudent();

       s1.ShowInfo();
       s2.ShowInfo();
       s3.ShowInfo();
       s4.ShowInfo();

    }
}

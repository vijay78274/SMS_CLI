import java.util.*;
class Student{
    int id, marks;
    String name;
    Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    Student(){}
    Scanner sc=new Scanner(System.in);
    public void add(List<Student> list){
        System.out.print("Enter id of Student: ");
        int id = sc.nextInt();
        System.out.println();
        System.out.print("Enter name of Student: ");
        String name = sc.next();
        System.out.println();
        System.out.print("Enter marks of Student: ");
        int marks = sc.nextInt();
        Student student = new Student(id,name,marks);
        list.add(student);
    }
    public void delete(List<Student> list){
        System.out.print("Enter id of Student you want to delete: ");
            int id = sc.nextInt();
            int ind=-1;
            for(int i=0;i<list.size();i++){
                if(list.get(i).id == id){
                    ind=i;
                }
            }
            if(ind==-1)
                System.out.print("\nId not found");
            else{
                list.remove(ind);
                System.out.println("\nStudent record deleted");
            }
    }
    public void update(List<Student> list){
        System.out.print("Enter id of student you want to update: ");
            int id = sc.nextInt();
            int ind=-1;
            for(int i=0;i<list.size();i++){
                if(list.get(i).id == id){
                    ind=i;
                }
            }
            if(ind==-1)
                System.out.print("\nId not found");
            else{
                System.out.print("\nDetails of Student: "+"\nName: "+list.get(ind).name+"\nMarks: "+list.get(ind).marks);
                System.out.print("\nEnter name of Student");
                String name = sc.next();
                System.out.print("\nEnter marks of Student");
                int marks = sc.nextInt();
                Student student = new Student(id,name,marks);
                list.set(ind,student);
                System.out.println("\nStudent record updated");
            }
    }
    public void view(List<Student> list){
        for(int i=0;i<list.size();i++){
            System.out.println("Id: "+list.get(i).id);
            System.out.println("Name: "+list.get(i).name);
            System.out.println("Marks: "+list.get(i).marks);
            System.out.println("-------------------------------------------");
        }
    }
}
class StudentManagementSystem{
    public static void main(String[] abc){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Managment System");
        Student student = new Student();
        List<Student> list = new ArrayList<>();
        while(true){
            System.out.print("\nEnter 1 for Add, 2 for Delete, 3 for Update, 4 for Read, 5 for exit: ");
            int n = sc.nextInt();
            System.out.println();
            if(n==1){
                student.add(list);
            }
            else if(n==2){
                student.delete(list);
            }
            else if(n==3){
                student.update(list);
            }
            else if(n==4){
                student.view(list);
            }
            else{
                sc.close();
                System.exit(0);
            }
        }
    }
}
import java.util.ArrayList;
class Student
{
	private int rollno;
	private String name;
	private double m1,m2,m3;
	public Student() {}
	public Student(int rollno,String name,double m1, double m2,double m3)
	{
	this.rollno = rollno;
	this.name = name;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
}
		public int getRollNo(){
                return rollno;
        }


		public String getName(){
                return name;
        }


        public double getTotalMarks(){
                return m1+m2+m3;
        }

        public double getAverage(){
                return (m1+m2+m3)/3;
		}
		 public void setRollNo(int rollno){
                this.rollno = rollno;
        }
		public void setName(String name){
				this.name = name;
		}
class Training
{
	private int TrainingId;
	private String TrainingName;
	private Student s;
	public Training(){}
	public Training(int TrainingId,String TrainingName,Student s){
	this.TrainingId = TrainingId;
	this.TrainingName = TrainingName;
	this.s = s;
	}
		public int getTrainingId() {
			return id;		}
		public String getTrainingName() {
			return name; }
		public Student getStudent()
			{ return s; }
		public void setTrainingName(String TrainingName){this.TrainingName = TrainingName;  }
		public void setTrainingId(int TrainingId){ this.TrainingId = TrainingId; }
		public void setStudent(Student S){ this.s=s; }
	ArrayList<Student> alist=new ArrayList<Student>();  
}
class Test
{
 public static void main(String[] args);
	Training t = new Training(10,"Computer",new Student(10,"Kala",100,100,100));
	Student s = new Student(1,"John",100,100,100);
		System.out.println("10");
		System.out.println("Name");
		System.out.println("Student details");
		System.out.println("Id");
  }
  }
  
class Employee{

String name,email,profile;
long phno;
Department dept;  //reference of department (parent_class)

Employee(String name,String email,String profile,long phno,Department dept)
{

this.name=name;
this.email=email;
this.profile=profile;
this.phno=phno;
this.dept=dept;


}
void display(){
System.out.println(name+"  "+email+" "+profile+" "+phno);
System.out.println(dept.dname+" "+dept.dHod+" "+dept.demail+" "+dept.dno);

}


}
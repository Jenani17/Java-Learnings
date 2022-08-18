public class Application {

public static void main(String args[]) {

Employee e1 = new Employee();

e1.setId("E1");
e1.setCode("CMTL01");
e1.setName("Jane");
e1.setNic("956681970v");
e1.setAddress("Jaffna");

System.out.println("Employee ID :" + e1.getId());
System.out.println("Employee Code :" + e1.getCode());
System.out.println("Employee Name :" + e1.getName());
System.out.println("Employee NIC :" + e1.getNic());
System.out.println("Employee Address :" + e1.getAddress());

System.out.println("\n");

Employee e2 = new Employee();

e2.setId("E2");
e2.setCode("CMTL02");
e2.setName("John");
e2.setNic("956328970v");
e2.setAddress("Colombo");

System.out.println("Employee ID :" + e2.getId() );
System.out.println("Employee Code :" + e2.getCode() );
System.out.println("Employee Name :" + e2.getName() );
System.out.println("Employee NIC :" + e2.getNic() );
System.out.println("Employee Address :" + e2.getAddress() );

System.out.println("\n");

Employee e3 = new Employee();

e3.setId("E1");
e3.setCode("CMTL01");
e3.setName("Jane");
e3.setNic("956681970v");
e3.setAddress("Jaffna");

System.out.println("Employee ID :" + e3.getId() );
System.out.println("Employee Code :" + e3.getCode() );
System.out.println("Employee Name :" + e3.getName() );
System.out.println("Employee NIC :" + e3.getNic() );
System.out.println("Employee Address :" + e3.getAddress() );

System.out.println("\n");

System.out.println("e1.getId() == e2.getId() :" + (e1.getId() == e2.getId()));
System.out.println("e1.getId().equals(e2.getId() :" + (e1.getId().equals(e2.getId())));
System.out.println("e1.getCode() == e2.getCode() :" + (e1.getCode() == e2.getCode()));
System.out.println("e1.getCode().equals(e2.getCode() :" + (e1.getCode().equals(e2.getCode())));

System.out.println("\n");

System.out.println("e1.getId() == e3.getId() :" + (e1.getId() == e3.getId()));
System.out.println("e1.getId().equals(e3.getId() :" + (e1.getId().equals(e3.getId())));
System.out.println("e1.getCode() == e3.getCode() :" + (e1.getCode() == e3.getCode()));
System.out.println("e1.getCode().equals(e3.getCode() :" + (e1.getCode().equals(e3.getCode())));

System.out.println("\n");

System.out.println("e2.getId() == e3.getId() :" + (e2.getId() == e3.getId()));
System.out.println("e2.getId().equals(e3.getId() :" + (e2.getId().equals(e3.getId())));
System.out.println("e2.getCode() == e3.getCode() :" + (e2.getCode() == e3.getCode()));
System.out.println("e2.getCode().equals(e3.getCode() :" + (e2.getCode().equals(e3.getCode())));
}

}
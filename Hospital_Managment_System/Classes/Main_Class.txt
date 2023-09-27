public class ArogyaHospitalProject1{
  public static void main(String[] args) throws Exception{
    Scanner sc=new Scanner(System.in);
    int r=0;
    Hospital_1 hsp=new Hospital_1();
    while(r==0){
      System.out.println();
      System.out.println("****Welcome to Arogya Hospital Managment System****");
      System.out.println("1.Add New Patient\n2.List of Patients\n3.Search Patient With Unique ID\n4.Search Patient With name\n5.Filtering Patients\n6.Discharge Patient\n7.Delete Patient\n8.Shut Down\nSelect One Option");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.print("Patient Name: ");
          sc.nextLine();
          String name=sc.nextLine();
          System.out.print("Patient Age: ");
          int age=sc.nextInt();
          System.out.print("Patient Adhar Number: ");
          long adharNumber=sc.nextLong();
          System.out.print("Patient Mobile Number: ");
          long mobileNumber=sc.nextLong();
          System.out.print("Patient city: ");
          sc.nextLine();
          String city=sc.nextLine();
          System.out.print("Patient Address: ");
          //sc.nextLine();
          String address=sc.nextLine();
          System.out.print("Date of Admission: ");
          //sc.nextLine();
          String dateOfAdmission=sc.nextLine();
          DateFormat df=new SimpleDateFormat("DD/MM/YYYY");
          Date presentDate=df.parse(dateOfAdmission);
          System.out.print("Guardian Name: ");
          //sc.nextLine();
          String guardianName=sc.nextLine();
          System.out.print("Guardian Address: ");
          //sc.nextLine();
          String guardianAddress=sc.nextLine();
          System.out.print("Guardian Mobile Number: ");
          long guardianNumber=sc.nextLong();
          Patients_1 p1=new Patients_1(name,age,adharNumber,mobileNumber,city,address,presentDate,guardianName,guardianAddress,guardianNumber);
          hsp.addPatient(p1);
          break;
        case 2:
          hsp.allPatientsDetails();
          break;
        case 3:
          System.out.print("Enter the Patient Id: ");
          int id=sc.nextInt();
          hsp.searchWithId(id);
          break;
        case 4:
          System.out.println("Enter the name of the Patient: ");
          sc.nextLine();
          String name1=sc.nextLine();
          hsp.searchWithName(name1);
          break;
        case 5:
          System.out.println("1.With city\n2.With Age\nSelect One Option");
          int choice2=sc.nextInt();
          switch(choice2){
            case 1:
              System.out.print("Enter the City Name: ");
              sc.nextLine();
              String city1=sc.nextLine();
              hsp.filteringWithCity(city1);
              break;
            case 2:
              System.out.print("Enter the Min Age: ");
              int minAge=sc.nextInt();
              System.out.print("Enter the Max Age: ");
              int maxAge=sc.nextInt();
              hsp.filteringWithAge(minAge,maxAge);
              break;
          }
          break;
        case 6:
          System.out.print("Entre the Patient Id to Discharge: ");
          int id1=sc.nextInt();
          hsp.dischargePatient(id1);
          break;
        case 7:
          System.out.print("Enter the Id Of The Patient to Delete: ");
          int id2=sc.nextInt();
          hsp.deletePatient(id2);
          break;
        case 8:
          System.out.println("Shut Down...........");
          r++;
      }
    }
  }
}
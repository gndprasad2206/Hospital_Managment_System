class Patients_1{
  private static int nextId=1;
  private int id;
  private String name;
  private int age;
  private long adharNumber;
  private long mobileNumber;
  private String city;
  private String address;
  private Date dateOfAdmission;
  private String guardianName;
  private String guardianAddress;
  private long guardianNumber;
  private boolean status;
  public Patients_1(String name,int age,long adharNumber,long mobileNumber,String city,String address,Date dateOfAdmission,String guardianName,String guardianAddress,long guardianNumber){
    this.id=nextId++;
    this.name=name;
    this.age=age;
    this.adharNumber=adharNumber;
    this.mobileNumber=mobileNumber;
    this.city=city;
    this.address=address;
    this.address=address;
    this.dateOfAdmission=dateOfAdmission;
    this.guardianName=guardianName;
    this.guardianAddress=guardianAddress;
    this.guardianNumber=guardianNumber;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public long getAdharNumber(){
    return adharNumber;
  }
  public long getMobileNumber(){
    return mobileNumber;
  }
  public String getCity(){
    return city;
  }
  public String getAddress(){
    return address;
  }
  public Date getDateOfAdmission(){
    return dateOfAdmission;
  }
  public String getGuardianName(){
    return guardianName;
  }
  public String getGuardianAddress(){
    return guardianAddress;
  }
  public long getGuardianNumber(){
    return guardianNumber;
  }
  public boolean getStatus(){
  return status;
  }
  public void setStatus(){
    this.status=true;
  }
}
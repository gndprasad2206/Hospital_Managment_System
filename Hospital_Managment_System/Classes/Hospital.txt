class Hospital_1{
  HashMap<Integer,Patients_1>patients=new HashMap<Integer,Patients_1>();
  public void addPatient(Patients_1 p) throws Exception{
    patients.put(p.getId(), p);
    System.out.println("Added New Patient Successfully");
  }
  public void display(Patients_1 p) throws Exception{
      System.out.println();
      System.out.println("Patient Id: "+p.getId());
      System.out.println("Patient Name: "+p.getName());
      System.out.println("Patient Age: "+p.getAge());
      System.out.println("Patient Adhar Number: "+p.getAdharNumber());
      System.out.println("Patient Mobile Number: "+p.getMobileNumber());
      System.out.println("Patient city: "+p.getCity());
      System.out.println("Patient Address: "+p.getAddress());
      System.out.println("Date of Admission: "+p.getDateOfAdmission());
      System.out.println("Guardian Name: "+p.getGuardianName());
      System.out.println("Guardian Address: "+p.getGuardianAddress());
      System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
      System.out.println("Status of the Patient: "+p.getStatus());
  }
  public void allPatientsDetails() throws Exception{
    boolean check=patients.isEmpty();
    if(check==false){
    Set keys=patients.keySet();
    for(Object obj:keys){
      Integer p1=(Integer)obj;
      Patients_1 p=patients.get(p1);
      display(p);
      }
    }
    else{
      System.out.println("Collection Empty");
    }
  }
  public void searchWithId(int id) throws Exception{
    Patients_1 p=patients.get(id);
    if(p!=null){
      display(p);
    }
    else{
      System.out.println("With this Id:"+id+" There is no Patient");
    }
  }
  public void searchWithName(String name) throws Exception{
    int c=0;
    for(Patients_1 p:patients.values()){
      if(p.getName().equalsIgnoreCase(name)){
        display(p);
        c++;
      }
    }
    if(c==0){
      System.out.println("Patient not found");
    }
  }
  public void filteringWithCity(String city) throws Exception{
    int c=0;
    for(Patients_1 p:patients.values()){
      if(p.getCity().equalsIgnoreCase(city)){
        display(p);
        c++;
      }
    }
    if(c==0){
      System.out.println("Patients not found");
    }
  }
  public void filteringWithAge(int minAge,int maxAge) throws Exception{
    int c=0;
    for(Patients_1 p:patients.values()){
      if(p.getAge()>minAge&&p.getAge()<maxAge){
        display(p);
        c++;
      }
    }
    if(c==0){
      System.out.println("Patients not found");
    }
  }
  public void dischargePatient(int id) throws Exception{
    Patients_1 p=patients.get(id);
    if(p!=null){
        System.out.println();
        System.out.println("Patient Id: "+p.getId());
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Patient Age: "+p.getAge());
        System.out.println("Patient Adhar Number: "+p.getAdharNumber());
        System.out.println("Patient Mobile Number: "+p.getMobileNumber());
        System.out.println("Patient city: "+p.getCity());
        System.out.println("Patient Address: "+p.getAddress());
        System.out.println("Date of Admission: "+p.getDateOfAdmission());
        System.out.println("Guardian Name: "+p.getGuardianName());
        System.out.println("Guardian Address: "+p.getGuardianAddress());
        System.out.println("Guardian Mobile Number: "+p.getGuardianNumber());
        p.setStatus();
        System.out.println("Status of the Patient: "+p.getStatus());
    }
    else{
      System.out.println("Id Not found");
    }
  }
  public void deletePatient(int id) throws Exception{
    Patients_1 p=patients.remove(id);
    if(p!=null){
        display(p);
    }
    else{
      System.out.println("Id Not found");
    }
  }
}
 public abstract class Staff  {

     //thuoc tinh Staff
    private String code;
      String name;
     int age;
     double hesoluong;
     String datein;
     String bophanlamviec;
     int songaynghiphep;
    public Staff(String code, String name, int age, double hesoluong,String datein, String bophanlamviec, int songaynghiphep){
        this.name =name;
        this.code =code;
        this.hesoluong =hesoluong;
        this.datein =datein;
        this.age =age;
        this.bophanlamviec =bophanlamviec;
        this.songaynghiphep =songaynghiphep;
    }



     public double getHesoluong() {
         return hesoluong;
     }

     public void setHesoluong(double hesoluong) {
         this.hesoluong = hesoluong;
     }

     public String getCode() {
           return code;
      }

      public String getName() {
           return name;
      }

      public void setName(String name) {
           this.name = name;
      }
     public int getSongaynghiphep() {
         return songaynghiphep;
     }

     public void setSongaynghiphep(int songaynghiphep) {
         this.songaynghiphep = songaynghiphep;
     }

     public int getAge() {
           return age;
      }

      public String getBophanlamviec() {
           return bophanlamviec;
      }

      public void setBophanlamviec(String bophanlamviec) {
           this.bophanlamviec = bophanlamviec;
      }

     public String getDatein() {
         return datein;
     }

     public void setDatein(String datein) {
         this.datein = datein;
     }

     public void setAge(int age) {
           this.age = age;
      }

      public void setCode(String code) {
           this.code = code;
      }



     public abstract void displayInformation();


 }

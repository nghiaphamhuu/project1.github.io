 public  class Manager extends Staff implements ICalculator{
    String chucdanh;

     public Manager(String code, String name, int age, double hesoluong, String datein, String bophanlamviec, int songaynghiphep, String chucdanh) {
         super(code, name, age, hesoluong, datein, bophanlamviec, songaynghiphep);
         this.chucdanh =chucdanh;
     }

     public String getChucdanh() {
         return chucdanh;
     }

     public void setChucdanh(String chucdanh) {
         this.chucdanh = chucdanh;
     }

     @Override
     public void displayInformation(){
        System.out.println("ma nha vien la "+ super.getCode());
        System.out.println("ten nhan vien la "+ name);
        System.out.println("tuoi nhan vien la " + age);
        System.out.println("he so luong la " + hesoluong);
        System.out.println("ngay vao lam "+ datein);
        System.out.println("bo phan lam viec "+ bophanlamviec);
        System.out.println("so ngay nghi phep "+ songaynghiphep);
        System.out.println("chuc danh la " +chucdanh);
    }



     @Override
     public double calculatorSalary() {
         double result;
         if (chucdanh.equals("Business Leader")) {
             result = hesoluong * 5000000 + 8000000;
         } else if (chucdanh.equals("Project Leader")) {
             result = hesoluong * 5000000 + 5000000;
         } else {
             result = hesoluong * 5000000 + 6000000;
         }
         return result;

     }

 }

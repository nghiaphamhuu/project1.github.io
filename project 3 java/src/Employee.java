class Employee extends Staff implements ICalculator{
    // thuoc tinh
    int sogiolamthem;

    public Employee(String code, String name, int age, double hesoluong, String datein, String bophanlamviec, int songaynghiphep, int sogiolamthem) {
        super(code, name, age, hesoluong, datein, bophanlamviec, songaynghiphep);
        this.sogiolamthem = sogiolamthem;
    }

    // method hien thi
    @Override
    public void displayInformation() {
        System.out.println("ma nha vien la "+ super.getCode());
        System.out.println("ten nhan vien la "+ name);
        System.out.println("tuoi nhan vien la " + age);
        System.out.println("he so luong la " + hesoluong);
        System.out.println("ngay vao lam "+ datein);
        System.out.println("bo phan lam viec "+ bophanlamviec);
        System.out.println("so ngay nghi phep "+ songaynghiphep);
        System.out.println("so gio lam them "+ sogiolamthem);

    }

    @Override
    public double calculatorSalary() {
        return hesoluong*3000000+ sogiolamthem*200000;

    }
}




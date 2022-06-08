import java.util.*;

public class HumanResources {
    public static ArrayList<Staff> list = new ArrayList<Staff>();
    public static ArrayList<Department> list2 =new ArrayList<Department>();
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        // them mot vai nhan vien vao cong ty
        Staff Emp1 = new Employee("Emp01", "nguyen van hai", 19, 3, "01/01/2021", "phong bao ve", 3,5) ;
        list.add(Emp1);
        Staff Man1 =new Manager("Man01","nguyen van b",28, 4.5, "02/04/2008", "phong quan ly",4,"truong phong");
        list.add(Man1);
        Staff Man2 = new Manager("Man2","nguyen van c",29,4.2,"22/03/2008","phong quan ly",4,"giam doc");
        list.add(Man2);
        Department bophan1 = new Department("SALE", "phong ban hang",0);
        list2.add(bophan1);
        Department bophan2 = new Department("SECURITY","phong bao ve",0);
        list2.add(bophan2);
        Department bophan3 =new Department("MANAGER","phong quan ly",0);
        list2.add(bophan3);

        // tao menu cho nguoi dung nhap

        menu();
        int a= sc.nextInt();
        switch (a){
            case 1:
                hienthidanhsachnhanvien();
                break;
            case 2:
                hienthibophan();
                break;
            case 3:
                hienthinhanvientheobophan();
                break;
            case 4:
                themnhanvien();
                break;
            case 5:
                tinhluongchonhanvien();
                break;
            case 6:
                timkiemthongtintheomakhachhang();
                break;
            case 7:
                hienthibangluonggiamdan();
                break;
            case 8:
                hienthibangluongtangdan();
                break;
        }
    }
    public static void menu(){
        // thiet lap menu cho nguoi dung nhap
        Scanner sc =new Scanner(System.in);
        System.out.println("moi ban chon 1-8");
        System.out.println("1.hien thi danh sach nhan vien co trong cong ty");
        System.out.println("2.hien thi cac bo phan co trong cong ty");
        System.out.println("3.hien thi cac nhan vien theo tung bo phan");
        System.out.println("4.them nhan vien moi vao cong ty");
        System.out.println("5.tinh luong cho nhan vien ");
        System.out.println("6.tim kiem thong tin nhan vien theo ma nhan vien");
        System.out.println("7. hien thi danh sach nhan vien theo thu tu giam dan cua luong");
        System.out.println("8. hien thi danh sach nhan vien theo thu tu tang dan cua luong");
    }
    public static void hienthidanhsachnhanvien(){
        //su dung displayInformation de hien thi nhan vien
        for(int i=0; i<list.size(); i++){
            list.get(i).displayInformation();
        }
    }
    public static void hienthibophan(){
        // hien thi bo phan nhan vien

        int countnhanvientrongbophan =0 ;
        for(int i=0; i<list2.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(list2.get(i).getTenbophan().equals(list.get(j).getBophanlamviec())){
                    countnhanvientrongbophan ++;
                }
                list2.get(i).setSoluongnhanvienhientai(countnhanvientrongbophan);
                countnhanvientrongbophan =0 ;
            }
            System.out.println(list2.get(i).toString());
        }
    }
    public static void hienthinhanvientheobophan(){
        // hien thi nhan vien theo bo phan
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list2.get(i).getTenbophan().equals(list.get(j).getBophanlamviec())){
                    System.out.println("thong tin nhan vien thuoc bo phan: " + list2.get(i).getTenbophan());
                    list.get(j).displayInformation();
                }
            }
        }
    }
    public static void themnhanvien() {
        // them nhan vien theo emloy or manager
        Scanner sc = new Scanner(System.in);
        System.out.println("ma nhan vien la ?");
        String code = sc.next();
        System.out.println("ten nhan vien la ?");
        String name = sc.next();
        System.out.println("tuoi nhan vien la ?");
        int age = sc.nextInt();
        System.out.println("he so luong la ?");
        double hesoluong = sc.nextDouble();
        System.out.println("ngay vao la ?");
        String datein = sc.next();
        System.out.println("bo phan lam viec la ?");
        String bophanlamviec = sc.nextLine();
        sc.nextLine();
        System.out.println("So ngay nghi phep ?");
        int songaynghiphep = sc.nextInt();
        System.out.println("la Employee hay Manager?(1.Employee,2.Manager)");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("so gio lam them ?");
            int sogiolamthem = sc.nextInt();
            Staff emp1 = new Employee(code, name, age, hesoluong, datein, bophanlamviec, songaynghiphep, sogiolamthem);
            list.add(emp1);
        } else if (x == 2) {
            System.out.println("chuc danh la?");
            String chucdanh = sc.next();
            Staff man1 = new Manager(code, name, age, hesoluong, datein, bophanlamviec, songaynghiphep, chucdanh);
            list.add(man1);
        }
    }
    public static void tinhluongchonhanvien(){
        //tinh luong dung interface
        for (int i = 0; i < list.size(); i++) {
            System.out.println("luong cua: " + list.get(i).getName());
            System.out.println(Math.round(((ICalculator)list.get(i)).calculatorSalary()*100)/100);
        }
    }
    public static void timkiemthongtintheomakhachhang(){
        //tim kiem khac hang theo code hoạc name
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap chinh xac ten nhan vien hoac ma nhan vien");
        String timkiem = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(timkiem.equals(list.get(i).getName())||timkiem.equals(list.get(i).getCode())){
                list.get(i).displayInformation();
                return;
            }
        }
        System.out.println("khong co");
    }
    public static void hienthibangluonggiamdan(){
        //hien thi luong giam dan dung vong lap
        for (int i = 0; i < list.size(); i++) {
            Staff temp = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                double x = ((ICalculator) list.get(i)).calculatorSalary();
                double y = ((ICalculator) list.get(j)).calculatorSalary();
                if(y>x){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
            list.get(i).displayInformation();
            System.out.println("luong la " + Math.round(((ICalculator)list.get(i)).calculatorSalary()*100)/100);
        }
}
    private static void hienthibangluongtangdan() {
        // hien thi luong tang dan dung vong llap
         for (int i = 0; i < list.size(); i++) {
            Staff temp = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                double x = ((ICalculator) list.get(i)).calculatorSalary();
                double y = ((ICalculator) list.get(j)).calculatorSalary();
                if(y<x){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
            list.get(i).displayInformation();
            System.out.println("luong la " + Math.round(((ICalculator)list.get(i)).calculatorSalary()*100)/100);
        }
    }
}

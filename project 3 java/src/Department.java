public class Department {
    //thuoc tinh Department
    String mabophan;
    String tenbophan;
    int soluongnhanvienhientai;
    // thiet lap method can thiet theo yeu cau de bai
    public Department(String mabophan, String tenbophan, int soluongnhanvienhientai){
        this.soluongnhanvienhientai = soluongnhanvienhientai;
        this.tenbophan =tenbophan;
        this.mabophan =mabophan;
    }
    public String toString(){
        return "ma bo phan la " + mabophan + "\n ten bo phan la " + tenbophan+"\n so luong nhan vien thuoc bo phan la " + soluongnhanvienhientai;
    }

    public String getMabophan() {
        return mabophan;
    }

    public int getSoluongnhanvienhientai() {
        return soluongnhanvienhientai;
    }

    public void setSoluongnhanvienhientai(int soluongnhanvienhientai) {
        this.soluongnhanvienhientai = soluongnhanvienhientai;
    }

    public String getTenbophan() {
        return tenbophan;
    }

    public void setTenbophan(String tenbophan) {
        this.tenbophan = tenbophan;
    }

    public void setMabophan(String mabophan) {
        this.mabophan = mabophan;
    }
}

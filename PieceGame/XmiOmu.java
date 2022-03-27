public class XmiOmu {
    private String deger; // a olarak yapıp null hatasını çözmeye çalıştım burada
    private boolean oynandiMi;

    public XmiOmu(String deger){
        this.deger=deger;
        this.oynandiMi=false;
    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }

    public boolean isOynandiMi() {
        return oynandiMi;
    }

    public void setOynandiMi(boolean oynandiMi) {
        this.oynandiMi = oynandiMi;
    }
}

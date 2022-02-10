public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
        // ilk kimin vuracağı %50 iht. ve savunma %lerinı alıp ona gore dovusu devam ettirme.
    void run(){
        if(isCheck()) {
                while (this.f1.health >= 0 && this.f2.health >= 0) {
                    if(isWon()){
                        break;
                    }
                    // whoStarts calısırasa alt satır calışmaz.
                    if(this.f1.whoStarts()) {
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWon()) {
                            break;
                        }
                    }

                    this.f1.health = this.f2.hit(f1);
                }
        }else{
            System.out.println("Sikletler uyumsdı :(");
        }
    }

    boolean isCheck(){
        return ((this.f1.weight>=minWeight && this.f1.weight<=maxWeight )&& (this.f2.weight>=minWeight && this.f2.weight<=maxWeight));
    }

    boolean isWon(){
        if(this.f1.health<=0 || this.f2.health<=0) {
            return true;
        }
        else{
            return false;
        }
    }
}

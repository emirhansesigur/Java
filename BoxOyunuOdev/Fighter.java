public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe){
        // savunabildi mi savunamadı mı?

        if(foe.isDodge()){
            System.out.println(foe.name+" vurdu "+ this.name +" nın canı degismesi CUNKU");
            System.out.println(this.name+" savundu");
            System.out.println("===========");
            return foe.health;
        }

        int a = foe.health-this.damage;
        if(a<=0) {
            a = 0;
        }
        System.out.println(this.name+" vurdu "+ foe.name +" nın canı "+a+" ya düştü");
        System.out.println("===========");
        return a;
    }
    boolean isDodge(){ // t ise defans yapabildi. // digeri vursun altına defans yaptı densin ama canı azalmasın amin
        double randomNumber = Math.random() * 100;
        if(randomNumber<=this.dodge){
            return true;
        }
        else{
            return false;
        }

    }

    boolean whoStarts(){
        double randomNumber2 = Math.random() * 100;

        if(randomNumber2<=50){
            return true;
        }
        else {
            return false;
        }
    }

}
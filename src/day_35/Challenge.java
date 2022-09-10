package day_35;

public class Challenge extends GameActivity{

    int shootOption;
    private int pointOfShoot;
    private int shootSucces;

    public Challenge(int shootOption, int shootSucces) {
        int point;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;
        pointOfShoot=1000/shootOption;
        point=pointOfShoot*shootSucces;

//        score=point; // score değişkeni parent classda private
                        //olarak tanımlandığı için doğrudan erişilemez.
        setScore(point); //settter methodu o yuzden kullanıldı
    }
}

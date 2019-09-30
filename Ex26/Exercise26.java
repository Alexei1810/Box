package Box.Ex26;

public class Exercise26 {
    public static void main(String[] args) {
        KettleLG kLG = new KettleLG();
        kLG.plugIn();
        kLG.boilWater();
        WashingMashineLG mLG=new WashingMashineLG();
        mLG.plugIn();
        mLG.wash();
    }
}

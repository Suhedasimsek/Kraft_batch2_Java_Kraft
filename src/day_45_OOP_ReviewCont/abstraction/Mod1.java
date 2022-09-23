package day_45_OOP_ReviewCont.abstraction;

public class Mod1 extends D3Print{

    public Mod1(String model, String fileFormat) {
        super(model, fileFormat);
        extrude();
        System.out.println(fileFormatCheck());
        if (fileFormat.equals("OBJ")){
            polish();
        }else{
            fileFormatCheck();
        }
        System.out.println(counter());

    }

    @Override
    public void extrude() {
        System.out.println("printing a "+model+ " with "+fileFormat+" fileformat");
        System.out.println("30 cm filament kullanıldı");
    }

    @Override
    public void polish() {
        System.out.println(model+ " is polishing");
    }
}

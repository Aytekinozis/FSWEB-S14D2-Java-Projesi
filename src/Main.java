import com.workintech.rooms.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("yenioda", new Wall("kuzey"),
                new Wall("guney"),
                new Wall("dogu"),new Wall("bati"),new Ceiling(5, PaintColor.WHITE),
                new Bed("cift kisi",2,2,1,1),
                new Lamp(true,5,LambType.LED),
                new Wardrobe(3,2,52.5),new Carpet(4,5,PaintColor.RED));


        System.out.println("bedroom= " + bedroom);

    }


}
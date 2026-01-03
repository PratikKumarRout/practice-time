// challenge 1
public class Hello {

    public static void main(String[] args) {
        Guitar gitar = new Guitar();
        gitar.name = "Fender";
        System.out.println(gitar.name);
        gitar.record();
        gitar.play();
    }
}

interface Playable {
    void play();
}

interface Recordable {
    void record();
}

abstract class Instrument {
    String name;

}

class Guitar extends Instrument implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("playing......");
    }

    @Override
    public void record() {
        System.out.println("Recording....");
    }

}
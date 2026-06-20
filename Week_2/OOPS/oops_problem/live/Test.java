package live;
import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
    public static void main(String[] args){
        // Object/instance of Veena class & call play()
        Veena veena = new Veena();
        veena.play();

        // Object/instance of Saxophone class & call play()
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Use Playable interface reference to hold Veena object & call play()
        Playable playableVeena = new Veena();
        playableVeena.play();

        // use Playable interface reference to hold Saxophone object & call play()
        Playable playableSaxophone = new Saxophone();
        playableSaxophone.play();
    }
}

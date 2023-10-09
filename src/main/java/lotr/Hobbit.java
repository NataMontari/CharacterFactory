package lotr;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
public class Hobbit extends Character {
    private int hp;
    private int power;
    public Hobbit() {
        super(3, 0);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void kick(Character opponent){
        System.out.println("Crying!");
    }
}

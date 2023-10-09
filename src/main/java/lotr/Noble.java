package lotr;
import java.util.Random;

public abstract class Noble extends Character{
    private int hp;
    private int power;
    
    public Noble(int minPower, int maxPower, int minHp, int maxHp){
        super(new Random().nextInt(maxHp-minHp+1)+minHp,
        new Random().nextInt(maxPower-minPower+1)+minPower);
    }
    @Override
    public void kick(Character opponent){
        int damage = new Random().nextInt(this.power);
        opponent.setHp(opponent.getHp()-damage);
    }
}

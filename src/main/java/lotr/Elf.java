package lotr;


public class Elf extends Character{
    private int power;
    private int hp;
    public Elf(){
        super(10,10);
    }
    @Override
    public void kick(Character opponent){
        int opponent_power = opponent.getPower();
        if (this.power > opponent_power){
            opponent.setHp(0);
        }
        else{opponent.setPower(opponent_power-1);}
    }

}

package lotr;

public class GameManager {
    public void fight(Character opponent1, Character opponent2){
        while (opponent1.isAlive() && opponent2.isAlive()){
            System.out.println(opponent1.getClass().getSimpleName() + " hp: "+ opponent1.getHp());
            opponent1.kick(opponent2);
            System.out.println(opponent2.getClass().getSimpleName() + " hp : "+ opponent2.getHp());
            if (opponent2.isAlive()){
                opponent2.kick(opponent1);
            }
        }
        if (opponent1.isAlive()){System.out.println(opponent1.getClass().getSimpleName() + "wins!");}
        else{System.out.println(opponent1.getClass().getSimpleName() + "wins!"); };
    }

}

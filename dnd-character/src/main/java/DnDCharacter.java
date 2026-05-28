import java.util.*;

class DnDCharacter {

    Random rand = new Random();
    
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;;
    private final int wisdom;
    private  final int charisma;

    DnDCharacter(){
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        List<Integer> sortedScores = new ArrayList<Integer>(scores);
        int sum = 0;
        Collections.sort(sortedScores);

        for (int i = 1; i < sortedScores.size(); i++) {
            sum = sum + sortedScores.get(i);
        }

        return sum;
    }

    List<Integer> rollDice() {
        List<Integer>rolls = new ArrayList<>();
        for(int i = 0; i<4; i++){
            rolls.add(rand.nextInt(6)+1);
        }

        return rolls;
    }

    int modifier(int input) {
        return Math.floorDiv(input-10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}

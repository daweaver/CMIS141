/* File name: Starter.java
*  Author: Devere Weaver
*  Date: 16 NOV 2019
*  Purpose: Create your own custom starter Pokemon, 
*           or just receive a random one. 
*/

public class Starter {
    private String pokemon, nickname;
    private int hp, attk, spcAttk, def, spcDef, speed, level;   // Pokemon's stats

    // Constructor to 100% customize starter Pokemon 
    public Starter(String p, int h, int a, int sA, int d,
                   int sD, int s, int l) {
        pokemon = p;
        hp = h;
        attk = a;
        spcAttk = sA;
        def = d;
        spcDef = sD;
        speed = s;
        level = l;    
    }

    // Constructor to build starter Pokemon with random stats
    public Starter (String p) {
        pokemon = p;
        hp = (int)(Math.random() * 800);
        attk = (int)(Math.random() * 800);
        spcAttk = (int)(Math.random() * 800);
        def = (int)(Math.random() * 800);
        spcDef = (int)(Math.random() * 800);
        speed = (int)(Math.random() * 800);
        level = (int)(Math.random() * 101);
    }

    // Default constructor 
    public Starter() {
        pokemon = "Magikarp";
        hp = 10;
        attk = 0;
        spcAttk = 0;
        def = 0;
        spcDef = 0;
        speed = 0;
        level = 1;
    }

    // Set nickname for Pokemon
    public void setNickname(String nn) {
        nickname = nn;
    }

    // Get your Pokemon's summary
    public String getSummary() {
        String summary;
        if (nickname == null){
            summary = 
            "Pokemon: " + pokemon + '\n' +
            "Level: " + level + '\n' +
            "Hit points: " + hp + '\n' +
            "Attack: " + attk + '\n' + 
            "Special Attack: " + spcAttk + '\n' + 
            "Defense: " + def + '\n' +
            "Special Defense: " + spcDef + '\n' + 
            "Speed: " + speed;

        }
        else {
            summary = 
                "Pokemon: " + pokemon + '\n' +
                "Nickname: " + nickname + '\n' +
                "Level: " + level + '\n' +
                "Hit points: " + hp + '\n' +
                "Attack: " + attk + '\n' + 
                "Special Attack: " + spcAttk + '\n' + 
                "Defense: " + def + '\n' +
                "Special Defense: " + spcDef + '\n' + 
                "Speed: " + speed;
        }
        
        return summary;
    }

    // Level up your pokemon whenver you want, forget training.
    public void levelUp() {
        level++;
    }

    // Evolve your pokemon whenever you want, forget levels.
    public String spontaniousEvolve() {
        String evolve = "What? Your " + pokemon + " is evolving...";
        
        return evolve;
    }
}
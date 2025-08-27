public class Exercise2
{
    public static void main(String [] srgs)
    {
        Ex2Hero theHero = new Ex2Hero("Arthur");

        System.out.println(theHero.getWeapon ().getName ());
        System.out.println(theHero.getWeapon ().getAttack ());
        System.out.println(theHero.getWeapon ().getDefense ());

    }
}
class Ex2Hero
{
    private String name;
    private Ex2Item weapon;
    public Ex2Hero(String name)
        {
        this.name = name;
        this.weapon = new
        Ex2Item("sword", 10, 1);
        }
    public Ex2Item getWeapon ()
    {
        return this.weapon;
    }
}

class Ex2Item
{
    private String name;
    private int attack;
    private int defense;
    public Ex2Item(String name , int attack , int defense)
    {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }
    public String getName ()
    {
        return name;
    }
    public int getAttack ()
    {
        return this.attack;
    }
    public int getDefense ()
    {
        return this.defense;
    }
}

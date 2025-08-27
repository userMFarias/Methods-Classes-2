# Methods-Classes-2
ou are provided with two classes. The first class is a class Hero containing a variable
name and a variable weapon of class Item. The second is a class Item containing a variable name
(which can contain values as “sword” or “spear”), a variable attack representing the attack value of
the weapon and a variable defense representing the defense value of the item. In the main method,
we construct an object theHero of class Hero. The name of the weapon of theHero is then printed
using the getter from the class Hero (which returns an object of class Item) and the getter from the
class Item (which returns a String). Your task is to print the attack value and the defense value of
the weapon of the hero. 

public class Exercise2
{

  public static void main(String[] srgs)
  
  {
    Hero theHero = new Hero("Arthur");
    System.out.println(theHero.getWeapon().getName());
    
    //Your code goes here
    
  }
  

}


class Hero
{
  private String name;
  private Item weapon;
  public Hero(String name)
  {
    this.name = name;
    this.weapon = new Item("sword", 10, 1);
  }
  public Item getWeapon()
  {
    return this.weapon;
  }
}

class Item
{
  private String name;
  private int attack;
  private int defense;
  
  public Item(String name, int attack, int defense)
  
  {
  this.name = name;
  this.attack = attack;
  this.defense = defense;
  }


  public String getName()
  {
  return name;
  }

}

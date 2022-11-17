//AUTHOR GRACIA BARETI AND WORKED WITH RACHEL TOLENTINO
import java.util.ArrayList;
public class Tamagotchi {

    //Attributes
    public String name;//creates private and use accessors and manipulators
    public String color;
    private int age;
    private int locationX;
    private int locationY;
    private ArrayList <String> inventory = new ArrayList <String>();
    private ArrayList <String> powerUp = new ArrayList <String>();

    //Constructor
    public Tamagotchi (String name,String color) {
        this.name= name;
        this.color= color;
        this.age=100;
        this.locationX=0;
        this.locationY=0;
    }

    //Acessors & Manipulators
    /* Sets name
     * @param name 2 tamagotchi
     */
    public void setName(String name2){
        this.name = name2;
    }

    //Methods
    /*Creates list of power ups 
     * 
     */
    public void createPowerUp(){
        powerUp.add("star");
        powerUp.add("grape");
        powerUp.add("orange");
    }
    
    /* Grabs item from the inventory
     * @param item 
     */
    public void grab(String item){
        System.out.println("You grabbed"+ item + "it is being added to your inventory");
        this.inventory.add(item);
        System.out.println("Your inventory"+ this.inventory);
    }
    /* Removes item from inventory
     * @param item The item
     * @return item The item being dropped
     */
    public String drop(String item){
        this.inventory.remove(item);
        System.out.println("You have dropped" + item);
        return(item);
    }
    /* Examines whether an item is a power up, then tamagotchi grabs item
     * otherwise they will drop it.
     * @param item The item they want to examine
     */
    public void examine(String item){
        if(powerUp.contains(item)== true){
            grab(item);
            this.age +=10;
        }
        else{
            drop(item);
        }

    }
    /* Allows user things in their inventory
     * @param item Item in question
     */
    public void use(String item){
        if(inventory.contains(item)==true);
            System.out.println("You have unlocked a new achievement;) Do you want to use it?");
    }

    /*Provides tamagotchi walking abilities based on direction
     * @param direction Direction desired for tamagotchi to walk
     * @return Boolean, true signifying tamagotchi moved
     */
    public boolean walk(String direction){
        if(direction== "north"){ 
            this.locationY +=1;
            System.out.println(locationY);
            return(true);
        }
        if(direction == "south"){
            this.locationY -=1;
            return(true);
        }
        if(direction=="west"){
            this.locationX -=1;
            return(true);
        }
        if(direction=="east"){
            this.locationX +=1;
            return(true);
        }
        else{
            System.out.println("Give a valid direction");
                return(false);
        }
    }
    
    
    /**
     * @param int x
     * @param int y
     * @return boolean, true means tamagotchi flew
     */
    public boolean fly(int x, int y){
        this.locationX += x;
        this.locationY +=y;
        System.out.println(locationX + " "+locationY);
        return(true);

    }
    /*
     * Decreases age of tamagotchi
     */
    public Number shrink(){
    this.age -= 10;
    System.out.println("Your age has gone down by -10 pt = " +this.age);
    return(this.age);
    }
    /* Increases age of tamagotchi
     * 
     */
    public Number grow(){
        this.age += 10;
        System.out.println("Your age has gone up by +10 pt= "+ this.age);
        return(this.age);
    }
    /*Boosts age of tamagotchi
     * 
     */
    public void rest(){
        System.out.println( "You are now resting!");
        this.age += 20;
        System.out.println("Age= " + this.age);
    }

    /*To rest Tamagotchi 
    * 
    */
   public void undo(){
    this.name="Steve";
    this.color="white";
    this.age=100;
    this.locationX= 0;
    this.locationY= 0;
    System.out.println("You have now rest the Tamagotchi \n" + this.name+ "\n"+ this.age);

  }
  // Main
  /*
   * Testing 
   */

  public static void main(String[]args){
    Tamagotchi pet= new Tamagotchi("Gabe","red");
    System.out.println(pet);
    pet.grab("star");
    pet.grab("grape");
    pet.drop("pomegranate");
    pet.examine("bottle");
    pet.createPowerUp();
    pet.use("star");
    pet.walk("north");
    pet.fly(2,4);
    pet.shrink();
    pet.grow();
    pet.undo();
  }

}
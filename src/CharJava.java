
public class CharJava {

	String Name;
	String Alignment;
	int Damage;
	int Health;
	
	CharJava(String Name, String Alignment, int Damage, int Health){
		   this.Name = Name; 
		   this.Alignment = Alignment;
		   this.Damage = Damage;
		   this.Health = Health;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAlignment() {
		return Alignment;
	}

	public void setAlignment(String alignment) {
		Alignment = alignment;
	}

	public int getDamage() {
		return Damage;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}

	public int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}














}


public class Boss extends GameEntity {


    private String Weapon;

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public Boss (int health, int damage){

        this.Weapon= getGetWeapon();
    }

    public String getGetWeapon() {
        return Weapon;
    }

    public void setGetWeapon(String getWeapon) {
        this.Weapon = getWeapon;
    }

    public String getInfo() {
        return Weapon + "" + getGetWeapon() + "" + getHealth() + getDamage();

    }


}

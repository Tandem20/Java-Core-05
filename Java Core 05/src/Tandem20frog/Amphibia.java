package Tandem20frog;

public abstract class Amphibia {
private String eat;
private String sleep;
private String swim;
private String walk;
public Amphibia(String eat, String sleep, String swim, String walk) {
	super();
	this.eat = eat;
	this.sleep = sleep;
	this.swim = swim;
	this.walk = walk;
	
}
abstract void eat();
abstract void sleep();
abstract void swim();
abstract void walk();
public String getEat() {
	return eat;
}
public void setEat(String eat) {
	this.eat = eat;
}
public String getSleep() {
	return sleep;
}
public void setSleep(String sleep) {
	this.sleep = sleep;
}
public String getSwim() {
	return swim;
}
public void setSwim(String swim) {
	this.swim = swim;
}
public String getWalk() {
	return walk;
}
public void setWalk(String walk) {
	this.walk = walk;
	
}
@Override
public String toString() {
	return "Amphibia [eat=" + eat + ", sleep=" + sleep + ", swim=" + swim + ", walk=" + walk + "]";
}

}

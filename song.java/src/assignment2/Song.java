package assignment2;
//Colden Jeanmonod
//1/29/2024
//Assignment 2. Songs
//
//This program prints out the old timey folk song with a different sixth verse
//
public class Song {
	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
		
	}
	
	
	public static void verse1() {
		cat();
		verse1noise();
		
		
	}
	
	public static void verse2() {
		hen();
		verse2noise();

	}
	public static void verse3() {
		duck();
		verse3noise();
		
	}
	public static void verse4() {
		goose();
		verse4noise();
		
		
	}
	public static void verse5() {
		sheep();
		verse5noise();
		
		
		
	}
	public static void verse6() {
		dino();
		verse6noise();
		
	}
	
	public static void cat() {
		System.out.println("Bought me a cat and the cat pleased me, ");
		System.out.println("I fed my cat under yonder tree.");
	}
	public static void catnoise () {
		System.out.println("Cat goes fiddle-i-fee.");
		System.out.println();
	}
	public static void hen() {
		System.out.println("Bought me a hen and the hen pleased me, ");
		System.out.println("I fed my hen under yonder tree.");
	}
	public static void hennoise() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
	}
	public static void duck() {
		System.out.println("Bought me a duck and the duck pleased me, ");
		System.out.println("I fed my duck under yonder tree.");
	}
	public static void ducknoise() {
		System.out.println("Duck goes quack, quack,");
	}
	public static void goose() {
		System.out.println("Bought me a goose and the goose pleased me, ");
		System.out.println("I fed my goose under yonder tree.");
		
	}
	public static void goosenoise() {
		System.out.println("goose goes hissy, hissy,");
	}
	public static void sheep () {
		System.out.println("Bought me a sheep and the sheep pleased me, ");
		System.out.println("I fed my sheep under yonder tree.");
	}
	public static void sheepnoise() {
		System.out.println("Sheep goes baa, baa,");
	}
	public static void dino() {
		System.out.println("Bought me a dino and the dino pleased me, ");
		System.out.println("I fed my dino under yonder tree.");
	}
	public static void dinonoise() {
		System.out.println("Dino goes rawr, rawr,");
	}
	public static void verse1noise() {
		catnoise();
		
	}
	public static void verse2noise() {
		hennoise();
		verse1noise();
	}
	public static void verse3noise() {
		ducknoise();
		verse2noise();
		
	}
	public static void verse4noise() {
		goosenoise();
		verse3noise();
	}
	public static void verse5noise() {
		sheepnoise();
		verse4noise();
	}
	public static void verse6noise() {
		dinonoise();
		verse5noise();
		
	}
	
	
	}


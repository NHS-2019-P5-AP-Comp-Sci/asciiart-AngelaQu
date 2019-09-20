/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

public class ASCIIArt {
	public static void main(String[] args) {
		textBox();
		newLine();
		bear();
	}

	public static void horizontal() {
		System.out.print("-----------");
	}

	public static void feet() {
		System.out.println("\\ _^^^___^^^__/");
		space2();
		System.out.println("   `-'   `-' ");
	}

	public static void newLine() {
		System.out.println("");
	}

	public static void ear() {
		System.out.print(".\"\",");
	}

	public static void space2() {
		System.out.print("  ");
	}

	public static void space4() {
		System.out.print("    ");
	}

	public static void space17() {
		System.out.print("\t\t ");
	}

	public static void bear() {
		space2();
		System.out.println(" /   =   =   \\   /");
		space2();
		System.out.println("|    ( Y )    | /");
		System.out.print(" ");
		System.out.println("/|     ---     |\\");
		System.out.println("C/|   /     \\   |\\D");
		space2();
		System.out.println("|  |   X   |  |");
		space2();
		feet();
	}
	public static void textBox() {
		space17();
		System.out.print("/---------\\");
		newLine();
		space4();
		ear();
		System.out.print("   ");
		ear();
		space2();
		System.out.print("   zzzZZZ  ");
		newLine();
		space4();
		horizontal();
		space2();
		System.out.print("\\_________/");
	}
}
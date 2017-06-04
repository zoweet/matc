import java.util.Scanner;

public class Age {

public static void main(String[] args) {

/*int d = 60;
switch (d) {
    case 20:
        d += 10; //break;
    case 40:
        d -= 10; //break;
    case 60:
        d *= 10; break;
    default:
        if (d > 100) {
            d -= 100; break;
        }
}
System.out.println(d);
}
}//http://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
// Assignment - Make a program using the switch statements.
//5 case statements
//Asks for a user imput.
// Checks to see if that user input is valid.  
// If it is not a valid input ask the user enter a number again.
// Keep asking for a number until you get one that matches a case*/

	
	int x;
	Scanner input = new Scanner(System.in);
	System.out.println("How old are you??");
	boolean run = true;
	while(run){
		x = input.nextInt();
		switch(x){
			case 0:
				System.out.println("Your are a baby");
			case 1:
				System.out.println("Your first step");
				run = false; break;
			case 2:
				System.out.println("Time for potty training");
				run = false; break;
			case 3:
				System.out.println("Time to learn your ABC's");
				run = false; break;
			case 4:
				System.out.println("Time for preschool");
				run = false; break;
			case 5:
				System.out.println("You are now in kindergarten");
				run = false; break;
			case 6:
				System.out.println("You just lost your first tooth");
				run = false; break;
			case 7:
				System.out.println("You just had your first sleepover");
				run = false; break;
			case 8:
				System.out.println("Your ears are now pierced");
				run = false; break;
			case 9:
				System.out.println("Your now in your first play");
				run = false; break;
			case 10:
				System.out.println("Double digits!!");
				run = false; break;
			case 11:
				System.out.println("You just got your first crush");
				run = false; break;
			case 12:
				System.out.println("Welcome to jr high");
				run = false; break;
			case 13:
				System.out.println("You learn algebra");
				run = false; break;
			case 14:
				System.out.println("Rebelious Stage");
				run = false; break;
			case 15:
				System.out.println("Your first job");
				run = false; break;
			case 16:
				System.out.println("Drivers Licence");
				run = false; break;
			case 17:
				System.out.println("Dating");
				run = false; break;
			case 18:
				System.out.println("Graguate highschool");
				run = false; break;
			case 19:
				System.out.println("College");
				run = false; break;
			case 20:
				System.out.println("First appartment");
				run = false; break;
			case 21:
				System.out.println("Drink alchohol");
				run = false; break;
			case 22:
				System.out.println("Taylor Swift song");
				run = false; break;
			case 23:
				System.out.println("Proposal");
				run = false; break;
			case 24:
				System.out.println("Marriage");
				run = false; break;
			case 25:
				System.out.println("Dirt poor");
				run = false; break;
			case 26:
				System.out.println("First crappy car");
				run = false; break;
			case 27:
				System.out.println("Baby");
				run = false; break;
			case 28:
				System.out.println("First mini van");
				run = false; break;
			case 29:
				System.out.println("First crappy house");
				run = false; break;
			case 30:
				System.out.println("Second child");
				run = false; break;
			case 31:
				System.out.println("First child goes to elementary school");
				run = false; break;
			case 32:
				System.out.println("Big fight");
				run = false; break;
			case 33:
				System.out.println("Divorse");
				run = false; break;
			case 34:
				System.out.println("New rich partner");
				run = false; break;
			case 35:
				System.out.println("Lives in Mansion");
				run = false; break;
			case 36:
				System.out.println("Cheat on rich partner");
				run = false; break;
			case 37:
				System.out.println("Rich partner dies");
				run = false; break;
			case 38:
				System.out.println("You're rich");
				run = false; break;
			case 39:
				System.out.println("Meets love of their life");
				run = false; break;
			case 40:
				System.out.println("Over the hill");
				run = false; break;	
			case 41:
				System.out.println("First baby is depressed");
				run = false; break;
			case 42:
				System.out.println("Second baby got runs away");
				run = false; break;
			case 43:
				System.out.println("First baby gets teen pregnency");
				run = false; break;
			case 44:
				System.out.println("Find second baby in juvy");
				run = false; break;
			case 45:
				System.out.println("Breaks second baby out of jail");
				run = false; break;
			case 46:
				System.out.println("Third marriage");
				run = false; break;
			case 47:
				System.out.println("Gets botox");
				run = false; break;
			case 48:
				System.out.println("First baby is having her second baby");
				run = false; break;
			case 49:
				System.out.println("Second baby turns trangender");
				run = false; break;
			case 50:
				System.out.println("You are old");
				run = false; break;
			case 51:
				System.out.println("More botox");
				run = false; break;
			case 52:
				System.out.println("You decide to adopt another child.. they are 2");
				run = false; break;
			case 53:
				System.out.println("Your father is sick in hospital");
				run = false; break;
			case 54:
				System.out.println("You have Parents move in with you");
				run = false; break;
			case 55:
				System.out.println("Third baby goes to elementary school");
				run = false; break;
			case 56:
				System.out.println("Your father passes away at age 78");
				run = false; break;
			case 57:
				System.out.println("Third baby has seizure");
				run = false; break;
			case 58:
				System.out.println("Your mother starts to lose her hearing");
				run = false; break;
			case 59:
				System.out.println("Husband goes to hospital... He has cancer");
				run = false; break;
			case 60:
				System.out.println("First bus driving job");
				run = false; break;
			case 61:
				System.out.println("Big Vacation to.... New Zealand");
				run = false; break;
			case 62:
				System.out.println("Decides to move to New Zealand");
				run = false; break;
			case 63:
				System.out.println("Fell down stairs and broke leg");
				run = false; break;
			case 64:
				System.out.println("Your third child goes to jr high in New Zealand");
				run = false; break;
			case 65:
				System.out.println("Time for medicare");
				run = false; break;
			case 66:
				System.out.println("Your mother passes away");
				run = false; break;
			case 67:
				System.out.println("Retirement");
				run = false; break;
			case 68:
				System.out.println("Husband doesnt have cancer anymore");
				run = false; break;
			case 69:
				System.out.println("Sends adopted baby to college");
				run = false; break;
			case 70:
				System.out.println("You and your grown family gets together for family time.");
				run = false; break;
			case 71:
				System.out.println("You get your first tattoo");
				run = false; break;
			case 72:
				System.out.println("Your adopted child has a baby on the way");
				run = false; break;
			case 73:
				System.out.println("You are getting tired all the time");
				run = false; break;
			case 74:
				System.out.println("Your husband continuously keeps going to hospital");
				run = false; break;
			case 75:
				System.out.println("You and your husband decide to move into a retirement home");
				run = false; break;
			case 76:
				System.out.println("adopted child has second kid");
				run = false; break;
			case 77:
				System.out.println("Your second child has divorse");
				run = false; break;
			case 78 :
				System.out.println("Your first child becomes pricipal of school");
				run = false; break;
			case 79:
				System.out.println("Your husband is sick in the hospital");
				run = false; break;
			case 80:
				System.out.println("Your husband is beginning to have a heart failure");
				run = false; break;
			case 81:
				System.out.println("Your husband got a heart surgery");
				run = false; break;	
			case 82:
				System.out.println("Your husband passes away");
				run = false; break;
			case 83:
				System.out.println("You move in with oldest daughter");
				run = false; break;
			case 84:
				System.out.println("You write your will");
				run = false; break;
			case 85:
				System.out.println("You decide to fulfill your bucket list");
				run = false; break;
			case 86:
				System.out.println("Walking begins to be hard");
				run = false; break;
			case 87:
				System.out.println("Your eyesight begins to go out");
				run = false; break;
			case 88:
				System.out.println("You get your first pair of stonge glasses");
				run = false; break;
			case 89:
				System.out.println("You are now in a wheelchair");
				run = false; break;
			case 90:
				System.out.println("You are now a great great grandma");
				run = false; break;
			case 91:
				System.out.println("You get to spend quality time with whole family");
				run = false; break;
			case 92:
				System.out.println("Many trips in and out of hospital");
				run = false; break;
			case 93:
				System.out.println("You have fake teeth");
				run = false; break;
			case 94:
				System.out.println("You love soap operas");
				run = false; break;
			case 95:
				System.out.println("You are happy");
				run = false; break;
			case 96:
				System.out.println("You have giant party");
				run = false; break;
			case 97:
				System.out.println("You turn your hair purple");
				run = false; break;
			case 98:
				System.out.println("You are very weak");
				run = false; break;
			case 99:
				System.out.println("You help fill out your family history");
				run = false; break;
			case 100:
				System.out.println("You died");
				run = false; break;	
				
			default:
				if (x > 100)
					x -= 100; break;
		}
	}
	
	}
	}
	



	
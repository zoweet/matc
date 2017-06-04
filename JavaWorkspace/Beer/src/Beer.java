public class Beer{
	public static void lyrics(int bottles){
	if (bottles == 0){
		System.out.println();
		System.out.println("No glasses of water on the table, no glasses of water, ya' drank the last one");
		System.out.println("now you are dead, 'cause you are dehydated!");
	}else{
		System.out.println(bottles + " glasses of water on the table, " + bottles + " glasses of water, ya' take one");	
		System.out.println("down, ya' drink it all up," + " you are hydrated.");
		System.out.println();
		}
}
	public static void main(String[] args){
		Beer beer = new Beer();
		for(int i = 99; i>=0; i--){
			beer. lyrics(i);
			
			}
			System.exit(0);
		}
	
}
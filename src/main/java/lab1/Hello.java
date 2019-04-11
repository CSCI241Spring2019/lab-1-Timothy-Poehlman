package lab1;

public class Hello{
    public static void main(String[] args){
	String argString = "";
	for(int i=0;i<args.length;i++){
		argString = argString + args[i];
	}
        System.out.println("Hello "+ argString +"!");
    }
}

package javacode;

public class Android {
	int modelno;
    int ram;
	String colour;
	
	
	public Android(int storage,int ram, String colour) {
        this.modelno = storage;
        this.ram = ram;
        this.colour = colour;
    }
    public void info(){
    	System.out.println(modelno +"'s colour is " + colour + " and Ram is "+ ram);
    }

}





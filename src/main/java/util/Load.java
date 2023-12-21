package util;

public class Load {
    public void For(int Seconds){
        int seconds = Seconds * 1000;
        try { Thread.sleep(seconds);
            System.out.println("Loading the page, please wait for "+Seconds+" second(s)");
        }
        catch(Exception e){System.err.println(e);}        
    }
}

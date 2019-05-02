//Created By Emma Seehousz on 4/16
public class Question9_6Class {
	private long startTime;
    private long endTime;
    
    public Question9_6Class() {
        this.startTime = System.currentTimeMillis();
    }
    
    public void startTime() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }
    
    public void stopTime() {
        this.endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime - startTime;
    }
    
    public long getStartTime() {
        return this.startTime;
    }
    
    public long getEndTime() {
        return this.endTime;
    }	
}
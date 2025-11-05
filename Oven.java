public class Oven
{
    
    private int maxTemp;
    private int currentTemp;

    public Oven(int max, int current){
        
        maxTemp = Math.min(500, Math.max(max,0));
        if (maxTemp == 0) maxTemp = 500; 
        currentTemp = Math.min(maxTemp, Math.max(current,0));
    }

    public int getMaxTemp() {
        return maxTemp;
    }
    public int getCurrentTemp(){
        return currentTemp;
    }
    public void turnOff(){
        if(currentTemp>0) currentTemp=0;
    } 
    public boolean isOn(){
        return currentTemp>0;
    }
    public void preheat(int temp){
        if(temp<maxTemp){
            currentTemp = temp;
        } else if(temp>0) currentTemp = maxTemp;
    }
    public String toString(){
        return "New oven with a maximum temperature of "+maxTemp+" and a starting temperature of "+currentTemp;
    }
}

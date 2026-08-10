import java.util.*;
public class Main {
    public static void main(String[] args) {
       Attributes a=new Attributes();
       a.setTotalWatchTime(180);
       a.setMoviesWatched(4);
       a.setPausedCount(3);
       a.setFastForwarsAttempts(2);
       System.out.println("Total totalWatchTime: "+ a.getTotalWatchTime());
       System.out.println("Movies Watched: "+a.getMoviesWatched());
       System.out.println("Paused Count: "+ a.getPausedCount());
       System.out.println("Fast forward attemps: "+ a.getFastForwardAttempts());
       System.out.println("Activity Score: "+a.getUserActivityScore());
       int as=a.getUserActivityScore();
       System.out.println("High Engagement: "+ a.isHighEngagement(as));
    }
}
class Attributes{
    private int totalWatchTime=0;
    private int moviesWatched=0;
    private int pausedCount=0;
    private int fastForwarsAttempts=0;
    public int getTotalWatchTime(){
        return totalWatchTime;
    }
    public int getMoviesWatched(){
        return moviesWatched;
    } 
    public int getPausedCount(){
        return pausedCount;
    }
    public int getFastForwardAttempts(){
        return fastForwarsAttempts;
    }
    
    public void setTotalWatchTime(int totalWatchTime){
        if(totalWatchTime<0){
            System.out.println("Invalid input: negative value not allowed");
        }
        else if(totalWatchTime>240){
            System.out.println("Violates the 4 hous/day rule");
        }
        else{
            this.totalWatchTime=totalWatchTime;
        }
    }
    
    public void setMoviesWatched(int moviesWatched){
        if(moviesWatched<0){
            System.out.println("Invalid input: negative value not allowed");
        }
        else if(moviesWatched>5){
            System.out.println("Suspected bot activity");
        }
        else{
            this.moviesWatched=moviesWatched;
        }
    }
    
    public void setPausedCount(int pausedCount){
        if(pausedCount<0){
            System.out.println("Invalid input: negative value not allowed");
        }
        else{
            this.pausedCount=pausedCount;
        }
    }
    
    public void setFastForwarsAttempts(int fastForwarsAttempts){
        if(totalWatchTime<0){
            System.out.println("Invalid input: negative value not allowed");
        }
        else{
            this.fastForwarsAttempts=fastForwarsAttempts;
        }
    }
    public int getUserActivityScore(){
        int Activityscore;
        Activityscore=(totalWatchTime*2)+(moviesWatched*10)+(pausedCount*1)-(fastForwarsAttempts*3);
        if(Activityscore<0){
            Activityscore=0;
        }
        else if(Activityscore>500){
            Activityscore=500;
        }
        return Activityscore;
    }
    
    public Boolean isHighEngagement(int Activityscore){
        if(Activityscore>=250){
            return true;
        }
        else{
            return false;
        }
    }
    
}

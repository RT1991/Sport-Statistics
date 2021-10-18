/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilin
 */
public class Sport {

    private String firstteam;
    private String secondteam;
    private int firstpt;
    private int secondpt;

    public Sport(String fteam, String steam, int fpoint, int spoint) {
        this.firstteam = fteam;
        this.secondteam = steam;
        this.firstpt = fpoint;
        this.secondpt = spoint;

    }

    public String getFirst() {
        return this.firstteam;
    }

    public String getSecond() {
        return this.secondteam;
    }

    public int getFPoint() {
        return this.firstpt;
    }

    public int getSPoint() {
        return this.secondpt;
    }
    int win = 0;
    int lose = 0;

    public int getComparison1() {
        if (this.firstpt > this.secondpt) {
            return win++;
        } else {
            return lose++;
        }
    }
    public int getComparison2(){
        if (this.secondpt>this.firstpt){
            return win++;
        }else {
            return lose++;
        }
        
    }
}

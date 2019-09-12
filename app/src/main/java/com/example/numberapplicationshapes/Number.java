package com.example.numberapplicationshapes;

public class Number {
    int number;
    public boolean istrainguaular(){
        int x = 1;
        int trainguaularnumber = 1;
        while (trainguaularnumber <number){
            x++;
            trainguaularnumber = trainguaularnumber+x;
        }
        if (trainguaularnumber == number){
            return true;
        }else{
            return false;
        }
    }

    public boolean issqaure(){
        double sqaureRoot = Math.sqrt(number);
        if (sqaureRoot == Math.floor(sqaureRoot)){
            return true;
        }else{
            return false;
        }
    }
}

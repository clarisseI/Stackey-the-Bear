/*Clarisse Ilibagiza Umulisa
 * Program 2: Stackey and Queuey
 * October 7th 2019*/

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class Stackey{

static class Item {
  int time,x, y;
  public Item(int time, int x, int y){
    this.time=time;
    this.x=x;
    this.y=y;
   }
  }

public static void main(String[]args){
  int time=0;
  int x=0;
  int y=0;
  int i=0;
  int time2, x2, y2;
 ArrayList<Item> array= new ArrayList<Item>();
 Stack<Item> stack=new Stack<Item>(); 
 Item activecall=null;
 Scanner kb= new Scanner(System.in);
 
 while(kb.hasNextInt()){
    time2=kb.nextInt();
    x2=kb.nextInt();
    y2=kb.nextInt();
    array.add(new Item(time2,x2,y2));
    }

 while(activecall !=null || !stack.isEmpty()|| i!=array.size()){
   if(activecall==null){// if the Item is null and the stack is not empty then we pop the stack
     if(!stack.isEmpty()){
       activecall=stack.pop();
    }
      }
   else {
         if(x!=activecall.x){// the x is different from where the stackey is 
            if(x<activecall.x)// if x is less than where the stackey is
               x++;// increment the x of the stackey to be in the new position
            else
              x--;// decrement the x of the stackey to be in the new position
           }
         else if(y!=activecall.y){// the y is different from where the stackey is
            if(y<activecall.y)// if y is less than where the stackey is
              y++;// increment the y of the stackey to be in the new position
           else
              y--;// decrement the y of the stackey to be in the new positon
           }
         else if( x==activecall.x && y==activecall.y){ // if the x and y are equal to the one on the stack
            System.out.println("At " + time + ", Stackey puts out the fire at (" + x+","+y+").");
            activecall=null;// make the activecall to be null again
            if(!stack.isEmpty()){
              activecall=stack.pop();
                System.out.println("At " + time + ", Stackey moves to fire at ("+ activecall.x + ","+activecall.y + ").");
              }
           }
    }
   if(i!=array.size()){// we won't go over the array size
      if(time==array.get(i).time){// the time we have equals to the one on the array[i] and the active call is null
        System.out.println("At " + time + ", Call comes in for fire at ("+ array.get(i).x + ","+array.get(i).y + ").");
        if(activecall==null){
          activecall=array.get(i);// the active call equals to the array[i]
        System.out.println("At " + time + ", Stackey moves to fire at ("+ activecall.x + ","+activecall.y + ").");
        }
        else
          stack.push(array.get(i));// else we push on the array 
          i++;// increment for the array
      } 
    }
      time++;// increment the time
  } // while loop
  }// main
 }// class
  

 
       
       
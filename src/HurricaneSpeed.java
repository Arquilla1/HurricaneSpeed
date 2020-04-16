/*Prompt user to enter a speed
Have different categories of speed
Match user input to a category of speed
print out speed that matches category
If user speed does not match category print too weak
 */


import java.util.Scanner;

public class HurricaneSpeed {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
int speed = 0;
        while (true) {
            System.out.println("Enter the speed");
            speed = s.nextInt();
            if ((speed >= 74) && (speed <= 95)) {
                System.out.println("Category 1");

            }
        else if ((speed >=96) && (speed <=110)) {
                System.out.println("Category 2");

            }else if ((speed >= 111) && (speed <=129)) {
                System.out.println("Category 3");

            }else if ((speed >= 130) && (speed <=156)){
                        System.out.println("Category 4");

                     if ((speed >= 157))
                            System.out.println("Category 5");

                        } else if ((speed >= 130))
                        System.out.println("Category 4");

                        else if ((speed >= 111)) {
                            System.out.println("Category 3");

                        } else if ((speed >= 96)) {
                            System.out.println("Category 2");

                        } else  if ((speed >= 74)) {
                            System.out.println("Category 1");

                        } else {
                        System.out.println("too weak  ");



        }}}}




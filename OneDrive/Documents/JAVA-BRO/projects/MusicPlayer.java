package projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args){
        String filePath = "C:\\Users\\hp\\OneDrive\\Documents\\JAVA-BRO\\projects\\om namo bhagavathi.wav";


        File file = new File(filePath);

        try(  Scanner scanner = new Scanner(System.in);
              AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);


            String response ="";
            while(!response.equals("Q")){
                System.out.println("*********");
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.println("*********");

                System.out.print("Enter your choice (P,S,R,Q): ");
                response = scanner.next().toUpperCase();
                switch(response){
                    case "P"->clip.start();
                    case "S"->clip.stop();
                    case "R"->clip.setMicrosecondPosition(0);
                    case "Q"->clip.close();
                    default ->System.out.println("Invalid Choice");
                }
            }


        }
        catch(FileNotFoundException e){
            System.out.println("Could not Locate file");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio File not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e){
            System.out.println("Something Went Wrong");

        }
        finally{
            System.out.println("Thank you!");

        }
    }
}


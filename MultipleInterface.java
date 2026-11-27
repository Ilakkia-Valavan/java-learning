import java.util.Scanner;

public class MultipleInterface {
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        

        while(true)
        {
            SmartPhone smartPhone = new SmartPhone();
            System.out.println("Using SmartPhone features:");
            System.out.println("1. Camera");
            System.out.println("2. Music Player");
            System.out.println("3. Phone");
            System.out.println("4. Exit");
            System.out.println("enter your choice:");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1->
                {
                    smartPhone.takePhoto();
                    smartPhone.recordVideo();
                }
                case 2->
                {
                    smartPhone.playMusic();
                    smartPhone.pauseMusic();
                    break;
                }
                case 3->
                {
                    System.out.print("Enter number to call: ");
                    String callNumber = scanner.next();
                    smartPhone.makeCall(callNumber);
                    smartPhone.receiveCall("987-654-3210");
                }
                case 4->
                {
                    System.out.println("Exiting...");
                    return;
                }
                default->
                    System.out.println("Invalid choice.");
            }
    }
    }
}



interface Camera
{
    void takePhoto();
    void recordVideo();
}

interface MusicPlayer
{
    void playMusic();
    void pauseMusic();
}

interface Phone
{
    void makeCall(String number);
    void receiveCall(String number);
}

class SmartPhone implements Camera, MusicPlayer, Phone
{
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music...");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Making a call to " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Receiving a call from " + number);
    }
}
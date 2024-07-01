package SystemDesign;

public class SystemDesign1 {
    public static void main(String[] args) {
        //Game design
        boolean run=true;
        boolean jump = false;
        boolean fly= true;
        boolean weapon=false;
        /*
        god mode-all features
        legend mode - run and weapon
        else regular mode
         */

        //bad implementation
        if (jump==true){
            if (run==true){
                if (fly==true){
                    if (weapon==true){
                        System.out.println("God mode is activated");
                    }
                }
            }
        } else if (run==true) {
            if (weapon==true){
                System.out.println("Legend mode is activated");
            }
        }else {
            System.out.println("Regular mode is activated");
        }

        //good implementation
        if (jump&&run&&weapon&&fly){
            System.out.println("Gode mode ");
        }
        else if (run && weapon){
            System.out.println("Legend mode");
        }
        else {
            System.out.println("Regular mode is activated");
        }

    }
}

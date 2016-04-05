/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

/**
 *
 * @author paul
 */
public class MessagePrinter {
    
    
    private String helloFromClass;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String[] options;
    
    public MessagePrinter(){
        System.out.println("Starting MessagePrinter Constructor...");
      
        helloFromClass = "Hello from MessagePrinter!";
        
        option1 = "Bananas";
        option2 = "Apples";
        option3 = "Pears";
        option4 = "Strawberries";
        
        options = new String[4];
        
        options[0] = option1;
        options[1] = option2;
        options[2] = option3;
        options[3] = option4;
        
        System.out.println("Finished MessagePrinter Constructor...");  
    }
    
    
    /**
     * Public messages can be accessed from other classes
     */
    public void printMessage(){
        System.out.println(helloFromClass);
    }
    
    public void printMenuOptions(){
        System.out.println("pick an option: ");
        
        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1) + ". " + options[i]);
        }
        
        System.out.println("Selection:");
    }
    
    public void printSelection(String selected){

        
        switch(selected){
        
            case "1":
                System.out.println("You Selected: " + options[0]);
                break;
            case "2":
                System.out.println("You Selected: " + options[1]);
                break;
            case "3":
                System.out.println("You Selected: " + options[2]);
                break;
            case "4":
                System.out.println("You Selected: " + options[3]);
                break;
            default:
                System.out.println("I'm Sorry " + selected + " is not an available option");
                
        }
    }
}

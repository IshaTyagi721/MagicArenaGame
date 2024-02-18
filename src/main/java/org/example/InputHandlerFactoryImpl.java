package org.example;

import java.util.Scanner;

public class InputHandlerFactoryImpl implements InputHandlerFactory {
    @Override
    public InputHandler createInputHandler(InputType inputType) throws IllegalArgumentException {
        if(inputType.equals(InputType.FILE)){
            System.out.println("Enter filename:");
            String filename = new Scanner(System.in).next();
            return new FileInputHandler(filename);
        }
        else if(inputType.equals(InputType.COMMAND_LINE)){
            return new CommandLineInputHandler();
        }
        else{
            throw new IllegalArgumentException("Invalid input source: " + inputType);
        }
    }
}

package day5.libraryManagementSystem;

import java.util.InputMismatchException;

public class ExceptionHandler {

    @FunctionalInterface
    public interface Executable {
        void execute() throws Exception;
    }


    public static void runSafely(Executable action) {

        try {
            action.execute();
        } catch (IllegalArgumentException e ) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("System Error: Requested item does not exist");
        } catch (InputMismatchException e) {
            System.out.println("Input validation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

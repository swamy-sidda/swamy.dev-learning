package exceptionhandling;

import java.sql.SQLException;
//its not a problem that throwing an exception from main method and
//throwing an exception is not an mandatary thing, that we are predicting that exception may occurs
//throwing an exception is not terminating the process
//if exception occurs at runtime then procee will complete exactly without fail
// it fails at runtime without producing result


public class MainDeclaration {
    public static void main(String[] args) throws Exception {
        System.out.println("Kumarswamy");
        //it will raise exception in console jvm won't chance to exceute
        throw new Exception("Kumar");
    }
}

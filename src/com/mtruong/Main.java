package com.mtruong;

import com.mtruong.model.Invoice;
import com.mtruong.model.PersonObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n Practice using Intellij IDEA with Java Development \n");
        renamedTriplePrintAllModelsInHelloWorldModule();
//        Gson gson = new Gson();
    }

    private static void renamedTriplePrintAllModelsInHelloWorldModule() {
        newRefactoredClassName();
        printPerson();
        printInvoice();
    }

    private static void printInvoice() {
        @SuppressWarnings("deprecation")
        var invoice1 = new Invoice("New Invoice Title", new Date(2022, Calendar.MARCH, 2), 1111.99);
        System.out.println(invoice1);
    }

    private static void newRefactoredClassName() {
        var newClassInstance = new NewClass();
        System.out.println(newClassInstance); // printing the Class.toString()
    }

    private static void printPerson() {
        var person1 = new PersonObject();
        System.out.println(person1);

        var peopleArr = new ArrayList<PersonObject>();
    //noinspection:
        for (int i = 0; i < 10; i++) {
//            peopleArr.add(new PersonObject("First " + i, "Last" + i, 20 + 1));
            System.out.println("The value is " + i);
        }
    }


}

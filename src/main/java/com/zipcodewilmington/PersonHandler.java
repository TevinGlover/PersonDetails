package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
       int count = 0; // create a `counter`

           while ( count <= personArray.length -1) {// while `counter` is less than length of array
               // need -1 to stay in bonds
               // begin loop
               count++;
               Person personAtIndex = personArray[count-1];// use `counter` to identify the `current Person` in the array
                //the count must be - one to not skip the frist indx
               String personName = personAtIndex.toString(); // get `string Representation` of `currentPerson`
               result += personName; // append `stringRepresentation` to `result` variable
           }
            // end loop
        return result;
    }



    public String forLoop( ) {
        String result = "";

        int count = 0; // identify initial value
        String perx;// identify terminal condition
        int i = 0; // identify increment

        // use the above clauses to declare for-loop signature
        for (i = 0; i <= personArray.length-1 ; i++) {  // begin loop
            count++;  // use `counter` to identify the `current Person` in the array
            Person x = personArray[count - 1]; // get `string Representation` of `currentPerson`
            perx = x.toString();  // append `stringRepresentation` to `result` variable
            result += perx;
            // end loop


        }
        return result;
    }

    public String forEachLoop() {
        String result = "";
        //personArray // identify array's type
        //Person person// identify array's variable-name

           for (Person person:personArray) { // use the above discoveries to declare for-each-loop signature
               // begin loop
               String name = person.toString(); // get `string Representation` of `currentPerson`
               result += name; // append `stringRepresentation` to `result` variable
               // end loop
           }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray; // this gets the person array.
    }
}

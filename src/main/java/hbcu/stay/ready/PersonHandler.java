package hbcu.stay.ready;


public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }
    // create a `counter`
    // while `counter` is less than length of array
    // begin loop
    // use `counter` to identify the `current Person` in the array
    //get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while(counter < personArray.length){
            Person currentPerson = personArray[counter];
            String Representation = String.valueOf(currentPerson);
            counter++;
            result += Representation;

        }
        return result;
    }



    public String forLoop() {
        // identify initial value
        // identify terminal condition
        // identify increment
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        String result = "";
        for(int counter = 0; counter<personArray.length; counter++){
            Person currentPerson = personArray[counter];
            String Representation = String.valueOf(currentPerson);
            result += Representation;

        }

        return result;
    }



    public String forEachLoop() {
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        String result = "";
        for(Person counter :personArray){
            Person currentPerson = personArray[counter];
            String Representation = String.valueOf(currentPerson);
            result += Representation;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}

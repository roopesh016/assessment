public class FizzBizz {

    int m1 =3;// setting the value as 3 (for to display the fizz at multiple by 3)

    int m2 =5; // setting the value as 5 (for to display the buzz at multiple by 5)

    public void value(int n) {

        //iteration based upon the value n
        for(int i=1; i<=n ; i++) {

            //Initializing the string
            String statement ="";

            //If i value equals to m1 then increment by 3 and set the actual statement to print
            if (i == m1) {
                m1 = i+m1;
                statement = statement+"Fizz";
            }

            //If i value equals to m2 then increment by 5 and set the actual statement to print
            else if(i == m2) {
                m2 = i+m2;
                statement = statement+"Buzz";
            }

            // If both the above statements are not passed then check if it is a blank statement and then print the value else print the statement which was set in the above two statements
            if(statement =="") {
                System.out.println(i);
            } else {
                System.out.println(statement);
            }
        }
    }

    public static void main(String[] args) {
        FizzBizz pt = new FizzBizz();
        pt.value(100);
    }
}

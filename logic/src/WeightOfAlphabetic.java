import java.util.HashMap;
import java.util.Map;

public class WeightOfAlphabetic {

    String actualString="happy new year";

    String alphabeticValue=" abcdefghijklmnopqrstuvwxyz";

    //split the actual string based upon space
    String[] actualStringToArray = actualString.split(" ");

    //converting alphabetical to char array
    char[] alpha = alphabeticValue.toCharArray();


    public void logicTwo(){

        //creation of map to insert the key and value as string and integer for sorting the value
        HashMap<String,Integer> map = new HashMap<>();

        //Iteration of splited array
        for(int i =0;i<=actualStringToArray.length-1;i++){

            //conversion of string array to character array
            char[] charArrayValue = actualStringToArray[i].toCharArray();

            // set count value as zero
            int count=0;

            //Iteration for character array
            for(int j=0; j<=charArrayValue.length-1;j++){

                //Iteration for alphabetic array
                for(int k=0; k<=alpha.length-1;k++){

                    //comparison in between two array if equal then fetch the index value of alphabetic value and increment the count
                    if(charArrayValue[j]==alpha[k]){
                        count = count+alphabeticValue.indexOf(alpha[k]);
                    }
                }
            }

            //storing the string value and count of that particular string
            map.put(actualStringToArray[i],count);
        }

        //Iteration for map to fetch the key value based upon the asscending order
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+ " ");
        }
    }

    public static void main(String[] args) {
        WeightOfAlphabetic wt = new WeightOfAlphabetic();
        wt.logicTwo();
    }
}

package day20_nested_loop;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "appllle";
        String singleTimeCheckLetters = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            char outLetter = word.charAt(i);

            if (singleTimeCheckLetters.contains("" + outLetter)){
                continue;
            }


            for (int j = 0; j < word.length(); j++) {

                char inLetter = word.charAt(j);

                if (outLetter == inLetter){
                    count++;
                }

            }


            if (count > 1) {
                System.out.println(outLetter);
            }

            if (!singleTimeCheckLetters.contains("" + outLetter)){
                singleTimeCheckLetters += outLetter;

        }


    }
}}
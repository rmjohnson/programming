package rmjassign1;

public class LZW {
    
    //Compression method
    public String Compress(String input, String[] enTable, int enTableSize) {
        String codeList = ""; //The codeList to be outputted
        char nextChar; //A temporary nextChar variable
        int foundIt; //A flag used to see if a string was found in encode table
        String newString; //A temporary newString variable
        char[] tempCharArray; //A temporray character array to add spaces for the output

        //Set newString to the first character in the string to be compressed
        newString = "" + input.charAt(0); 
        //Loop through the entire input
        for (int i = 1; i < input.length(); i++) {
            //Set nextChar to the next character in the string to be compressed.
            nextChar = input.charAt(i);
            //Reset the foundIt flag
            foundIt = 0;
            //Search through the encodeTable to see if nextString + nextChar are in it
            for (int j = enTableSize; j >= 0; j--) {
                if (enTable[j].equals(newString + nextChar)) {
                    //If nextString + nextChar is in the encodeTable, then
                    //newString = newString + nextChar
                    newString = newString.concat(nextChar + "");
                    //Set off the flag so the other part of the algorithm doesn't run
                    foundIt = 1;
                }
            }
            //If the flag wasn't triggered, then nextChar + newString was not in
            //the encodeTable
            if (foundIt == 0) {
                //Append code of newString to code list
                codeList += findIndex(enTable, newString);
                //Add newString+nextChar to encode table
                enTable[enTableSize + 1] = newString + nextChar;
                //Increase the table size
                enTableSize++;
                //Set newString to nextChar
                newString = nextChar + "";
            }
        }
        //Append the code of newString to code list
        codeList += findIndex(enTable, newString);

        //Add spaces for output
        tempCharArray = codeList.toCharArray();
        codeList = "";
        for (int i = 0; i < tempCharArray.length; i++) {
            codeList += tempCharArray[i] + " ";
        }
        //Return the code list
        return codeList;
    }

    public String Decode(String input, String[] enTable, int enTableSize) {
        String unCompString = ""; ///The outputted uncompressed string
        //Temp variable for algorithm, set to the first number of the input
        int oldCode = Integer.parseInt(input.charAt(0) + ""); 
        int newCode; //Temp variable for algorithm
        String firstChar; //Temporary firstChar variable
        String tempStr; //Temporary string variable

        unCompString += enTable[oldCode]; //Decode oldCode and add it to ouput string
        //Set firstChar to the first character of decoding of oldCode
        firstChar = enTable[oldCode].charAt(0)+""; 
        //Loop through the input
        for (int i = 1; i < input.length(); i++) {
            //Set newCode to the next number in the input
            newCode = Integer.parseInt(input.charAt(i) + "");
            //Check if newCode is in the encodeTable
            if (newCode < enTableSize) {
                //If it is, set tempStr to the decoding of newCode
                tempStr = enTable[newCode];
                //Append oldCode decoding and first char of tempStr to enTable
                enTable[enTableSize + 1] = enTable[oldCode] + tempStr.charAt(0);
                //Increase the size of enTable to account for new element
                enTableSize++;
            } else { //If newCode is not in the encodeTable..
                //Set tempStr to decoding of oldCode
                tempStr = enTable[oldCode];
                //Set tempStr to tempStr + the first char tempStr
                tempStr = tempStr.concat(tempStr.charAt(0) + "");
                //Add tempStr to the enTable
                enTable[enTableSize + 1] = tempStr;
                //Increase the size of enTable to account for new element
                enTableSize++;
            }
            //Add tempStr to the end of the output
            unCompString += tempStr;
            //Set firstChar to the first character of tempStr
            firstChar = tempStr.charAt(0) + "";
            //Set oldCode to newCode for next loop
            oldCode = newCode;
        }
        //Return the uncompressed string
        return unCompString;
    }

    public int findIndex(String[] haystack, String needle) {
        //Loop through the haystack to find the needle
        for (int i = 0; i < haystack.length; i++) {
            if (needle.equals(haystack[i])) {
                return i;
            }
        }
        return -1; //Return -1 if the needle was not found.
    }
}

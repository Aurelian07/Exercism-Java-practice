class SqueakyClean {
    static String clean(String identifier) {
        
        identifier = identifier.replace(" ","_"); 

        identifier = identifier.replace("4","a") ;
        identifier = identifier.replace("3","e") ;
        identifier = identifier.replace("0","o") ;
        identifier = identifier.replace("1","l") ;
        identifier = identifier.replace("7","t") ;
        


        String [] words =identifier.split("-") ;
        StringBuilder result = new StringBuilder(words[0]) ;

        for (int i = 1 ; i < words.length ; i++){
            String word = words[i] ;
            
            if (!word.isEmpty()){
                String firstLetter = word.substring(0,1).toUpperCase();
                String restOfWord = word.substring(1);

                result.append(firstLetter).append(restOfWord);
            }
        }
        
        String lastPart = result.toString();
        StringBuilder finalResult = new StringBuilder() ;
        for (int i = 0; i < lastPart.length(); i++) {
            char currentChar = lastPart.charAt(i);
            
            if (Character.isLetter(currentChar) || currentChar == '_') {
                finalResult.append(currentChar);
                }
            }
        return finalResult.toString();
        }
    }


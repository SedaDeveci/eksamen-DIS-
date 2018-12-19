package utils;

public final class Encryption {

  public static String encryptDecryptXOR(String rawString) {

    // If encryption is enabled in Config.
    if (Config.getEncryption()) {

      // The key is predefined and hidden in code
      // TODO: Create a more complex code and store it somewhere better FIX
      char[] key = Config.getKEY().toCharArray();

      // Stringbuilder enables you to play around with strings and make useful stuff
      StringBuilder thisIsEncrypted = new StringBuilder();

      // TODO: This is where the magic of XOR is happening. Are you able to explain what is going on?
      /**
       *

       -	Det er først år rawstring ikke indeholder flere karaktere at for-loopet forstætter med at køre
       -	Der sker en omdannelse af karakteren, der er placeret på i’ ets plads i charArray.
       -    Den omdannes til en binære værdi ved at bruge  følgende ”^”.
       -	Som det kan ses i koden bruges XOR vil at lægge begge binære værdier sammen
       -    og derfor sker der det at en ny binær værdi, som bliver omdannet til en char.
       -    Det er i ThisIsEncrypted at denne char værdi tilføjes og den tilføjes ved at anvende følgende : thisIsEncrypted.append
       -	”%” er brugt til at starte charArray igen i tilfælde af at man er nået til endelsen af charArray.
       -    Dog starter charArray kun igen hvis rawString længden er større end CharArray keys længde.




       */
      for (int i = 0; i < rawString.length(); i++) {
        thisIsEncrypted.append((char) (rawString.charAt(i) ^ key[i % key.length]));
      }

      // We return the encrypted string
      return thisIsEncrypted.toString();

    } else {
      // We return without having done anything
      return rawString;
    }
  }
}

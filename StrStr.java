class StrStr {
    private final int PRIME=101;
    public int strStr(String text, String needle) {
        if(needle.length()>text.length()){
            return -1;
        }
        int patternLength = needle.length();
        double patternHash = calculateHash(needle);
        double textHash = calculateHash(text.substring(0,patternLength));
        for(int i=0;i<=text.length()-patternLength;i++){
            if(textHash == patternHash) {
            if(text.substring(i, i+patternLength).equals(needle)) {
                return i;
                }
            }
            if (i < text.length() - patternLength) {
            textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
        return -1;
    }

    private double calculateHash(String str){
        double hash=0;
        for(int i=0;i<str.length();i++){
            hash+=str.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }
    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
      double newHash = (prevHash - oldChar) / PRIME;
      newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
      return newHash;
    }
}

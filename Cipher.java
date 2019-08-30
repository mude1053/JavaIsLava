public class Cipher {
   private String toCipher;
    private int shift;

    public Cipher(){
        this.toCipher="we love Java.";
        this.shift=4;
    }
    public Cipher(String toCipher,int shift){
     this.toCipher=toCipher;
     this.shift=shift;
    }
public int getShift(){
        return shift;
}
public String getToCipher(){
        return toCipher;
}

public void displayCurrentString(){
    System.out.println(this.toCipher);
}
public String cipher() {
    String ciphered = "";
    int temp=0;
    for (int i = 0; i < this.toCipher.length(); i++) {
        temp=this.toCipher.charAt(i);
        temp=temp+this.shift;
        ciphered = ciphered +(char)temp;
    } return ciphered;
}
public String deCipher (String toDeCipher) {
    String deCiphered = "";
    int temp;
    for (int i = 0; i < toDeCipher.length(); i++) {
        temp = toDeCipher.charAt(i);

            temp = temp - this.shift;

            deCiphered = deCiphered + (char) temp;

    }
    return deCiphered;
}
}


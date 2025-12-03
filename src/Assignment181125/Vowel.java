package Assignment181125;

public class Vowel {
    void isvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
    public  static void main(String[] args) {
        Vowel demo = new Vowel();
        demo.isvowel('a');

    }
}

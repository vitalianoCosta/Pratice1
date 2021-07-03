import java.util.Locale;

public class StringHelper {

    private String frase;

    public StringHelper() {

    }

    public void setString(String algo) {
        this.frase = algo;
    }

    public String getString() {
        return this.frase;
    }

    public String reverse(String input) {

        this.frase = "";

        if (input.length() > 0) {
            char[] letras = new char[input.length()];

            for (int i = 0; i < input.length(); i++) {
                letras[i] = input.charAt(input.length() - 1 - i);
                this.frase = this.frase + letras[i];
            }

            return this.frase;
        } else {
            return this.frase;
        }


    }

    public String encoder(String enc) {

        if (enc.length() > 0) {
            char[] letras = new char[enc.length()];
            letras = enc.toCharArray();

            for (int i = 0; i < enc.length(); i++) {
                switch (letras[i]) {
                    case 'a':
                        letras[i] = '1';
                        break;
                    case 'e':
                        letras[i] = '2';
                        break;
                    case 'i':
                        letras[i] = '3';
                        break;
                    case 'o':
                        letras[i] = '4';
                        break;
                    case 'u':
                        letras[i] = '5';
                        break;
                    case 'A':
                        letras[i] = '1';
                        break;
                    case 'E':
                        letras[i] = '2';
                        break;
                    case 'I':
                        letras[i] = '3';
                        break;
                    case 'O':
                        letras[i] = '4';
                        break;
                    case 'U':
                        letras[i] = '5';
                        break;

                    default:
                        return enc;


                }
                this.frase = "";
                for (int e = 0; e < enc.length(); e++) {
                 //   letras[e] = enc.charAt(enc.length() - 1 - e);

                    this.frase = this.frase + letras[e];
                }
            }


        } return this.frase;
    }
}



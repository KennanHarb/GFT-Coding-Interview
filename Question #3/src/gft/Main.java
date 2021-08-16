package gft;

public class Main {
    public static void main(String[] args) {
        String[] pessoas = new String[6];
        Mineiro mineiro01 = new Mineiro();
        Paulista paulista01 = new Paulista();
        Carioca carioca01 = new Carioca();
        pessoas[0] = mineiro01.giria();
        pessoas[1] = paulista01.giria();
        pessoas[2] = carioca01.giria();
        pessoas[3] = mineiro01.giria();
        pessoas[4] = paulista01.giria();
        pessoas[5] = carioca01.giria();
        for (int i = 0; i <=5; i++){
            System.out.println(pessoas[i]);
        }
    }
}

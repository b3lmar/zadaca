public class Zadatak1 {
    public static void main(String[] args) {
        String Recenica = "Trazim koliko se puta adi nasmijao. adi je zaista zabavan tip.";//zadana rečenica
        String KljucnaRijec = "adi";//ključna riječ
        String RazdvajanjeRijeci[] = Recenica.split(" ");//split funkcija - razdvaja riječi na space

        int brojac = 0;//postavljanje brojača na nulu
        for (int i = 0; i < RazdvajanjeRijeci.length; i++) {
            //**prolazak kroz ključnu rečenicu koja je u koraku "String RazdvajanjeRijeci"
            // rastavljena tako da program može da svaku riječ provjerava zasebno
            // i provjerava da li se "KljucnaRijec" nalazi u "RazdvajanjeRijeci"*/

            if (KljucnaRijec.equals(RazdvajanjeRijeci[i]))
                //**Provjera da li se ključna riječ poklapa sa riječima koje se nalaze
                // u ključnoj rečenici koju smo naveli*/

                brojac++; // inkrementacija brojača ako program naiđe na ključnu riječ
        }
        System.out.println("Riječ " + KljucnaRijec + " pojavljuje se " + brojac + " puta");
    }
}

// funkciju split sam našao na stackoverflow
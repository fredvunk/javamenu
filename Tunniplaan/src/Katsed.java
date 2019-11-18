public class Katsed {
    public static void main(String[] args) {
        // Loo Tund objekt
        Tund annaTund = new Tund();
        // Lisa väärtused

        Tund esimeneTund = new Tund();
        esimeneTund.tund = "1";
        esimeneTund.algus = "11:5";
        esimeneTund.lopp = "14:00";
        esimeneTund.aine = "JAVA programmeerimine";
        esimeneTund.grupp = "VS18";
        esimeneTund.opetaja = "Ly Otsa";
        esimeneTund.ruum = "A418";

        Tund teineTund = new Tund();
        teineTund.tund = "2";
        teineTund.algus = "11:5";
        teineTund.lopp = "14:00";
        teineTund.aine = "JAVA programmeerimine";
        teineTund.grupp = "VS18";
        teineTund.opetaja = "Ly Otsa";
        teineTund.ruum = "A418";

        Tund kolmasTund = new Tund();
        kolmasTund.tund = "3";
        kolmasTund.algus = "11:5";
        kolmasTund.lopp = "14:00";
        kolmasTund.aine = "JAVA programmeerimine";
        kolmasTund.grupp = "VS18";
        kolmasTund.opetaja = "Anna Karutina";
        kolmasTund.ruum = "A411";

        annaTund.tund = "4";
        annaTund.algus = "11:5";
        annaTund.lopp = "14:00";
        annaTund.aine = "JAVA programmeerimine";
        annaTund.grupp = "VS18";
        annaTund.opetaja = "Anna Karutina";
        annaTund.ruum = "A411";

        Tund neljasTund =  new Tund();
        neljasTund.tund = "4";
        neljasTund.algus = "4";
        neljasTund.lopp = "4";
        neljasTund.aine = "4";
        neljasTund.grupp = "4";
        neljasTund.opetaja = "4";
        neljasTund.ruum = "4";

        Tund viiesTund = new Tund();
        viiesTund.tund = "5";
        viiesTund.algus = "11:5";
        viiesTund.lopp = "14:00";
        viiesTund.aine = "JAVA programmeerimine";
        viiesTund.grupp = "VS18";
        viiesTund.opetaja = "Anna Karutina";
        viiesTund.ruum = "A411";

        Paev esmaspaev = new Paev();
        esmaspaev.kuupaev = "2019-11-18";
        esmaspaev.tundideNimekiri = new ArrayList<Tund>();

    }
}

import automobil.Automobil;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Automobil skoda = new Automobil(2020, "Skoda Superb");
        Automobil dacia = new Automobil(2015, "Dacia Logan");
        Automobil mazda = new Automobil(2017, "Mazda");
        Automobil renault = new Automobil(2021, "Renault");
        Automobil volkswagen = new Automobil(2019, "Volkswagen Polo");

        Set<Automobil> automobilSet = new HashSet<>();
        automobilSet.add(skoda);
        automobilSet.add(dacia);
        automobilSet.add(mazda);
        automobilSet.add(renault);
        automobilSet.add(volkswagen);

         Set<Automobil> sorted = automobilSet.stream()
                 .sorted()
                 .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("HashSet de automobile care sunt sortate ascendent după anul producerii");
        System.out.println(sorted);


        TreeSet<Automobil> automobilTreeSet = new TreeSet<>();
        automobilTreeSet.add(skoda);
        automobilTreeSet.add(dacia);
        automobilTreeSet.add(mazda);
        automobilTreeSet.add(renault);
        automobilTreeSet.add(volkswagen);

        System.out.println("                                                                                       ");
        System.out.println("TreeSet de automobile care sunt sortate utilizînd un Comparator");
        System.out.println(automobilTreeSet);

    }
}
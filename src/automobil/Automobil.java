package automobil;

import java.util.Objects;

public class Automobil implements Comparable<Automobil> {

    private int anProducere;
    private String denumire;

    public Automobil(int anProducere, String denumire) {
        this.anProducere = anProducere;
        this.denumire = denumire;
    }

    public int getAnProducere() {

        return anProducere;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public boolean equals(Object o) {
        Automobil automobil = (Automobil) o;
        return anProducere == automobil.getAnProducere();
    }
    @Override
    public int hashCode() {
        return anProducere;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "anProducere=" + anProducere +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    @Override
    public int compareTo(Automobil o) {
        return this.anProducere - o.getAnProducere();



    }


    }


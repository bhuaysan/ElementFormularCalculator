package com.bhuaysan.logic;

import com.bhuaysan.model.chemicalComponents.Chemistry;

import java.util.ArrayList;
import java.util.List;

public class Calculation {

    private Double dSumWeightPercent;
    private Double dSumMoleUnits;
    private Double dSumOxygenUnits;
    private Double dSumNormalizedOxygenUnits;

    private List<Double> moleUnits = new ArrayList<>();
    private List<Double> oxygenUnits = new ArrayList<>();
    private List<Double> normalizedOxygenUnits = new ArrayList<>();
    private List<Double> atomUnits = new ArrayList<>();


    /**
     * Standard constructor
     */
    public Calculation() {
    }

    /**
     * Calculates the chemical composition of the mineral.
     *
     * @param weightPercent : {@link List} : measured Weight percent of the EMP analysis.
     * @param oxyNumber     : Number of oxygens by mineral.
     */
    public void calculation(List<Double> weightPercent, Double oxyNumber) {
        Chemistry components = new Chemistry();

        dSumWeightPercent = sumList(weightPercent);

        for (int i = 0; i < weightPercent.size(); i++) {
            moleUnits.add(weightPercent.get(i) / components.getMolecularWeight().get(i));
            System.out.println("Mole Units: " + moleUnits.get(i));
        }

        dSumMoleUnits = sumList(moleUnits);

        for (int i = 0; i < weightPercent.size(); i++) {
            oxygenUnits.add(moleUnits.get(i) * components.getOxygenUnitsMultiplier().get(i));
            System.out.println("Oxygen Units: " + oxygenUnits.get(i));
        }

        dSumOxygenUnits = sumList(oxygenUnits);

        for (int i = 0; i < weightPercent.size(); i++) {
            normalizedOxygenUnits.add(oxygenUnits.get(i) * oxyNumber / dSumOxygenUnits);
            System.out.println("Normalized Oxygen Units: " + normalizedOxygenUnits.get(i));
        }

        dSumNormalizedOxygenUnits = sumList(normalizedOxygenUnits);

        for (int i = 0; i < weightPercent.size(); i++) {
            atomUnits.add(normalizedOxygenUnits.get(i) * components.getAtomUnitsMultiplier().get(i));
            System.out.println("Atoms Units: " + atomUnits.get(i));
        }
    }

    /**
     * Method to sum a list.
     *
     * @param listToSum: {@link List} with element {@link Double}.
     * @return : Double
     */
    public Double sumList(List<Double> listToSum) {
        double sum = 0.0d;
        for (int i = 0; i < listToSum.size(); i++) {
            sum += listToSum.get(i);
        }
        return sum;
    }


    public  Double getSumWeightPercent() {
        return dSumWeightPercent;
    }

    public Double getSumMoleUnits() {
        return dSumMoleUnits;
    }

    public Double getSumOxygenUnits() {
        return dSumOxygenUnits;
    }

    public Double getSumNormalizedOxygenUnits() {
        return dSumNormalizedOxygenUnits;
    }

    public List<Double> getMoleUnits() {
        return moleUnits;
    }

    public List<Double> getOxygenUnits() {
        return oxygenUnits;
    }

    public List<Double> getNormalizedOxygenUnits() {
        return normalizedOxygenUnits;
    }

    public List<Double> getAtomUnits() {
        return atomUnits;
    }
}

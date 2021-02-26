package com.bhuaysan.model.chemicalComponents;

import java.util.ArrayList;
import java.util.List;

public class Chemistry {

    //molecular weight
    private static final double GFW_SiO2 = 60.084d;
    private static final double GFW_TiO2 = 79.866d;
    private static final double GFW_Al2O3 = 101.961d;
    private static final double GFW_Cr2O3 = 151.99d;
    private static final double GFW_Fe2O3 = 159.688d;
    private static final double GFW_FeO = 71.844d;
    private static final double GFW_MnO = 70.937d;
    private static final double GFW_MgO = 40.304d;
    private static final double GFW_CaO = 56.077d;
    private static final double GFW_Na2O = 61.979d;
    private static final double GFW_K2O = 94.196d;
    private static final double GFW_H2O = 18.015d;

    //oxygen units
    private static final double OXYGEN_UNITS_SiO2 = 2.0d;
    private static final double OXYGEN_UNITS_TiO2 = 2.0d;
    private static final double OXYGEN_UNITS_Al2O3 = 3.0d;
    private static final double OXYGEN_UNITS_Cr2O3 = 3.0d;
    private static final double OXYGEN_UNITS_Fe2O3 = 3.0d;
    private static final double OXYGEN_UNITS_FeO = 1.0d;
    private static final double OXYGEN_UNITS_MnO = 1.0d;
    private static final double OXYGEN_UNITS_MgO = 1.0d;
    private static final double OXYGEN_UNITS_CaO = 1.0d;
    private static final double OXYGEN_UNITS_Na2O = 1.0d;
    private static final double OXYGEN_UNITS_K2O = 1.0d;
    private static final double OXYGEN_UNITS_H2O = 1.0d;

    //atom units
    private static final double ATOM_UNITS_Si = 0.5d;
    private static final double ATOM_UNITS_Ti = 0.5d;
    private static final double ATOM_UNITS_Al2O3 = (2.0d / 3.0d);
    private static final double ATOM_UNITS_Cr2O3 = (2.0d / 3.0d);
    private static final double ATOM_UNITS_Fe2O3 = (2.0d / 3.0d);
    private static final double ATOM_UNITS_FeO = 1.0d;
    private static final double ATOM_UNITS_MnO = 1.0d;
    private static final double ATOM_UNITS_MgO = 1.0d;
    private static final double ATOM_UNITS_CaO = 1.0d;
    private static final double ATOM_UNITS_Na2O = 2.0d;
    private static final double ATOM_UNITS_K2O = 1.0d;
    private static final double ATOM_UNITS_H2O = 2.0d;


    /**
     * Standard constructor
     */
    public Chemistry() {
    }

    /***
     * Adds the molecular weight of each oxide to a list.
     * @return : {@link List} of molecular weight.
     */
    public List<Double> getMolecularWeight() {
        List<Double> moleweight = new ArrayList<>();

        moleweight.add(this.GFW_SiO2);
        moleweight.add(this.GFW_TiO2);
        moleweight.add(this.GFW_Al2O3);
        moleweight.add(this.GFW_Cr2O3);
        moleweight.add(this.GFW_Fe2O3);
        moleweight.add(this.GFW_FeO);
        moleweight.add(this.GFW_MnO);
        moleweight.add(this.GFW_MgO);
        moleweight.add(this.GFW_CaO);
        moleweight.add(this.GFW_Na2O);
        moleweight.add(this.GFW_K2O);
        moleweight.add(this.GFW_H2O);


        return moleweight;
    }

    /**
     * Adds Oxygen units to a list
     * @return : {@link List} of oxygen units.
     */
    public List<Double> getOxygenUnitsMultiplier() {
        List<Double> oxygenUnitMultiplier = new ArrayList<>();

        oxygenUnitMultiplier.add(OXYGEN_UNITS_SiO2);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_TiO2);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_Al2O3);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_Cr2O3);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_Fe2O3);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_FeO);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_MnO);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_MgO);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_CaO);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_Na2O);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_K2O);
        oxygenUnitMultiplier.add(OXYGEN_UNITS_H2O);

        return oxygenUnitMultiplier;
    }


    /**
     * Adds Atom units to a list
     * @return : {@link List} of atom units.
     */
    public List<Double> getAtomUnitsMultiplier() {
        List<Double> atomUnitsMultiplier = new ArrayList<>();

        atomUnitsMultiplier.add(ATOM_UNITS_Si);
        atomUnitsMultiplier.add(ATOM_UNITS_Ti);
        atomUnitsMultiplier.add(ATOM_UNITS_Al2O3);
        atomUnitsMultiplier.add(ATOM_UNITS_Cr2O3);
        atomUnitsMultiplier.add(ATOM_UNITS_Fe2O3);
        atomUnitsMultiplier.add(ATOM_UNITS_FeO);
        atomUnitsMultiplier.add(ATOM_UNITS_MnO);
        atomUnitsMultiplier.add(ATOM_UNITS_MgO);
        atomUnitsMultiplier.add(ATOM_UNITS_CaO);
        atomUnitsMultiplier.add(ATOM_UNITS_Na2O);
        atomUnitsMultiplier.add(ATOM_UNITS_K2O);
        atomUnitsMultiplier.add(ATOM_UNITS_H2O);

        return atomUnitsMultiplier;
    }

}

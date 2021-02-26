/**
 * GUI Controller: This class controlls the main function of the GUI like buttons and switches.
 */

package com.bhuaysan.controller;

import com.bhuaysan.logic.Calculation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;


public class GuiController {

    @FXML
    private TextField tfOxy;

    @FXML
    private TextField tfSi;

    @FXML
    private TextField tfTi;

    @FXML
    private TextField tfAl;

    @FXML
    private TextField tfCr;

    @FXML
    private TextField tfFe;

    @FXML
    private TextField tfFeo;

    @FXML
    private TextField tfMn;

    @FXML
    private TextField tfMg;

    @FXML
    private TextField tfCa;

    @FXML
    private TextField tfNa;

    @FXML
    private TextField tfK;

    @FXML
    private TextField tfH;

    @FXML
    private Label lblSi;

    @FXML
    private Label lblTi;

    @FXML
    private Label lblAl;

    @FXML
    private Label lblCr;

    @FXML
    private Label lblFe;

    @FXML
    private Label lblFeo;

    @FXML
    private Label lblMn;

    @FXML
    private Label lblMg;

    @FXML
    private Label lblCa;

    @FXML
    private Label lblNa;

    @FXML
    private Label lblK;

    @FXML
    private Label lblH;

    @FXML
    private Label lblSiMU;

    @FXML
    private Label lblTiMU;

    @FXML
    private Label lblAlMU;

    @FXML
    private Label lblCrMU;

    @FXML
    private Label lblFeMU;

    @FXML
    private Label lblFeoMU;

    @FXML
    private Label lblMnMU;

    @FXML
    private Label lblMgMU;

    @FXML
    private Label lblCaMU;

    @FXML
    private Label lblNaMU;

    @FXML
    private Label lblKMU;

    @FXML
    private Label lblHMU;

    @FXML
    private Label lblSiOU;

    @FXML
    private Label lblTiOU;

    @FXML
    private Label lblAlOU;

    @FXML
    private Label lblCrOU;

    @FXML
    private Label lblFeOU;

    @FXML
    private Label lblFeoOU;

    @FXML
    private Label lblMnOU;

    @FXML
    private Label lblMgOU;

    @FXML
    private Label lblCaOU;

    @FXML
    private Label lblNaOU;

    @FXML
    private Label lblKOU;

    @FXML
    private Label lblHOU;

    @FXML
    private Label lblSiNOU;

    @FXML
    private Label lblTiNOU;

    @FXML
    private Label lblAlNOU;

    @FXML
    private Label lblCrNOU;

    @FXML
    private Label lblFeNOU;

    @FXML
    private Label lblFeoNOU;

    @FXML
    private Label lblMnNOU;

    @FXML
    private Label lblMgNOU;

    @FXML
    private Label lblCaNOU;

    @FXML
    private Label lblNaNOU;

    @FXML
    private Label lblKNOU;

    @FXML
    private Label lblHNOU;




    /**
     * Adds the textfields to a {@link List}.
     *
     * @return : List of weight percent
     */
    public List<Double> getWeightPercent() {
        List<Double> weightPercent = new ArrayList<>();

        weightPercent.add(Double.valueOf(tfSi.getText()));
        weightPercent.add(Double.valueOf(tfTi.getText()));
        weightPercent.add(Double.valueOf(tfAl.getText()));
        weightPercent.add(Double.valueOf(tfCr.getText()));
        weightPercent.add(Double.valueOf(tfFe.getText()));
        weightPercent.add(Double.valueOf(tfFeo.getText()));
        weightPercent.add(Double.valueOf(tfMn.getText()));
        weightPercent.add(Double.valueOf(tfMg.getText()));
        weightPercent.add(Double.valueOf(tfCa.getText()));
        weightPercent.add(Double.valueOf(tfNa.getText()));
        weightPercent.add(Double.valueOf(tfK.getText()));
        weightPercent.add(Double.valueOf(tfH.getText()));

        return weightPercent;
    }

    /**
     * Textfield for oxygen number of the mineral.
     *
     * @return double oxyNumber
     */
    public Double getOxyNumber() {
        double oxyNumber = Double.parseDouble(tfOxy.getText());
        return oxyNumber;
    }


    /**
     * Starts the calculation.
     */
    public void calculation() {
        Calculation calculation = new Calculation();

        List<Double> weightPercent = getWeightPercent();
        Double dOxyNumber = getOxyNumber();
        calculation.calculation(weightPercent, dOxyNumber);

        System.out.println("Test" + calculation.getAtomUnits());

        showResultAtomUnits(calculation);
        showResultMolecularUnits(calculation);
        showResultOxygenUnits(calculation);
        showResultNormalizedOxygenUnits(calculation);
    }

    /**
     * Updates the labels and shows the result of the atom units.
     * @param calculation: get List from calculation.
     */
    private void showResultAtomUnits(Calculation calculation) {
        lblSi.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(0)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblTi.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(1)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblAl.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(2)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCr.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(3)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFe.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(4)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFeo.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(5)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMn.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(6)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMg.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(7)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCa.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(8)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblNa.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(9)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblK.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(10)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblH.setText("" + BigDecimal.valueOf(calculation.getAtomUnits().get(11)).setScale(5, RoundingMode.HALF_UP).doubleValue());
    }

    /**
     * Updates the labels and shows the result of the molecular units.
     * @param calculation: get List from calculation.
     */
    private void showResultMolecularUnits(Calculation calculation){
        lblSiMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(0)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblTiMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(1)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblAlMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(2)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCrMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(3)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFeMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(4)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFeoMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(5)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMnMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(6)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMgMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(7)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCaMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(8)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblNaMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(9)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblKMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(10)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblHMU.setText("" + BigDecimal.valueOf(calculation.getMoleUnits().get(11)).setScale(5, RoundingMode.HALF_UP).doubleValue());

    }

    /**
     * Updates the labels and shows the result of the oxygen units.
     * @param calculation: get List from calculation.
     */
    private void showResultOxygenUnits(Calculation calculation){
        lblSiOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(0)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblTiOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(1)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblAlOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(2)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCrOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(3)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFeOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(4)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFeoOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(5)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMnOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(6)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMgOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(7)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCaOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(8)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblNaOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(9)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblKOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(10)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblHOU.setText("" + BigDecimal.valueOf(calculation.getOxygenUnits().get(11)).setScale(5, RoundingMode.HALF_UP).doubleValue());
    }

    /**
     * Updates the labels and shows the result of the normalized oxygen units.
     * @param calculation: get List from calculation.
     */
    private void showResultNormalizedOxygenUnits(Calculation calculation){
        lblSiNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(0)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblTiNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(1)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblAlNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(2)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCrNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(3)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFeNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(4)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblFeoNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(5)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMnNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(6)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblMgNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(7)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblCaNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(8)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblNaNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(9)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblKNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(10)).setScale(5, RoundingMode.HALF_UP).doubleValue());
        lblHNOU.setText("" + BigDecimal.valueOf(calculation.getNormalizedOxygenUnits().get(11)).setScale(5, RoundingMode.HALF_UP).doubleValue());
    }


}





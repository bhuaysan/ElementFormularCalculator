# Element Formular Calculator
Calculates the chemical formula from EMP or XRF data.

How it works:

Chemical analyses for silicate based minerals are commonly done in weight percentages of the oxides of the elements determined. Although the EMP or XRF shows their results in weight percentages the reason behind this is rather more historic. Hence, to get the chemical formula, the weight percentage may be converted in atoms per formula unit. This can be done in a few simple steps:

1. Division of the weight percentage of each oxide by the formula weight of that oxide.
2. Multiplication of the resulting "mole number" of each oxide by the number of oxygens in the oxide formula.
3. Multiplication of the resulting "oxygen number" of each oxide by normalization constant (equal to the number of oxygens in the desired formula (e.g. Diopside = 6) divided by the sum of the "oxygen numbers")
4. Multiplication of the "normalized oxygen numbers" of each oxide by the number of cations per oxygen in the oxide formula.

EMP does not differentiate between the valence states of iron which must be considered when analysing iron bearing minerals e.g. Pyroxene or Amphibole. 

This simple JavaFX App will help with the conversion. Just enter the results of the chemical analysis and the number of oxygen for the predicted mineral. The results are given in atoms per formula unit (apfu).



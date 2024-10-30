package dad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    Calculator calculator = new Calculator();

    @FXML
    private Button addButton;

    @FXML
    private Button buttonCero;

    @FXML
    private Button buttonEight;

    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonSeven;

    @FXML
    private Button buttonSix;

    @FXML
    private Button buttonThree;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button clearAllButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button divideButton;

    @FXML
    private Button equalButton;

    @FXML
    private Button floatButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private TextField numberTextField;

    @FXML
    private GridPane root;

    @FXML
    private Button substractButton;

    public RootController() {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/RootControllerView.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @FXML
    void onAddAction(ActionEvent event) {
        calculator.operar(Calculator.SUMAR);
    }

    @FXML
    void onClearAction(ActionEvent event) {
        calculator.borrar();
        numberTextField.setText(calculator.getPantalla());
    }

    @FXML
    void onClearAllAction(ActionEvent event) {
        calculator.borrarTodo();
        numberTextField.setText(calculator.getPantalla());
    }

    @FXML
    void onDigitAction(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();
        calculator.insertar(digit.charAt(0));
        numberTextField.setText(calculator.getPantalla());

    }

    @FXML
    void onDivideAction(ActionEvent event) {
        calculator.operar(Calculator.DIVIDIR);
    }

    @FXML
    void onEqualAction(ActionEvent event) {
        calculator.operar(Calculator.IGUAL);
        numberTextField.setText(calculator.getPantalla());
    }

    @FXML
    void onFloatAction(ActionEvent event) {
        calculator.insertarComa();
        numberTextField.setText(calculator.getPantalla());
    }

    @FXML
    void onMultiplyAction(ActionEvent event) {
        calculator.operar(Calculator.MULTIPLICAR);
    }

    @FXML
    void onSubstractAction(ActionEvent event) {
        calculator.operar(Calculator.RESTAR);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    // getters and setters

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public Button getButtonCero() {
        return buttonCero;
    }

    public void setButtonCero(Button buttonCero) {
        this.buttonCero = buttonCero;
    }

    public Button getButtonEight() {
        return buttonEight;
    }

    public void setButtonEight(Button buttonEight) {
        this.buttonEight = buttonEight;
    }

    public Button getButtonFive() {
        return buttonFive;
    }

    public void setButtonFive(Button buttonFive) {
        this.buttonFive = buttonFive;
    }

    public Button getButtonFour() {
        return buttonFour;
    }

    public void setButtonFour(Button buttonFour) {
        this.buttonFour = buttonFour;
    }

    public Button getButtonNine() {
        return buttonNine;
    }

    public void setButtonNine(Button buttonNine) {
        this.buttonNine = buttonNine;
    }

    public Button getButtonOne() {
        return buttonOne;
    }

    public void setButtonOne(Button buttonOne) {
        this.buttonOne = buttonOne;
    }

    public Button getButtonSeven() {
        return buttonSeven;
    }

    public void setButtonSeven(Button buttonSeven) {
        this.buttonSeven = buttonSeven;
    }

    public Button getButtonSix() {
        return buttonSix;
    }

    public void setButtonSix(Button buttonSix) {
        this.buttonSix = buttonSix;
    }

    public Button getButtonThree() {
        return buttonThree;
    }

    public void setButtonThree(Button buttonThree) {
        this.buttonThree = buttonThree;
    }

    public Button getButtonTwo() {
        return buttonTwo;
    }

    public void setButtonTwo(Button buttonTwo) {
        this.buttonTwo = buttonTwo;
    }

    public Button getClearAllButton() {
        return clearAllButton;
    }

    public void setClearAllButton(Button clearAllButton) {
        this.clearAllButton = clearAllButton;
    }

    public Button getClearButton() {
        return clearButton;
    }

    public void setClearButton(Button clearButton) {
        this.clearButton = clearButton;
    }

    public Button getDivideButton() {
        return divideButton;
    }

    public void setDivideButton(Button divideButton) {
        this.divideButton = divideButton;
    }

    public Button getEqualButton() {
        return equalButton;
    }

    public void setEqualButton(Button equalButton) {
        this.equalButton = equalButton;
    }

    public Button getFloatButton() {
        return floatButton;
    }

    public void setFloatButton(Button floatButton) {
        this.floatButton = floatButton;
    }

    public Button getMultiplyButton() {
        return multiplyButton;
    }

    public void setMultiplyButton(Button multiplyButton) {
        this.multiplyButton = multiplyButton;
    }

    public TextField getNumberTextField() {
        return numberTextField;
    }

    public void setNumberTextField(TextField numberTextField) {
        this.numberTextField = numberTextField;
    }

    public GridPane getRoot() {
        return root;
    }

    public void setRoot(GridPane root) {
        this.root = root;
    }

    public Button getSubstractButton() {
        return substractButton;
    }

    public void setSubstractButton(Button substractButton) {
        this.substractButton = substractButton;
    }
}

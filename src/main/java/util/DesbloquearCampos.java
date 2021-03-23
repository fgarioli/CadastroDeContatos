/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author Herbert
 */
public class DesbloquearCampos {

    public static void desbloqueiaCampo(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setEditable(true);
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setEditable(true);
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setEditable(true);
                area.setEnabled(true);
            } else if (component instanceof JComboBox) {
                JComboBox combo = (JComboBox) component;
                combo.setEnabled(true);
            } else if (component instanceof JTable) {
                JTable tabela = (JTable) component;
                tabela.setEnabled(true);
            } else if (component instanceof JXTable) {
                JXTable jXTabela = (JXTable) component;
                jXTabela.setEnabled(true);
            } else if (component instanceof JXDatePicker) {
                JXDatePicker dataPicker = (JXDatePicker) component;
                dataPicker.setEnabled(true);
            } else if (component instanceof JDateChooser) {
                JDateChooser dateChooser = (JDateChooser) component;
                dateChooser.setEnabled(true);
            } else if (component instanceof JRadioButton) {
                JRadioButton radioButton = (JRadioButton) component;
                radioButton.setEnabled(true);
            } else if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                checkBox.setEnabled(true);
            } else if (component instanceof Container) {
                desbloqueiaCampo((Container) component);
            }
        }
    }
}

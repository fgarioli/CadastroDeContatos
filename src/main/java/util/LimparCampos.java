/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.toedter.calendar.JDateChooser;
import com.towel.swing.table.ObjectTableModel;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.JXTable;

/**
 *
 * @author Fernando
 */
public class LimparCampos {

    public static void limpaCampo(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setText("");
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setText("");
            } else if (component instanceof JTextPane) {
                JTextPane jTextPane = (JTextPane) component;
                jTextPane.setText("");
            } else if (component instanceof JXDatePicker) {
                JXDatePicker dataPicker = (JXDatePicker) component;
                dataPicker.setDate(null);
            } else if (component instanceof JTable) {
                JTable tabela = (JTable) component;
                if (tabela.getModel() instanceof ObjectTableModel) {
                    ((ObjectTableModel)tabela.getModel()).clear();
                }
            } else if (component instanceof JXTable) {
                JXTable jXTable = (JXTable) component;
                if (jXTable.getModel() instanceof ObjectTableModel) {
                    ((ObjectTableModel)jXTable.getModel()).clear();
                }
                
          } else if (component instanceof JDateChooser) {
                JDateChooser dateChooser = (JDateChooser) component;
                dateChooser.setDate(null);
            } else if (component instanceof Container) {
                limpaCampo((Container) component);
            }
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.towel.bean.Formatter;



/**
 *
 * @author Fernando
 */
public class TelFormatter implements Formatter {

    @Override
    public Object format(Object o) {
        char[] telChar = o.toString().trim().toCharArray();
        String telFormatado = "(" + telChar[0] + telChar[1] + ") " + telChar[2] + telChar[3]
                + telChar[4] + telChar[5] + "-" + telChar[6] + telChar[7] + telChar[8] + telChar[9];
        return (Object) telFormatado;
    }

    @Override
    public Object parse(Object o) {
        return tiraMascara(o.toString());
    }

    @Override
    public String getName() {
        return "Telefone";
    }

    private String tiraMascara(String comMascara) {
        String semMascara;
        semMascara = comMascara.trim();
        semMascara = semMascara.replace("(", "");
        semMascara = semMascara.replace(")", "");
        semMascara = semMascara.replace("-", "");
        semMascara = semMascara.replace(" ", "");
        return semMascara;
    }
}

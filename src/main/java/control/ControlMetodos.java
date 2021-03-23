/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Fernando
 */
public class ControlMetodos {

    public static String mascaraTel(String tel) {
        tel = tel.replace(" ", "");
        if (tel.length() == 10) {
            char[] telChar = tel.toCharArray();
            String telFormatado = "(" + telChar[0] + telChar[1] + ") " + telChar[2] + telChar[3]
                    + telChar[4] + telChar[5] + "-" + telChar[6] + telChar[7] + telChar[8] + telChar[9];
            return telFormatado;
        }
        return null;
    }

    public static String mascaraCep(String cep) {
        if (cep.trim().length() == 8) {
            char[] cepChar = cep.toString().trim().toCharArray();
            String cepFormat = cepChar[0] + cepChar[1] + "."
                    + cepChar[2] + cepChar[3] + cepChar[4] + "-" + cepChar[5] + cepChar[6] + cepChar[7];
            return cepFormat;
        }
        return null;
    }

    public static String mascaraCpf(String cpf) {
        if (cpf.trim().length() == 11) {
            char[] cpfChar = cpf.toString().trim().toCharArray();
            String cpfFormat = cpfChar[0] + cpfChar[1] + cpfChar[2] + "."
                    + cpfChar[3] + cpfChar[4] + cpfChar[5] + "."
                    + cpfChar[6] + cpfChar[7] + cpfChar[8] + "-"
                    + cpfChar[9] + cpfChar[10];
            return cpfFormat;
        }
        return null;
    }

    public static String tiraMascaraCpf(String comMascara) {
        if (comMascara.length() != 0) {
            String cpf = comMascara;
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            cpf = cpf.trim();

            return cpf;
        }
        return null;

    }

    public static String tiraMascaraTel(String comMascara) {
        if (comMascara.length() != 0) {
            String tel = comMascara;
            tel = tel.replace("(", "");
            tel = tel.replace(")", "");
            tel = tel.replace("-", "");
            tel = tel.trim();

            return tel;
        }
        return null;
    }

    public static String tiraMascaraCep(String comMascara) {
        if (comMascara.length() != 0) {
            String cep = comMascara;
            cep = cep.replace(".", "");
            cep = cep.replace("-", "");
            cep = cep.trim();

            return cep;
        }
        return null;
    }

    public static String tiraMascaraRg(String comMascara) {
        if (comMascara.length() != 0) {
            String rg = comMascara;
            rg = rg.trim();
            rg = rg.replace(".", "");

            return rg;
        }
        return null;
    }

    public static Date getDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNasc = new Date();
            dataNasc = sdf.parse(date);
            return dataNasc;
        } catch (ParseException ex) {
            Logger.getLogger(ControlMetodos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8D48C269-3553-D747-EBC3-3C8C2F7629C2]
    // </editor-fold> 
    public static Date somarData(Date data, int dias) {
        Date dataSoma = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        calendario.add(Calendar.DATE, dias);
        dataSoma = calendario.getTime();
        return dataSoma;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.741B603D-846D-23E3-F89D-8026208A7097]
    // </editor-fold> 
    public static String formatarTel(String tel) {
        char[] telChar = tel.trim().toCharArray();
        String telFormatado = "(" + telChar[0] + telChar[1] + ") " + telChar[3] + telChar[4]
                + telChar[5] + telChar[6] + "-" + telChar[7] + telChar[8] + telChar[9] + telChar[10];
        return telFormatado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB67065D-4A97-EFD4-12D9-EE4418846ECA]
    // </editor-fold> 
    public static boolean ehNumero(String n) {
        if (n.matches("^[0-9]*$")) {
            return true;
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DE7B3CD0-FE53-3B87-C11F-140658996828]
    // </editor-fold> 
    public static boolean ehData(String data) {
        Pattern p = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        Matcher m = p.matcher(data);
        if (m.find()) {
            return true;
        }
        return false;
    }
    
}

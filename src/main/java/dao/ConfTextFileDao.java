package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3424727B-5BBC-EA01-B9BF-264F50DBD2D2]
// </editor-fold> 
public class ConfTextFileDao implements ConfDao {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28010AA3-7C7F-A7BD-9463-DF437944ED73]
    // </editor-fold> 
    public ConfTextFileDao() {
    }

    @Override
    public boolean alterarIP(String ip) {
        try {
            File file = new File("ip_banco.txt");

            // Apagando conteúdo do arquivo
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(0);
            randomAccessFile.close();

            // Escrevendo no arquivo
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(ip);
            bufferedWriter.close();

            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfTextFileDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(ConfTextFileDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public String selecionarIP() {
        try {
            File fil = new File("ip_banco.txt");
            Scanner scan = new Scanner(fil);

            String layout;
            layout = scan.next();

            System.out.println(layout);
            scan.close();

            return layout;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConfTextFileDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

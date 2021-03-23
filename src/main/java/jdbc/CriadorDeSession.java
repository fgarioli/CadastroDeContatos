/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import control.Control;
import domain.Cidade;
import domain.Contato;
import domain.Usuario;
import java.sql.SQLException;
import org.h2.tools.Server;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Newcolor
 */
public class CriadorDeSession {

    private static Server server;

    public static void stopDatabase() {
        server.stop();
    }

    public static Session getSession() {
        try {
            String ip = Control.selecionarIP();
            AnnotationConfiguration configuration = new AnnotationConfiguration();

            // Propriedades do banco
            if ("localhost".equals(ip)) { // setando ip de acordo com as configurações cliente ou servidor
                /* exemplo de argumentos na inicialização do servidor
                final String[] args = new String[]{
                    "-tcpPort", "8092",
                    "-tcpAllowOthers", "true"};

                    org.h2.tools.Server server = org.h2.tools.Server.createTcpServer(args).start();
                 */
//                configuration.setProperty("hibernate.connection.url", "jdbc:h2:" + System.getProperty("user.dir") + "/contatosDB");
//                configuration.setProperty("hibernate.connection.url", "jdbc:h2:C:/dist/contatosDB;AUTO_SERVER=TRUE");
                configuration.setProperty("hibernate.connection.url", "jdbc:h2:" + System.getProperty("user.dir") + "/contatosDB;AUTO_SERVER=TRUE");
                server = Server.createTcpServer("-tcpAllowOthers").start();
                Control.setServerMode(true);
            } else {
                configuration.setProperty("hibernate.connection.url", "jdbc:h2:tcp://" + ip + "/C:/dist/contatosDB");
                Control.setServerMode(false);
            }

            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
            configuration.setProperty("hibernate.connection.driver_class", "org.h2.Driver");
            configuration.setProperty("hibernate.connection.username", "admin");
            configuration.setProperty("hibernate.connection.password", "admin");
            configuration.setProperty("hibernate.hbm2ddl.auto", "update");
            configuration.setProperty("show_sql", "true");
            configuration.setProperty("format_sql", "true");

            // Classes de dominio mapeadas
            configuration.addAnnotatedClass(Contato.class);
            configuration.addAnnotatedClass(Cidade.class);
            configuration.addAnnotatedClass(Usuario.class);

            // Lê o hibernate.cfg.xml
            configuration.configure();
            SessionFactory factory = configuration.buildSessionFactory();
            Session session = factory.openSession();
            return session;
        } catch (SQLException | HibernateException ex) {
            // Log the exception.
            System.err.println("Falha tcp server" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}

package Persistence.VitalSign;

import java.sql.Connection;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.derby.jdbc.EmbeddedDataSource;

/**
 *
 * @author Daniel
 * @author Eduardo
 * @author Leandro
 */
public class StartDBDataSource {

    public static String DB_CONN_STRING_CREATE = "jdbc:derby:healthcare;create=true";
    public static String DB_NAME = "healthcare";
    public static String USER_NAME = "healthcare";
    public static String PASSWORD = "healthcare";
    private static DataSource dataSource;

    private static DataSource criarDataSource() throws Exception {
        if (dataSource == null) {
            EmbeddedDataSource ds = new EmbeddedDataSource();
            ds.setDatabaseName(DB_NAME);
            ds.setCreateDatabase("create");
            ds.setUser(USER_NAME);
            ds.setPassword(PASSWORD);
            dataSource = ds;
        }
        return dataSource;
    }

    public static void criarBd() throws Exception {
        try (Connection conexao = criarDataSource().getConnection()) {
            //Criando tabela
            String sql
                    = "CREATE TABLE vitalsign("
                    + "cod int NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                    + "patient int NOT NULL,"
                    + "respiratoryRate int NOT NULL,"
                    + "heartRate int NOT NULL,"
                    + "bloodPressure int NOT NULL,"
                    + "weight int NOT NULL,"
                    + "timestamp varchar(100) NOT NULL,"
                    + "statusReport varchar(100) NOT NULL)";

            try (Statement comando = conexao.createStatement()) {
                comando.executeUpdate(sql);
            }
            System.out.println("Criado");
        }
    }

    public static Connection conectarBd() throws Exception {
        return criarDataSource().getConnection();
    }
}

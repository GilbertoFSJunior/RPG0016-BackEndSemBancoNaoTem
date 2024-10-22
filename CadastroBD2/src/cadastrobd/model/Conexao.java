/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=loja;encrypt=true;trustServerCertificate=true; "; // Defina a URL do seu banco de dados
        String user = "loja";  // Substitua pelo seu usuário
        String password = "loja";  // Substitua pela sua senha
        return DriverManager.getConnection(url, user, password);
    }
}

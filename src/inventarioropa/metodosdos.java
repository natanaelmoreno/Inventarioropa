
package inventarioropa;

import java.sql.ResultSet;

public class metodosdos {
    conexion cn = new conexion();
      
      public ResultSet llenarArticulos() {
        return (cn.getValores("SELECT desarticulo FROM inventario"));
    }
   
    public ResultSet llenarMateriales() {
        return (cn.getValores("SELECT desmaterial FROM material"));
    }
      
    public ResultSet llenarMarcas() {
        return (cn.getValores("SELECT descripcionmarca FROM marca"));
    }
    
    public ResultSet llenarTallas() {
        return (cn.getValores("SELECT descripciontalla FROM talla"));
    }
      
    public ResultSet llenarPaises() {
        return (cn.getValores("SELECT descripcionpais FROM pais"));
    }
}

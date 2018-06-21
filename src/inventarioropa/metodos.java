
package inventarioropa;

import java.sql.ResultSet;

public class metodos {
    conexion cn=new conexion();
    
    
    
    public void insertar(String codigo,String articulo){
    cn.UID("INSERT INTO articulo(codarticulo,descripcion) VALUES ('" + codigo + "','" + articulo + "')"); 
    }
 public void modificar(String codigo, String articulo) {
        cn.UID("UPDATE articulo SET descripcion='" + articulo + "' WHERE codarticulo=" + codigo  ); 
    }
     public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codarticulo) FROM articulo"));
    }
    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(codarticulo) FROM articulo"));
    }
    public void eliminar(String articulo) {
        cn.UID("DELETE FROM articulo WHERE descripcion='" + articulo + "'");
    }
    public ResultSet buscar(String codigo) {
        return (cn.getValores("SELECT * FROM articulo WHERE codarticulo='" + codigo + "'"));
    }
    
    
    
     
    
  
    
    public void insertar2(String codigo,String material){
    cn.UID("INSERT INTO material(codmaterial,descripcion) VALUES ('" + codigo + "','" + material + "')"); 
    }
 public void modificar2(String codigo, String material) {
         cn.UID("UPDATE material SET descripcion='" + material + "' WHERE codmaterial=" + codigo  ); 
    }
    public ResultSet contarRegistros2() {
        return (cn.getValores("SELECT COUNT(codmaterial) FROM material"));
    }
    public ResultSet mayorRegistro2() {
        return (cn.getValores("SELECT MAX(codmaterial) FROM material"));
    }
    public void eliminar2(String material) {
        cn.UID("DELETE FROM material WHERE descripcion='" + material + "'");
    }
    public ResultSet buscar2(String codigo) {
        return (cn.getValores("SELECT * FROM material WHERE codmaterial='" + codigo + "'"));
    }
    
    
    
     public void insertar3(String codigo,String marca){
    cn.UID("INSERT INTO marca(codmarca,descripcion) VALUES ('" + codigo + "','" + marca+ "')"); 
    }
 public void modificar3(String codigo, String marca) {
        cn.UID("UPDATE marca SET descripcion='" + marca + "' WHERE codmarca=" + codigo  ); 
    }
    public ResultSet contarRegistros3() {
        return (cn.getValores("SELECT COUNT(codmarca) FROM marca"));
    }
    public ResultSet mayorRegistro3() {
        return (cn.getValores("SELECT MAX(codmarca) FROM marca"));
    }
    public void eliminar3(String marca) {
        cn.UID("DELETE FROM marca WHERE descripcion='" + marca + "'");
    }
   public ResultSet buscar3(String codigo) {
        return (cn.getValores("SELECT * FROM marca WHERE codmarca='" + codigo + "'"));
    }

    
    
    
    
    
 
    
    
    
    
     public void insertar5(String codigo,String talla){
    cn.UID("INSERT INTO talla(codtalla,descripcion) VALUES ('" + codigo + "','" + talla + "')"); 
    }
 public void modificar5(String codigo, String talla) {
        cn.UID("UPDATE talla SET descripcion='" + talla + "' WHERE codtalla=" + codigo  ); 
    }
    public ResultSet contarRegistros5() {
        return (cn.getValores("SELECT COUNT(codtalla) FROM talla"));
    }
    public ResultSet mayorRegistro5() {
        return (cn.getValores("SELECT MAX(codtalla) FROM talla"));
    }
    public void eliminar5(String talla) {
        cn.UID("DELETE FROM talla WHERE descripcion='" + talla + "'");
    }
    public ResultSet buscar5(String codigo) {
        return (cn.getValores("SELECT * FROM talla WHERE codtalla='" + codigo + "'"));
    }
    
    
    
    
     public void insertar6(String codigo,String pais){
    cn.UID("INSERT INTO pais(codpais,descripcion) VALUES ('" + codigo + "','" + pais + "')"); 
    }
 public void modificar6(String codigo, String pais) {
         cn.UID("UPDATE pais SET descripcion='" + pais + "' WHERE codpais=" + codigo  ); 
    }
    public ResultSet contarRegistros6() {
        return (cn.getValores("SELECT COUNT(codpais) FROM pais"));
    }
    public ResultSet mayorRegistro6() {
        return (cn.getValores("SELECT MAX(codpais) FROM pais"));
    }
    public void eliminar6(String pais) {
        cn.UID("DELETE FROM pais WHERE descripcion='" + pais + "'");
    }
    public ResultSet buscar6(String codigo) {
        return (cn.getValores("SELECT * FROM pais WHERE codpais='" + codigo + "'"));
    }
    
    
    
    public void insertar7(String codigo,String articulo ,int material ,int marca ,int talla, int pais,int existencias) {
        cn.UID("INSERT INTO inventario(codarticulo,desarticulo,codmaterial,codmarca,codtalla,codpais,existencias) VALUES('" + codigo + "','" + articulo + "','" + material + "','" + marca + "','" + talla + "','" + pais + "','" + existencias + "')");
    }
    public ResultSet contarRegistros7() {
        return (cn.getValores("SELECT COUNT(codarticulo) FROM inventario"));
    }
    public ResultSet mayorRegistro7() {
        return (cn.getValores("SELECT MAX(codarticulo) FROM inventario"));
    }
   public void modificar7(String codigo,String articulo,int material ,int marca ,int talla,int pais,int existencias){
          cn.UID("Update inventario set codarticulo='"+codigo+"',desarticulo ='"+articulo+"',codmarca ='"+marca+"' ,codtalla ='"+talla+"', codpais='"+pais+"', codmaterial ='"+material+"',existencias ='"+existencias+"' WHERE codarticulo=" + codigo  );
   }
   
   public void modificar8(String codigo, String pais) {
         cn.UID("UPDATE pais SET descripcion='" + pais + "' WHERE codpais=" + codigo  ); 
    }
   
   
   
    public ResultSet buscar7(String codigo) {
        return (cn.getValores("SELECT * FROM inventario WHERE codarticulo='" + codigo + "'"));
}
    
    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codarticulo,desarticulo,codmaterial,codmarca,codtalla,codpais,existencias FROM inventario"));
    }
    public void eliminarbueno(String codigo) {
        cn.UID("DELETE FROM inventario WHERE codarticulo='" + codigo + "'");
    }
  
   
}

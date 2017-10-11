/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_diagram;



/**
 *
 * @author Ân
 */
public class Class_Diagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String noiDung = DocFile.ReadFile("D:\\docu\\OOP\\scode OOP\\phanSo\\src\\phanso\\PhanSo.java");
//        System.out.println(noiDung);
//        DocFolder d = new DocFolder();
//        
//        d.readProject("C:\\Users\\Ân\\eclipse-workspace\\maxNuber\\src\\maxNuber");
        
        String noiDung = DocFolder.readProject("C:\\Users\\Ân\\eclipse-workspace\\maxNuber\\src\\maxNuber");
        System.out.println(noiDung);
        System.out.println(ChuanHoaXau.ChuanHoa(noiDung));

 //           File fi = new File ("C:\\\\Users\\\\Ân\\\\eclipse-workspace\\\\maxNuber\\\\src\\\\maxNuber");
            
    }
    
}

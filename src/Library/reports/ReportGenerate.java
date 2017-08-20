/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.reports;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import MainInterface.DBconnect;
/**
 *
 * @author Dell
 */
public class ReportGenerate {
    public ReportGenerate(String report){
        toPDF(report);
    }
    
    public void toPDF(String report){
        try {        
            Connection con = DBconnect.connect();
            JasperReport jasperReport = null;
            InputStream path=this.getClass().getResourceAsStream(report);    
            JasperPrint jasperPrint = null;
            jasperReport = JasperCompileManager.compileReport(path);
            HashMap parameters = new HashMap();
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);
            JasperViewer.viewReport(jasperPrint,false);
        }
        catch(JRException ex) {
            System.out.println("jasper error" + ex.getMessage());
        }
    }
    
}

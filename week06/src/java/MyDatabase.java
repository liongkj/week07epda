
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import model.SE2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tp034196
 */
public class MyDatabase implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) { //when server is deployed
        ServletContext context = sce.getServletContext();
        List<SE2> source = null;
        String filename = "/WEB-INF/Student.dat";
        InputStream is = context.getResourceAsStream(filename);
        if (is != null) {
            try {
                ObjectInputStream objectInputFile = new ObjectInputStream(is);
                source = (List) (objectInputFile.readObject());
            } catch (Exception e) {
                System.out.println("Input Error !");
            }
            if (source == null) {
                source = new ArrayList<SE2>();
                System.out.println("No data!");
            } else {
                System.out.println("Data Retrieved!");
            }
            Iterator student = source.iterator();
            while (student.hasNext()) {
                SE2 s = (SE2) student.next();
                System.out.println(s.getName() + "\t" + s.getPassword() + "\t" + s.getBalance());
            }

        } else {
            source = new ArrayList<SE2>();
            System.out.println("New File!");
        }
        context.setAttribute("data", source);
        System.out.println("BinaryFile ServletContextListener started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) { // when server is closed
        ServletContext context = sce.getServletContext();
        List source = (List) context.getAttribute("data");
        try {
            System.out.println("Printing data!");
            Iterator student = source.iterator();
            while (student.hasNext()) {
                SE2 s = (SE2) student.next();
                System.out.println(s.getName() + "\t" + s.getPassword() + "\t" + s.getBalance());
            }
        
        File outputFile = new File(context.getRealPath("/") + "WEB-INF/Student.dat");
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(new FileOutputStream(outputFile));
        objectOutputFile.writeObject(source);
        System.out.println("DONE");
        objectOutputFile.close();
    }
    catch(Exception e){
            System.out.println("Output error");
    }
        System.out.println("ServletContextListener destroyed");
}
}


import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        URL url = new URL( " C:\UsersOrlan\figuras\Downloads\archivosvg.svg");
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        Listas handler= new Listas();
        try (var br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            saxParser.parse(url.openStream(),handler);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
        List<Rectangle> rectangles =handler.getRectangles();

        List<Circle>circles=handler.getCircles();

        List<Elipse>elipses=handler.getElipses();

        List<Line> lines =handler.getLineas();

        List<Text>texts=handler.getTexts();


        Panel panel= new Panel(rectangles,circles,elipses, lines,texts);


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window v =new Window();
                v.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                v.add(panel);
                v.setSize(1200,1000);
                v.setVisible(true);
            }
        });
    }
}
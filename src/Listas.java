import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class Listas extends DefaultHandler {
    List<Rectangle> rectangles=new ArrayList<>();
    List<Circle> circles =new ArrayList<>();
    List<Elipse> elipses=new ArrayList<>();
    List<Line> lines =new ArrayList<>();
    List<Text> texts =new ArrayList<>();

    Text txt= new Text();
    boolean onText;
    StringBuilder writer = new StringBuilder();


    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("rect")){
            Rectangle r= new Rectangle();
            r.setX(Double.parseDouble(attributes.getValue("x")));

            r.setY(Double.parseDouble(attributes.getValue("y")));

            r.setWidth(Double.parseDouble(attributes.getValue("width")));

            r.setHeight(Double.parseDouble(attributes.getValue("height")));

            r.setStrokeWidth(Double.parseDouble(attributes.getValue("stroke-width")));

            r.setStroke(attributes.getValue("stroke"));

            r.setFill(attributes.getValue("fill"));

            rectangles.add(r);
        }
        if (qName.equalsIgnoreCase("circle")){
            Circle c= new Circle();
            c.setCx(Double.parseDouble(attributes.getValue("cx")));

            c.setCy(Double.parseDouble(attributes.getValue("cy")));

            c.setR(Double.parseDouble(attributes.getValue("r")));

            c.setStrokeWidth(Double.parseDouble(attributes.getValue("stroke-width")));

            c.setStroke(attributes.getValue("stroke"));

            c.setFill(attributes.getValue("fill"));
            circles.add(c);
        }
        if (qName.equalsIgnoreCase("ellipse")){
            Elipse e= new Elipse();
            e.setCx(Double.parseDouble(attributes.getValue("cx")));

            e.setCy(Double.parseDouble(attributes.getValue("cy")));

            e.setRx(Double.parseDouble(attributes.getValue("rx")));

            e.setRy(Double.parseDouble(attributes.getValue("ry")));

            e.setStrokeWidth(Double.parseDouble(attributes.getValue("stroke-width")));

            e.setStroke(attributes.getValue("stroke"));

            e.setFill(attributes.getValue("fill"));
            elipses.add(e);
        }
        if(qName.equalsIgnoreCase("line")){
            Line l= new Line();
            l.setX1(Double.parseDouble(attributes.getValue("x1")));

            l.setX2(Double.parseDouble(attributes.getValue("x2")));

            l.setY1(Double.parseDouble(attributes.getValue("y1")));

            l.setY2(Double.parseDouble(attributes.getValue("y2")));

            l.setStrokeWidth(Double.parseDouble(attributes.getValue("stroke-width")));

            l.setStroke(attributes.getValue("stroke"));
            lines.add(l);
        }
        if (qName.equalsIgnoreCase("text")){
            onText =true;

            txt =new Text();

            txt.setX(Double.parseDouble(attributes.getValue("x")));

            txt.setY(Double.parseDouble(attributes.getValue("y")));

            txt.setFontsize(Double.parseDouble(attributes.getValue("font-size")));

            txt.setFontfamily(attributes.getValue("font-family,"));

            texts.add(txt);

        }


    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        onText =false;
        txt.setText(writer.toString());
        writer =new StringBuilder();
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        writer.append(ch,start,length);
    }

    public List<Rectangle> getRectangles() {
        return rectangles;
    }

    public List<Circle> getCircles() {
        return circles;
    }

    public List<Elipse> getElipses() {
        return elipses;
    }

    public List<Line> getLineas() {
        return lines;
    }

    public List<Text> getTexts() {
        return texts;
    }
}
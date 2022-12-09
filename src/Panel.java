
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Panel extends JPanel {
    List<Rectangle>rectangles;
    List<Circle>circules;
    List<Elipse>elipses;
    List<Line>lines;
    List<Text>texts;

    public Panel (
            List<Rectangle> rectangulos,
            List<Circle> circulos,
            List<Elipse>elipses,
            List<Line> lineas,
            List<Text> texts
    ){
        this.rectangles=rectangles;
        this.circules=circules;
        this.elipses=elipses;
        this.lines=lines;
        this.texts=texts;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D graficos = (Graphics2D) g;
        dibujar(graficos);
    }
    public void dibujar(Graphics2D graficos){
        drawRectangles(graficos);
        drawCircles(graficos);
        drawElipses(graficos);
        makeLines(graficos);
        drawTexts(graficos);
    }

    private void drawRectangles(Graphics2D pincel) {
        for(Rectangle r: rectangles){
            Color color= cColor(r.getFill());
            pincel.setColor(color);
            pincel.fillRect(r.getX(),r.getY(),r.getWidth(),r.getHeight());
            pincel.setStroke(new BasicStroke(r.getStrokeWidth()));
            Color colorBorde= cColor(r.getStroke());
            pincel.setColor(colorBorde);
            pincel.drawRect(r.getX(),r.getY(),r.getWidth(),r.getHeight());
        }
    }
    private void drawCircles(Graphics2D pincel) {
        for(Circle c:circules){
            Color color= cColor(c.getFill());
            pincel.setColor(color);
            pincel.fillOval(c.getCx()-c.getR(),c.getCy()-c.getR(),c.getR()*2,c.getR()*2);
            pincel.setStroke(new BasicStroke(c.getStrokeWidth()));
            Color colorBorde= cColor(c.getStroke());
            pincel.setColor(colorBorde);
            pincel.drawOval(c.getCx()-c.getR(),c.getCy()-c.getR(),c.getR()*2,c.getR()*2);


        }
    }

    private void drawElipses(Graphics2D pincel){
        for(Elipse e:elipses){
            Color color= cColor(e.getFill())
                    ;
            pincel.setColor(color);
            
            pincel.fillOval(e.getCx()-e.getRx(),e.getCy()-e.getRy(),e.getRx()*2,e.getRy()*2);
            pincel.setStroke(new BasicStroke(e.getStrokeWidth()));
            
            Color colorBorde= cColor(e.getStroke());
            
            pincel.setColor(colorBorde);
            pincel.drawOval(e.getCx()-e.getRx(),e.getCy()-e.getRy(),e.getRx()*2,e.getRy()*2);
        }
    }

    private void makeLines(Graphics2D pincel){
        for (Line l:lines){
            Color color= cColor(l.getStroke());
            
            pincel.setColor(color);
            
            pincel.setStroke(new BasicStroke(l.getStrokeWidth()));
            pincel.drawLine(l.getX1(),l.getY1(),l.getX2(),l.getY2());
        }
    }

    private void drawTexts(Graphics2D pincel){
        for (Text t:texts){
            Font font=new Font(t.getFontfamily(),Font.PLAIN,t.getFontsize());
            pincel.setFont(font);
            pincel.drawString(t.getText(),t.getX(),t.getY());
        }
    }
    private Color cColor(String fill) {
        if(fill.contains("#")){
            return Color.decode(fill.trim());
        }
        return  Color.GREEN;
    }


}

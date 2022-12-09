public class Text {
    double x, y, fontsize;
    String fontfamily, text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getX() {
        return (int) x;
    }

    public int getY() {
        return (int) y;
    }

    public int getFontsize() {
        return (int) fontsize;
    }

    public String getFontfamily() {
        return fontfamily;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setFontsize(double fontsize) {
        this.fontsize = fontsize;
    }

    public void setFontfamily(String fontfamily) {
        this.fontfamily = fontfamily;
    }

    @Override
    public String toString() {
        return "Texto{" + "x=" + x + ", y=" + y +
                ", FontSize=" + fontsize +
                ", FontFamily='" + fontfamily + '\'' + '}';
    }
}